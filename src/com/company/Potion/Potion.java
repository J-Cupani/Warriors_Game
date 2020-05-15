package com.company.Potion;

import com.company.Plateau.Case;

public class Potion extends Case {
    protected String nomPotion;
    protected int puissanceSoin;

    public String getNomPotion() {
        return nomPotion;
    }

    public void setNomPotion(String nomPotion) {
        this.nomPotion = nomPotion;
    }

    public int getPuissanceSoin() {
        return puissanceSoin;
    }

    public void setPuissanceSoin(int puissanceSoin) {
        this.puissanceSoin = puissanceSoin;
    }

    public Potion() {
        this.nomPotion = "Potion";
        this.puissanceSoin = 0;
    }

    public Potion(String pNomPotion, int pPuissanceSoin) {
        this.nomPotion = pNomPotion;
        this.puissanceSoin = pPuissanceSoin;
    }

    @Override
    public String toString() {
        return "{ " + nomPotion +
                ", Puissance[" + puissanceSoin +
                "] }";
    }

}
