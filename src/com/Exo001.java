package com;

import java.util.Scanner;

public class Exo001 {
    public static void main(String[] args) {
        new Exo001();
    }

    public Exo001() {
        boolean play = true;
        do { // replay ?
            int rnd = (int) (Math.random() * 149) + 1;
            boolean done = false;
            int attemps = 10;
            int entry = 0;

            System.out.println("Devinez un nombre de 1 à 150:");
            do {
                System.out.println("Plus que " + attemps + " essais.");
                entry = getNumber();
                if (entry < rnd) {
                    System.out.println("Trop petit.");
                } else if (entry > rnd) {
                    System.out.println("Trop grand.");
                } else {
                    System.out.println("Exact !");
                    done = true;
                }
                attemps--;
            } while (!done && attemps > 0);
        } while(continuePlay());
        System.out.println("Terminé.");
    }

    /**
     * scan for entry
     * @return number as integer
     */
    private int getNumber() {
        int entry = 0;
        boolean entryIsValid = false;

            Scanner sc = new Scanner(System.in);
            while (!entryIsValid) {
                try {
                    entry = Integer.parseInt(sc.nextLine());
                    if (entry > 0 && entry <= 150) entryIsValid = true;
                    else System.out.println(("Le nombre doit être compris entre 1 et 150 !\nRecommencez."));
                } catch (NumberFormatException e) {
                    System.out.println("Entrée invalide !\nRecommencez.");
                }
            }
        return entry;
    }

    /**
     * scan for continue play ?
     * @return continue as boolean
     */
    private boolean continuePlay() {
        String entry = null;
        boolean validEntry = false;

        try {
            System.out.println("Continuer ? (o/n)");
            Scanner sc = new Scanner(System.in);
            entry = sc.nextLine();
            if(entry.equals("o")) validEntry = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return validEntry;
        }
    }
}
