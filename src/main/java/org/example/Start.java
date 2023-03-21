package org.example;
import java.util.Scanner;
public class Start {
    Scanner scanner = new Scanner(System.in);
    double LivePointsWizard;
    String Nom = scanner.nextLine();
    Wizard player = new Wizard(Nom);
    int Level = player.getLevel();
    String HouseWizard = player.getHouseWizard();

   /* double LivePointsWizard = player.getLivePointsWizard();
    String NameWizard = player.getNameWizard();
    String Core = player.getCore();

    */
    public Start() {
        Level level1 = new Level(Level);
        Enemy enemy = new Enemy(level1.getEnemyName(), player.getNameWizard(), player.getLivePointsWizard(), player.getPercentageWizard(), player.getHouseWizard(), player.getDamageWizard());
        this.LivePointsWizard = enemy.getLivePointsWizard();
        player.setLivePointsWizard(LivePointsWizard);
        System.out.println("Points de vie: " + player.getLivePointsWizard() + " Dégats de vos sortilèges: " + player.getDamageWizard());
        if (LivePointsWizard > 0) {
        End_Levels(player.getLivePointsWizard(), player.getDamageWizard(),Level, player.getHouseWizard());
        Level = player.setLevel(2);
        Level level2 = new Level(Level);
        Enemy enemy2 = new Enemy(level2.getEnemyName(), player.getNameWizard(), player.getLivePointsWizard(), player.getPercentageWizard(), player.getHouseWizard(), player.getDamageWizard());
        this.LivePointsWizard = enemy2.getLivePointsWizard();
        player.setLivePointsWizard(LivePointsWizard);
        if(LivePointsWizard > 0){
        End_Levels(player.getLivePointsWizard(), player.getDamageWizard(),Level, player.getHouseWizard());
        Level = player.setLevel(3);
        Level level3 = new Level(Level);
        Enemy enemy3 = new Enemy(level3.getEnemyName(), player.getNameWizard(), player.getLivePointsWizard(), player.getPercentageWizard(), player.getHouseWizard(), player.getDamageWizard());
        this.LivePointsWizard = enemy3.getLivePointsWizard();
        player.setLivePointsWizard(LivePointsWizard);
        if(LivePointsWizard > 0){
        End_Levels(player.getLivePointsWizard(), player.getDamageWizard(),Level, player.getHouseWizard());
        Level = player.setLevel(4);
        Level level4 = new Level(Level);
        Enemy enemy4 = new Enemy(level4.getEnemyName(), player.getNameWizard(), player.getLivePointsWizard(), player.getPercentageWizard(), player.getHouseWizard(), player.getDamageWizard());
        this.LivePointsWizard = enemy4.getLivePointsWizard();
        player.setLivePointsWizard(LivePointsWizard);
        if(LivePointsWizard > 0){
        End_Levels(player.getLivePointsWizard(), player.getDamageWizard(),Level, player.getHouseWizard());
        Level = player.setLevel(5);
        Level level5 = new Level(Level);
        Enemy enemy5 = new Enemy(level5.getEnemyName(), player.getNameWizard(), player.getLivePointsWizard(), player.getPercentageWizard(), player.getHouseWizard(), player.getDamageWizard());
        this.LivePointsWizard = enemy5.getLivePointsWizard();
        player.setLivePointsWizard(LivePointsWizard);
        if(LivePointsWizard > 0){
        End_Levels(player.getLivePointsWizard(), player.getDamageWizard(),Level, player.getHouseWizard());
        Level = player.setLevel(6);
        Level level6 = new Level(Level);
        Enemy enemy6 = new Enemy(level6.getEnemyName(), player.getNameWizard(), player.getLivePointsWizard(), player.getPercentageWizard(), player.getHouseWizard(), player.getDamageWizard());
        this.LivePointsWizard = enemy6.getLivePointsWizard();
        player.setLivePointsWizard(LivePointsWizard);
        if(LivePointsWizard > 0){
        End_Levels(player.getLivePointsWizard(), player.getDamageWizard(),Level, player.getHouseWizard());
        Level = player.setLevel(7);
        Level level7 = new Level(Level);
        Enemy enemy7 = new Enemy(level7.getEnemyName(), player.getNameWizard(), player.getLivePointsWizard(), player.getPercentageWizard(), player.getHouseWizard(), player.getDamageWizard());
        this.LivePointsWizard = enemy7.getLivePointsWizard();
        player.setLivePointsWizard(LivePointsWizard);
        if(LivePointsWizard > 0){Boss enemy8 = new Boss(player.getLivePointsWizard(), player.getNameWizard(), player.getPercentageWizard(), player.getHouseWizard(), player.getDamageWizard());}
        }}}}}}
    }
    public void End_Levels(double LivePointsWizard ,double DamageWizard,int Level,String HouseWizard){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Vous pouvez choisir d’augmenter vos points de vie (potion) ou les points de dégats de vos sortilèges (deg). \n" +
                "Qu'est-ce que vous voulez améliorer?");
        String Result = scanner.nextLine();
        switch (Result){
            case "potion":
                switch (HouseWizard){
                    case "Poufsouffle":
                        player.setLivePointsWizard(LivePointsWizard + Level);
                        break;
                    default:
                        player.setLivePointsWizard(LivePointsWizard + Level/2 );
                        break; }
                break;
            default:
                player.setDamageWizard(DamageWizard + Level );
                break;
        }
        System.out.println("Points de vie: " + player.getLivePointsWizard() + " Dégats de vos sortilèges: " + player.getDamageWizard());
    }
}


