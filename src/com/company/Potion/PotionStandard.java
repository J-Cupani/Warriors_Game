package com.company.Potion;

public class PotionStandard extends Potion {

    public PotionStandard() {
        this.nomPotion = "Potion Standard";
        this.puissanceSoin = 5;
    }

    public PotionStandard(String pNomPotion, int pPuissanceSoin) {
        super(pNomPotion, pPuissanceSoin);
    }
}
