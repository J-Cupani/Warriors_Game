package com.company.Personnage;

public class Guerrier extends Personnage {

    public Guerrier() {
        super();
        this.niveauVie = 5;
        this.forceAttaque = 5;
    }

    public Guerrier(String pNom) {
        super(pNom);
        this.niveauVie = 5;
        this.forceAttaque = 5;
    }

    public Guerrier(String pNom, int pNiveauVie, int pForceAttaque) {
        super(pNom, pNiveauVie, pForceAttaque);
    }

    @Override
    public String toString() {
        return "Guerrier: [" +
                "nom='" + nom + '\'' +
                ", niveauVie=" + niveauVie +
                ", forceAttaque=" + forceAttaque +
                ", " + setArme() +
                ']';
    }
}
