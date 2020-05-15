package com.company.Monstre;
import com.company.Plateau.Case;

public class Monstre extends Case {
    protected String nom;
    protected int niveauVie;
    protected int forceAttaque;

    //************* GETTER *************

    public String getNom() {
        return nom;
    }

    public int getNiveauVie() {
        return niveauVie;
    }

    public int getForceAttaque() {
        return forceAttaque;
    }

    //************* SETTER *************

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNiveauVie(int niveauVie) {
        this.niveauVie = niveauVie;
    }

    public void setForceAttaque(int forceAttaque) {
        this.forceAttaque = forceAttaque;
    }

    //************* SETTER *************

    public Monstre() {
        this.nom = "Monstre";
        this.niveauVie = 0;
        this.forceAttaque = 0;
    }

    @Override
    public String toString() {
        return "{ " + nom +
                ", Vie[" + niveauVie +
                "] , Force d'attaque[" + forceAttaque +
                "] }";
    }
}
