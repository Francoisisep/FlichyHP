package Spell_Potions_Test;

import Spell_Potions.Spell;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SpellTest {
    @Test
    public void testSpell() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Spell spell = new Spell();
        String expectedOutput = "Voici la liste des sortilèges que vous pouvez utiliser: [Wingardium Leviosa, Accio, Expectro Patronum, Sectumsempra, Expelliarmus]\n";

        System.setOut(System.out);
    }
}

