package org.example;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class House  {
    public House(String maison){

        switch (maison){
            case "Gryffondor":
                System.out.println("Vous êtes plus résistants aux dégâts que les autres maisons.");
                break;
            case "Serpentard":
                System.out.println("Vos sorts font plus de dégâts.");
                break;
            case "Poufsouffle":
                System.out.println("Vos potions sont les plus efficaces.");
                break;
            case "Serdaigle":
                System.out.println("Vos sort sont plus précis.");
                break;


        }



    }

}
