package org.example;

public abstract class Character {
    public double attack( int Percentage,double DamagePoint){
        if (PercentageSpell(Percentage)){; // chance de réussite
            return DamagePoint; // j'ai le résultat de attaque en return
        }
        else
            return 0;
    }

    public boolean PercentageSpell(int Percentage){
        int Number = (int) (Math.random() * 101);
        if (Number < Percentage){
            return true; //sucess
        }
        else {
            return false; //fail
        }
    }
    public double Damagepoint(String AttackName, String EnemyHouse,double DamageWizard){
        switch (AttackName){
            case "Troll":
                System.out.println("Le Troll vous lance des objets vous perdez de la vie");
                switch (EnemyHouse){
                    case "Gryffondor":
                        return 0.25;
                    default:
                        return 0.5;
                }
            case "Basilic":
                System.out.println("Le Basilic vous donne un coup de queue vous perdez de la vie");
                switch (EnemyHouse){
                    case "Gryffondor":
                        return 0.5;
                    default:
                        return 0.75;
                }
            case "Dementor":
                System.out.println("Le Détraqueur aspire votre âme vous perdez de la vie");
                switch (EnemyHouse){
                    case "Gryffondor":
                        return 0.75;
                    default:
                        return 1;
                }
            case "Portkey":
                EnemySort();
                switch (EnemyHouse){
                    case "Gryffondor":
                        return 1.5;
                    default:
                        return 2;
                }
            case "Ombrage":
                EnemySort();
                switch (EnemyHouse){
                    case "Gryffondor":
                        return 0.25;
                    default:
                        return 0.5;
                }
            case "DeathEaters":
                EnemySort();
                switch (EnemyHouse){
                    case "Gryffondor":
                        return 0.6;
                    default:
                        return 0.8;
                }
            case "Lestrange":
                EnemySort();
                switch (EnemyHouse){
                    case "Gryffondor":
                        return 1;
                    default:
                        return 1.5;
                }
            case "Voldemort":
                EnemySort();
                switch (EnemyHouse){
                    case "Gryffondor":
                        return 1;
                    default:
                        return 1.5;
                }
            default:
                return DamageWizard;
        }
    }
    public void EnemySort (){ // donne le sort que lance l'adversaire du joueur
        int rand = (int) (Math.random() * 3);
        String[] tab = {"Avada Kedavra", "Impero", "Endoloris"};
        String impardonnable = tab[rand];
        System.out.println("Vous avec reçu le sortilège " + impardonnable + " Vous perdez de la vie");
    }
}
