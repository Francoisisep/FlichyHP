package Player_Enemy;

public abstract class Character {
    public double attack( int Percentage,double DamagePoint){
        if (PercentageSpell(Percentage)== true){; // chance de réussite
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
                switch (EnemyHouse){
                    case "Gryffondor":
                        return 0.5;
                    default:
                        return 0.75;
                }
            case "Basilic":
                switch (EnemyHouse){
                    case "Gryffondor":
                        return 0.75;
                    default:
                        return 1;
                }
            case "Dementor":
                switch (EnemyHouse){
                    case "Gryffondor":
                        return 1;
                    default:
                        return 1.5;
                }
            case "Portkey":
                switch (EnemyHouse){
                    case "Gryffondor":
                        return 2;
                    default:
                        return 3;
                }
            case "Ombrage":
                switch (EnemyHouse){
                    case "Gryffondor":
                        return 1;
                    default:
                        return 1.5;
                }
            case "DeathEaters":
                switch (EnemyHouse){
                    case "Gryffondor":
                        return 2;
                    default:
                        return 2.5;
                }
            case "Lestrange":
                switch (EnemyHouse){
                    case "Gryffondor":
                        return 2.5;
                    default:
                        return 3;
                }
            case "Voldemort":
                switch (EnemyHouse){
                    case "Gryffondor":
                        return 3;
                    default:
                        return 4;
                }
            default:
                return DamageWizard;
        }
    }

}
