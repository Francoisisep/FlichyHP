package Spell_Potions_Test;
import Spell_Potions.AbstractSpell;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class AbstractSpellTest {
    @Test
    void testAbstractSpellCreation() {
        AbstractSpell spell = new AbstractSpell() {};
        assertNotNull(spell, "Failed to create AbstractSpell instance.");
    }
}
