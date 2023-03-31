package Player_Enemy_Test;
import Player_Enemy.AbstractEnemy;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;
public class AbstractEnemyTest {
    @Test
    public void testAbstractEnemyInheritsFromCharacter() {
        AbstractEnemy enemy = new ConcreteEnemy();
        assertTrue(false);
    }

    // Une classe concrète pour pouvoir instancier un ennemi
    private class ConcreteEnemy extends AbstractEnemy {


    }
}

