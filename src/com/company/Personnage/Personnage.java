package com.company.Personnage;

import com.company.Arme.Arme;
import com.company.Arme.Epee;
import com.company.Potion.Potion;

public abstract class Personnage {
    protected String nom;
    protected int niveauVie;
    protected int forceAttaque;
    protected Arme arme = new Arme();

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

    public Personnage() {
        this.nom = "Inconnu";
    }

    public Personnage(String pNom) {
        this.nom = pNom;
    }

    public Personnage(String pNom, int pNiveauVie, int pForceAttaque) {
        this.nom = pNom;
        this.niveauVie = pNiveauVie;
        this.forceAttaque = pForceAttaque;
    }

    public void setArme(int arme) {
        this.forceAttaque = forceAttaque + arme;
    }

    public void setPotion(int potion) {
        this.niveauVie = this.niveauVie + potion;
    }

}
