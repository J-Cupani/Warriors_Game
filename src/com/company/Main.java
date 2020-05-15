package com.company;


import com.company.Plateau.Plateau;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Plateau plateau = new Plateau();
//        plateau.affichCase();
        Scanner sc = new Scanner(System.in);
        PlayGame game = new PlayGame();
        game.deroulerGame(sc);
    }
}