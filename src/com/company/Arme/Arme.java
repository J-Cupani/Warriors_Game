package com.company.Arme;

import com.company.Personnage.Guerrier;
import com.company.Personnage.Mage;
import com.company.Personnage.Personnage;
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

    @Override
    public String toString() {
        return "{ " + nomArme +
                ", Puissance[" + forceArme +
                "] }";
    }

    public void interract(Personnage personnage) {
        if ((this.nomArme.equals("Epee") || (this.nomArme.equals("Massue"))) && (personnage instanceof Guerrier)) {
            personnage.setArme(forceArme);
            System.out.println("test");
        }if ((this.nomArme.equals("Boule de feu") || (this.nomArme.equals("Eclair"))) && (personnage instanceof Mage)) {
            personnage.setArme(forceArme);
        }
    }
}
