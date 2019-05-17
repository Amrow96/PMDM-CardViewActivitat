package com.paugonzalezmarti.www.cardviewactiviatat;

import java.util.ArrayList;

public class Esport {
    private int foto;
    private String titol;
    private String banc;
    private int recompte;
    private ArrayList<String> llista;

    public Esport(int foto, String titol, String banc, int recompte, ArrayList<String> llista) {
        this.foto = foto;
        this.titol = titol;
        this.banc = banc;
        this.recompte = recompte;
        this.llista = llista;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getBanc() {
        return banc;
    }

    public void setBanc(String banc) {
        this.banc = banc;
    }

    public int getRecompte() {
        return recompte;
    }

    public void setRecompte(int recompte) {
        this.recompte = recompte;
    }

    public ArrayList<String> getLlista() {
        return llista;
    }

    public void setLlista(ArrayList<String> llista) {
        this.llista = llista;
    }

    @Override
    public String toString() {
        return "Esport{" +
                "foto=" + foto +
                ", titol='" + titol + '\'' +
                ", banc='" + banc + '\'' +
                ", recompte=" + recompte +
                ", llista=" + llista +
                '}';
    }
}

