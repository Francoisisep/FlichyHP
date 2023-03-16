package org.example;

public class Boss extends AbstractEnemy{
    private double LivePoints;
    private String wand = "PHOENIX_FEATHER";
    public Boss(double LivePointsWizard, String NameWizard, int PercentageWizard, String HouseWizard){
        LivePoints = 1;
        while (LivePoints == 0 || LivePointsWizard == 0) {
            LivePoints = attack(NameWizard, "Enemy", PercentageWizard);
            if (LivePoints != 0) {
                LivePointsWizard = attack("Voldemort",HouseWizard,60);
            }
        }
    }
}
