package com.company.Plateau;

import com.company.Arme.*;
import com.company.Monstre.Dragon;
import com.company.Monstre.Gobellin;
import com.company.Monstre.Sorcier;
import com.company.Potion.GrandePotion;
import com.company.Potion.PotionStandard;

import java.util.ArrayList;

public class Plateau {
    private ArrayList plateau = new ArrayList();
    private int plateauLongueur;
    private int position;

    public int getPlateau() {
        return plateauLongueur;
    }

    public void setPlateau(int pPlateauLongueur) {
        this.plateauLongueur = pPlateauLongueur;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Plateau() {
        this.plateauLongueur = 64;
        for (int i = 0; i < plateauLongueur; i++) {
            switch (i) {
                case 2:
                case 5:
                case 11:
                case 22:
                case 38:
                    plateau.add(new Massue());
                    break;
                case 19:
                case 26:
                case 42:
                case 53:
                    plateau.add(new Epee());
                    break;
                case 1:
                case 4:
                case 8:
                case 17:
                case 23:
                    plateau.add(new Eclair());
                    break;
                case 48:
                case 49:
                    plateau.add(new BouleDeFeu());
                    break;
                case 7:
                case 13:
                case 31:
                case 33:
                case 39:
                case 43:
                    plateau.add(new PotionStandard());
                    break;
                case 28:
                case 41:
                    plateau.add(new GrandePotion());
                    break;
                case 45:
                case 52:
                case 56:
                case 62:
                    plateau.add(new Dragon());
                    break;
                case 10:
                case 20:
                case 25:
                case 32:
                case 35:
                case 36:
                case 37:
                case 40:
                case 44:
                case 47:
                    plateau.add(new Sorcier());
                    break;
                case 3:
                case 6:
                case 9:
                case 12:
                case 15:
                case 18:
                case 21:
                case 24:
                case 27:
                case 30:
                    plateau.add(new Gobellin());
                    break;
                default:
                    plateau.add("Case Vide");
            }
        }
        System.out.println(plateau);
    }
}
