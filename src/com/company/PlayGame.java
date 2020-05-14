package com.company;

import com.company.Personnage.Mage;
import com.company.Personnage.Personnage;

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
        game.partie();
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

    public void partie() {
        int plateau = 64;
        int position = 1;
        while (position < plateau) {
            int dice = lancesDes();
            position = position + dice;
            System.out.println("le joueur se trouve sur la case : " + position);
        }
        System.out.println("Felicitation vous avez gagné la partie !!!!!!!!!");
    }

    /**
     * Permet de relancer la partie
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


