package org.example;

import java.util.Scanner;

public class Start {
    Scanner scanner = new Scanner(System.in);
    String Nom = scanner.nextLine();
    Wizard player = new Wizard(Nom);
    int Level = player.getLevel();
    String HouseWizard = player.getHouseWizard();

   /* double LivePointsWizard = player.getLivePointsWizard();
    String NameWizard = player.getNameWizard();
    String Core = player.getCore();

    double DamageWizard = player.getDamageWizard();*/
    public Start(){

        Level level1 = new Level(Level);

        Enemy enemy = new Enemy(level1.getEnemyName(), player.getNameWizard(), player.getLivePointsWizard(), 44, player.getHouseWizard());
    }
}


