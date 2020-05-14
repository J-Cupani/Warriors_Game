package com.company.Arme;

public class Eclair extends Arme{
    public Eclair() {
        this.nomArme = "Eclair";
        this.forceArme = 2;
    }

    public Eclair(String pNomArme, int pForceArme) {
        super(pNomArme, pForceArme);
    }

    @Override
    public String toString() {
        return "Eclair:" +
                "nomArme='" + nomArme + '\'' +
                ", forceArme=" + forceArme;
    }
}
