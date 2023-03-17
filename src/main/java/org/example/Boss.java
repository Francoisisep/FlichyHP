package org.example;

public class Boss extends AbstractEnemy{
    private double LivePoints;
    private String wand = "PHOENIX_FEATHER";
    public Boss(double LivePointsWizard, String NameWizard, int PercentageWizard, String HouseWizard){
        LivePoints = 1;
        double DamageWizard = 0.5;
        while (LivePoints == 0 || LivePointsWizard == 0) {
            LivePoints = attack( PercentageWizard,Damagepoint(NameWizard, "Enemy",DamageWizard));
            if (LivePoints != 0) {
                LivePointsWizard = attack(60,Damagepoint("Voldemort", HouseWizard,DamageWizard));
            }
        }
    }
}
