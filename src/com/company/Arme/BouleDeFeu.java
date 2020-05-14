package com.company.Arme;

public class BouleDeFeu extends Arme {
    public BouleDeFeu() {
        this.nomArme = "Boule de feu";
        this.forceArme = 7;
    }

    public BouleDeFeu(String pNomArme, int pForceArme) {
        super(pNomArme, pForceArme);
    }

    @Override
    public String toString() {
        return "Boule de feu:" +
                "nomArme='" + nomArme + '\'' +
                ", forceArme=" + forceArme;
    }
}
