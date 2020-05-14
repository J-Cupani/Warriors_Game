package com.company.Plateau;

import com.company.Arme.Epee;
import com.company.Arme.Massue;

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
                    plateau.add("Eclair");
                    break;
                case 48:
                case 49:
                    plateau.add("Boule de feu");
                    break;
                case 7:
                case 13:
                case 31:
                case 33:
                case 39:
                case 43:
                    plateau.add("Potion Standards");
                    break;
                case 28:
                case 41:
                    plateau.add("Grande Potion");
                    break;
                case 45:
                case 52:
                case 56:
                case 62:
                    plateau.add("Dragon");
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
                    plateau.add("Sorcier");
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
                    plateau.add("Gobelin");
                    break;
                default:
                    plateau.add("Case Vide");
            }
        }
        System.out.println(plateau);

    }

    //   public void avancementPosition()

//
//        while (position < plateau) {
//            int dice = lancesDes();
//            position = position + dice;
//            System.out.println("le joueur se trouve sur la case : " + position);
//        }
//        System.out.println("Felicitation vous avez gagné la partie !!!!!!!!!");
//    }
}
