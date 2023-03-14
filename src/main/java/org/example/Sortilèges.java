package org.example;

public class Sortilèges {
    public Sortilèges(int niveau){
        switch (niveau){
            case 0:
                System.out.println("Félicitation Vous avez appris le sortilège Wingardium Leviosa:");
                System.out.println("Vous connaissez le sortilège : 'Wingardium Leviosa'");
                break;
            case 1:
                System.out.println("Félicitation Vous avez appris le sortilège Accio");
                System.out.println("Vous connaissez les sortilèges : 'Wingardium Leviosa' et 'Accio'");
                break;
            case 2:
                System.out.println("Félicitation Vous avez appris le sortilège Expectro Patronum");
                System.out.println("Vous connaissez les sortilèges : 'Wingardium Leviosa', 'Accio' et ' Expectro Patronum'");
                break;
            case 5:
                System.out.println("Félicitation Vous avez appris le sortilège Sectumsempra");
                System.out.println("Vous connaissez les sortilèges : 'Wingardium Leviosa', 'Accio', ' Expectro Patronum' et ' Sectumsempra'");
            case 6:
                System.out.println("Félicitation Vous avez appris le sortilège Expelliarmus");
                System.out.println("Vous connaissez les sortilèges : 'Wingardium Leviosa', 'Accio', ' Expectro Patronum', ' Sectumsempra' et 'Expelliarmus'");
        }
    }
}
