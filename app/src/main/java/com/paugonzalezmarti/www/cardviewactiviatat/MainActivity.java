package com.paugonzalezmarti.www.cardviewactiviatat;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv = findViewById(R.id.my_recycler_view);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),3);
        rv.setLayoutManager(gridLayoutManager);

        ArrayList<Esport> deportes = new ArrayList();
        try{
            String arxiu = Environment.getExternalStorageState() + "/Esports/esports.txt";
            String titol = null;
            String nom = null;
            String entitat = null;
            int recompte = 0;

            FileReader f = new FileReader(arxiu);
            BufferedReader br = new BufferedReader(f);
            do{
                String comunitat = br.readLine();

                StringTokenizer st = new StringTokenizer(comunitat);
                while (st.hasMoreTokens()) {
                    String[] result = st.nextToken().split(":");

                    titol = result[0];
                    nom = result[1];
                    entitat = result[2];
                    recompte = Integer.parseInt(result[3]);
                    int imatge;
                    String imatges = "Esports/img/" + nom + ".png";
                    FileReader fr = new FileReader(imatges);
                    BufferedReader ibr = new BufferedReader(fr);
                    do{
                        imatge = Integer.parseInt(br.readLine());
                    }while(ibr.readLine()!=null);
                    ibr.close();

                    String equips = "Esports/equips/" + nom + ".txt";
                    FileReader efr = new FileReader(equips);
                    BufferedReader ebr = new BufferedReader(efr);
                    ArrayList<String> llista = new ArrayList<String>();
                    do{

                        llista.add(br.readLine());

                    }while(ebr.readLine()!=null);
                    ebr.close();

                    Esport c = new Esport(imatge,titol,entitat,recompte,llista);
                    deportes.add(c);
                }

            }while(br.readLine()!=null);
            f.close();
            br.close();
            //Un cop recuperades les dades les apliquem amb el adaptador
            Adaptador adapter = new Adaptador(deportes);
            rv.setAdapter(adapter);
            rv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Aqui obrirem el nou element
                }
            });
        }catch(IOException e){

        }

    }
}
