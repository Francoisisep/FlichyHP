package org.example;

import java.util.Scanner;

public class Wand {
    public Wand ()
    {
        Scanner scanner = new Scanner (System.in);
// this
        System.out.println("Tu dois choisir une baguette, quelle est la taille de votre baguette ?" );
        int size = scanner.nextInt();
        System.out.println("Qu'est ce qu'il y a dans ta baguette ? (core)");
        String core = scanner.next();
        System.out.println(core);
    }
}