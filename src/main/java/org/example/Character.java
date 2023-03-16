package org.example;

public abstract class Character {
    private double damageplayer;
    public double attack(String attackname, String enemyhouse, int percentage){
        this.damageplayer = 0.5;
        if (percentageSpell(percentage)){; // chance de réussite
            return damagepoint(attackname, enemyhouse); // j'ai le résultat de attaque en return
        }
        else
            return 0;
    }
    public double getdamageplayer(){return damageplayer;}
    public double setdamageplayer(double damagePoints){ //damagePoints est la variable pour augmenter la valeur des dégats de l'éléve de poudlard
        this.damageplayer = damagePoints;
        return damagePoints;
    }
    public boolean percentageSpell(int percentage){
        int number = (int) (Math.random() * 101);
        if (number < percentage){
            return true; //sucess
        }
        else {
            return false; //fail
        }
    }
    public double damagepoint(String attackname, String enemyhouse){
        switch (attackname){
            case "Troll":
                System.out.println("Le Troll vous lance des objets vous perdez de la vie");
                switch (enemyhouse){
                    case "Gryffondor":
                        return 0.25;
                    default:
                        return 0.5;
                }
            case "Basilic":
                System.out.println("Le Basilic vous donne un coup de queue vous perdez de la vie");
                switch (enemyhouse){
                    case "Gryffondor":
                        return 0.5;
                    default:
                        return 0.75;
                }
            case "Dementor":
                System.out.println("Le Détraqueur aspire votre âme vous perdez de la vie");
                switch (enemyhouse){
                    case "Gryffondor":
                        return 0.75;
                    default:
                        return 1;
                }
            case "Portkey":
                enemysort();
                switch (enemyhouse){
                    case "Gryffondor":
                        return 1.5;
                    default:
                        return 2;
                }
            case "Ombrage":
                enemysort();
                switch (enemyhouse){
                    case "Gryffondor":
                        return 0.25;
                    default:
                        return 0.5;
                }
            case "DeathEaters":
                enemysort();
                switch (enemyhouse){
                    case "Gryffondor":
                        return 0.6;
                    default:
                        return 0.8;
                }
            case "Lestrange":
                enemysort();
                switch (enemyhouse){
                    case "Gryffondor":
                        return 1;
                    default:
                        return 1.5;
                }
            case "Voldemort":
                enemysort();
                switch (enemyhouse){
                    case "Gryffondor":
                        return 1;
                    default:
                        return 1.5;
                }
            default:
                return damageplayer;
        }
    }
    public void enemysort (){
        int rand = (int) (Math.random() * 3);
        String[] tab = {"Avada Kedavra", "Impero", "Endoloris"};
        String impardonnable = tab[rand];
        System.out.println("Vous avec reçu le sortilège " + impardonnable + " Vous perdez de la vie");
    }
}
