package com.paugonzalezmarti.www.cardviewactiviatat;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.EsportViewHolder> {

    ArrayList<Esport> esports;

    public Adaptador(ArrayList<Esport> esports) {
        this.esports = esports;
    }

    @NonNull
    @Override
    public EsportViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.carditem, viewGroup, false);
        EsportViewHolder evh = new EsportViewHolder(v);
        return evh;    }

    @Override
    public void onBindViewHolder(@NonNull EsportViewHolder personViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return esports.size();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class EsportViewHolder extends RecyclerView.ViewHolder {
            CardView cv;
            TextView titol;
            TextView entitat;
            TextView recompte;
            ImageView foto;

            EsportViewHolder(View itemView) {
                super(itemView);
                cv = (CardView)itemView.findViewById(R.id.card_view);
                foto = (ImageView)itemView.findViewById(R.id.ivFotoCard);
                titol = (TextView)itemView.findViewById(R.id.tvTitulo);
                entitat = (TextView)itemView.findViewById(R.id.tvNomParthner);
                recompte = (TextView)itemView.findViewById(R.id.tvNumClubs);


            }


    }
}
