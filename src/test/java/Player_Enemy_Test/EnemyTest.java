package Player_Enemy_Test;
import Player_Enemy.Enemy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class EnemyTest {
    private Enemy enemy;
    @BeforeEach
    void setUp() {
        enemy = new Enemy("Troll", "Harry Potter", 10.0, 50, "Gryffindor", 5.0);
    }
    @Test
    void testFight() {
        enemy.fight(2.0, 10, 20.0, "Voldemort", 60, "Troll", "Slytherin", 10.0);
    }
}
