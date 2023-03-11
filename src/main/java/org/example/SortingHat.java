package org.example;

public class SortingHat {
    public SortingHat(){
        System.out.println("Vous êtes arrivé à Poudlard le chapeau magique va vous répartir dans une maison");
        System.out.println("Chaque maison a ces caractériques:\n Les potions sont plus efficaces pour les membres de Poulsouffle");
        System.out.println("Les sorts font plus de dégâts pour les membres de Serpentard.\n Les sorciers de Gryffindor sont plus résistants aux dégâts.");
        System.out.println("Les sorciers de Serdaigle sont plus précis");
        /* chiffre entre 0 et 3
        range = max - min + 1 = 4-1+1 = 4
        rand = random * range  = random * 4 */
        int rand = (int)(Math.random() * 4) ;
        String[] tab = {"Poufsouffle","Serpentard", "Gryffondor", "Serdaigle"};
        System.out.println("Bravo votre maison est " + tab[rand]);
        /*donner les caractériques de la maison choisie (swtich) dans cette classe ou celle de House? */
    }
}
