package org.example;

import java.util.Scanner;

public class Wand {
    public Wand ()
    {
// this
        System.out.println("Vous devez avoir une baguette, allez cher Olivender pour en avoir une." );
        size = (int)(Math.random() * 20) ; /* Taille des baguettes entre 16 cm et 35 cm */
        size += 16;
        int i = (int)(Math.random() * 4);
        String[] ta = { "PHOENIX_FEATHER", "UNICORN_HORSEHAIR", "DRAGON_VENTRICLE", "SOMBRAL_HORSEHAIR"};
        core = ta[i];
        System.out.println("Félicitation votre baguette mesure " + size + " cm et elle contient du "+ core);
    }
    private int size;
    private String core;
}