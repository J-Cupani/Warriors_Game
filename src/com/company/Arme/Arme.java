package com.company.Arme;

import com.company.Plateau.Case;

public class Arme extends Case {


    protected String nomArme;
    protected int forceArme;

    public String getNomArme() {
        return nomArme;
    }

    public int getForceArme() {
        return forceArme;
    }

    public void setForceArme(int forceArme) {
        this.forceArme = forceArme;
    }

    public void setNomArme(String nomArme) {
        this.nomArme = nomArme;
    }

    public Arme() {
        this.nomArme = "Arme";
        this.forceArme = 0;
    }

    public Arme(String pNomArme, int pForceArme) {
        this.nomArme = pNomArme;
        this.forceArme = pForceArme;
    }

    public int addPuissance(){
        return this.forceArme;
    }

    @Override
    public String toString() {
        return "Arme: '" + nomArme + '\'' +
                ", Puissance: " + forceArme;
    }

}
