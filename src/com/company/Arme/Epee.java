package com.company.Arme;

public class Epee extends Arme {

    public Epee() {
        this.nomArme = "Epee";
        this.forceArme = 5;
    }

    public Epee(String pNomArme, int pForceArme) {
        super(pNomArme, pForceArme);
    }

    @Override
    public String toString() {
        return "Epee:" +
                "nomArme='" + nomArme + '\'' +
                ", forceArme=" + forceArme;
    }

}
