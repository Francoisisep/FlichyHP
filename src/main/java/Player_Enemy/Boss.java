package Player_Enemy;

import Spell_Potions.ForbiddenSpell;

public class Boss extends AbstractEnemy{
    private double LivePoints;
    private String wand = "PHOENIX_FEATHER";
    public Boss(double LivePointsWizard, String NameWizard, int PercentageWizard, String HouseWizard,double DamageWizard,String Core){
        if (Core == wand){
            LivePointsWizard +=1;
            System.out.println("Votre baguette et celle de Lord Voldemort sont jumelles vous voyez des fantômes qui vous conseillent + 1 points de vie");
        }
        LivePoints = 1;
        while (LivePoints > 0 && LivePointsWizard > 0) {
            double intermédiaireLivePoints = LivePoints;
            LivePoints = LivePoints - attack( PercentageWizard,Damagepoint(NameWizard, "Enemy",DamageWizard));
            if(LivePoints-intermédiaireLivePoints < 0) {
                System.out.println("Vous avez atteint votre cible.");
                System.out.println("Points de vie de l'ennemi: " + LivePoints );
                System.out.println("Points de vie du sorcier: "+ LivePointsWizard);
            }
            if (LivePoints > 0) {
                double intermédiaireLivePointsWizard = LivePointsWizard;
                LivePointsWizard = LivePointsWizard - attack(70,Damagepoint("Voldemort", HouseWizard,DamageWizard));
                if (LivePointsWizard-intermédiaireLivePointsWizard <0) {
                    int rand = (int) (Math.random() * 3);
                    ForbiddenSpell forbiddenSpell= new ForbiddenSpell(rand);
                    String impardonnable = forbiddenSpell.getForbiddenSpell();
                    System.out.println("Vous avec reçu le sortilège " + impardonnable + ", vous perdez de la vie");
                    System.out.println("Points de vie de l'ennemi: " + LivePoints);
                    System.out.println("Points de vie du sorcier: " + LivePointsWizard);
                    if (LivePointsWizard <= 0){
                        System.out.println("Vous avez perdu, Lord Voldemort vous a tué.");
                    }
                }
            }
            else {
                System.out.println("Vous avez gagné, Vous avez tué Lord Voldemort.");
            }
        }
    }
}