package com;

import java.util.Arrays;

public class Exo002 {
    public static void main(String[] args) {new Exo002();}

    public Exo002() {
        int[] tab1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        displayTab(tab1, "tab1");
        int[] tab2 = new int[10];
        displayTab(tab2, "tab2");
        int tab3[] = new int[10];
        displayTab(tab3, "tab3");
    }

    private void displayTab(int[] tab, String tabName) {
        System.out.println(String.format("Taille de %s: %s", tabName, tab.length));
        for (int i = 0; i < tab.length; i++) {
            System.out.println(String.format("%s[%s]=%s", tabName, i, tab[i]));
        }
        System.out.println(Arrays.toString(tab));
    }
}
