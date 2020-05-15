package com.company;

import com.company.Personnage.Guerrier;
import com.company.Personnage.Mage;
import com.company.Personnage.Personnage;
import com.company.Plateau.Case;
import com.company.Plateau.Plateau;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayGame {

    public void deroulerGame(Scanner input) {
        Menu menu = new Menu();
        menu.start(input);
        String choice = menu.choose(input);
        PlayGame game = new PlayGame();
        String namePerso = menu.chooseName(input);
        Personnage perso = game.createPerso(choice, namePerso);
        System.out.println(perso);
        Plateau plateau = new Plateau();
        game.partie(plateau.getPlateauLongueur(), plateau.getPlateau(), plateau.getPosition(), perso);
        String replay = menu.finalChoice(input);
        game.replay(replay, input);
    }

    public Personnage createPerso(String choice, String name) {
        Personnage personnage;
        if (choice.equals("guerrier")) {
            personnage = new Guerrier(name);
        } else {
            personnage = new Mage(name);
        }
        return personnage;
    }

    public int lancesDes() {
        int dice = 1 + (int) (Math.random() * 6);
        return dice;
    }

    public void partie(int plateauLongueur, ArrayList<Case> plateauJeu, int position, Personnage perso) {
        ArrayList<Case> cases = plateauJeu;
        while (position < plateauLongueur) {
            int dice = lancesDes();
            position = position + dice;
            for (int i = 0; i < cases.size(); i++) {
                if (position == i) {
                    System.out.println("------------------------------------");
                    System.out.println("le joueur se trouve sur la case : " + position);
                    Case caseActive = cases.get(i);
                    caseActive.interract(perso);
                    System.out.println(caseActive);
                    System.out.println(perso);
                }
            }
        }
        System.out.println("Felicitation vous avez gagné la partie !!!!!!!!!");
    }

    /**
     * Permet de relancer la partie
     *
     * @param replayChoice
     * @param input
     */

    public void replay(String replayChoice, Scanner input) {
        if (replayChoice.equals("yes")) {
            this.deroulerGame(input);
        } else {
            System.out.println("A bientot !!!!!");
        }
    }

}


