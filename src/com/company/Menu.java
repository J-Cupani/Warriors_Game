package com.company;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Menu {

    public void start(Scanner input) {
        System.out.println("Voulez-vous lancer la partie ?");
        String launchGame;
        do {
            System.out.println("Pour commencer entrer yes");
            launchGame = input.nextLine();
            this.exit(input, launchGame);
        }
        while (!launchGame.equals("yes"));
    }

    public String choose(Scanner input) {
        String choice;
        do {
            System.out.println("Veuillez choisir un guerrier ou un mage :");
            choice = input.nextLine();
            this.exit(input, choice);
        }
        while (!choice.equals("guerrier") && !choice.equals("mage"));
        System.out.println("Vous avez choisit un " + choice);
        return choice;
    }

    public String chooseName(Scanner input) {
        System.out.println("Veuillez choisir le nom de votre Personnage");
        String nameChoice = input.nextLine();
        this.exit(input, nameChoice);
        return nameChoice;
    }

    public String finalChoice(Scanner input) {
        System.out.println("Voulez vous rejouez ?");
        String replayChoice = input.nextLine();
        this.exit(input, replayChoice);
        return replayChoice;
    }

    public void exit(Scanner input, String exit) {
        if (exit.equals("exit")) {
            System.out.println("Etes vous sure de vouloir quitter la partie ? (exit) pour confirmer");
            String confirmeExit = input.nextLine();
            if (confirmeExit.equals("exit")) {
                System.exit(0);
            }
        }
    }

//    public void profil (String profil, Personnage personnage) {
//        if (profil.equals("profil")){
//            personnage.toString();
//        }
//    }
}


