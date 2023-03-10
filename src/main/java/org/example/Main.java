package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Wizard wizard = new Wizard();

        Pet p1 = Pet.OWL;
        System.out.println(p1);
        Pet p2 = Pet.CAT;
        System.out.println(p2);
        Pet p3 = Pet.TOAD;
        System.out.println(p3);
    }
}