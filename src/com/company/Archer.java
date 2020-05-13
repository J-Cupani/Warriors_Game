package com.company;

public class Archer {
    private String nom;
    private int niveaudevie;

    public void setNom(){
        this.nom = nom;
    }
    public String getNom(){
        return this.nom;
    }

    public Archer() {
        this.nom = "jo";
        this.niveaudevie = 3;
    }

    @Override
    public String toString() {
        return "Archer{" +
                "nom='" + nom + '\'' +
                ", niveaudevie=" + niveaudevie +
                '}';
    }
}
