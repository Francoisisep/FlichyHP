package Player_Enemy_Test;
import Player_Enemy.Boss;
import Spell_Potions.ForbiddenSpell;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class BossTest {
    @Test
    void testDamagepoint() {
        Boss boss = new Boss(10, "Harry Potter", 5, "Gryffondor", 2, "PHOENIX_FEATHER");
        double damage = boss.Damagepoint("Lord Voldemort", "Serpentard", 10);
        assertTrue(damage > 0 && damage <= 10);
    }
    @Test
    void testForbiddenSpell() {
        Boss boss = new Boss(100, "Harry Potter", 50, "Gryffondor", 20, "PHOENIX_FEATHER");
        ForbiddenSpell forbiddenSpell = new ForbiddenSpell(1);
        String spell = forbiddenSpell.getForbiddenSpell();
        assertTrue(spell != null && spell.length() > 0);
    }
}

