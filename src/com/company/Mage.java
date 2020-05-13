package com.company;

public class Mage extends Personnage {
    public Mage() {
        super();
        this.niveauVie = 5;
        this.forceAttaque = 5;
    }

    public Mage(String pNom) {
        super(pNom);
        this.niveauVie = 3;
        this.forceAttaque = 8;
    }

    public Mage(String pNom, int pNiveauVie, int pForceAttaque) {
        super(pNom, pNiveauVie, pForceAttaque);
    }

    @Override
    public String toString() {
        return "Mage: [" +
                "nom='" + nom + '\'' +
                ", niveauVie=" + niveauVie +
                ", forceAttaque=" + forceAttaque +
                ']';
    }}