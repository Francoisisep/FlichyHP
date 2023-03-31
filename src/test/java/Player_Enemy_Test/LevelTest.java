package Player_Enemy_Test;
import Player_Enemy.Level;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class LevelTest {
    @Test
    void testLevelOne() {
        Level level = new Level(1);
        Assertions.assertEquals("Troll", level.getEnemyName());
    }
    @Test
    void testLevelTwo() {
        Level level = new Level(2);
        Assertions.assertEquals("Basilic", level.getEnemyName());
    }
    @Test
    void testLevelThree() {
        Level level = new Level(3);
        Assertions.assertEquals("Dementor", level.getEnemyName());
    }
    @Test
    void testLevelFour() {
        Level level = new Level(4);
        Assertions.assertEquals("Portkey", level.getEnemyName());
    }
    @Test
    void testLevelFive() {
        Level level = new Level(5);
        Assertions.assertEquals("Ombrage", level.getEnemyName());
    }
    @Test
    void testLevelSix() {
        Level level = new Level(6);
        Assertions.assertEquals("DeathEaters", level.getEnemyName());
    }
    @Test
    void testLevelSeven() {
        Level level = new Level(7);
        Assertions.assertEquals("Lestrange", level.getEnemyName());
    }
}
