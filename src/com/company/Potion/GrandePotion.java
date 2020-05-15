package com.company.Potion;

public class GrandePotion extends Potion {

    public GrandePotion() {
        this.nomPotion = "Potion Standard";
        this.puissanceSoin = 5;
    }

    public GrandePotion(String pNomPotion, int pPuissanceSoin) {
        super(pNomPotion, pPuissanceSoin);
    }
}
