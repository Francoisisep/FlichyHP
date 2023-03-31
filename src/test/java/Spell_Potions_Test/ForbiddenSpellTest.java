package Spell_Potions_Test;

import Spell_Potions.ForbiddenSpell;
import org.junit.Test;
import static org.junit.Assert.*;

public class ForbiddenSpellTest {

    @Test
    public void testConstructor() {
        int index = 1;
        ForbiddenSpell spell = new ForbiddenSpell(index);
        String expectedSpell = "Impero";
        String actualSpell = spell.getForbiddenSpell();
        assertEquals(expectedSpell, actualSpell);
    }
}
