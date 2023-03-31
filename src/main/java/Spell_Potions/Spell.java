package Spell_Potions;
import java.util.ArrayList;
import java.util.List;
public class Spell extends AbstractSpell{
    public Spell()
    {
        List<String> knownSpells;
        knownSpells = new ArrayList<>();
        knownSpells.add(0,"Wingardium Leviosa");
        knownSpells.add(1,"Accio");
        knownSpells.add(2,"Expectro Patronum");
        knownSpells.add(3,"Sectumsempra");
        knownSpells.add(4,"Expelliarmus");
        System.out.println("Voici la liste des sortilèges que vous pouvez utiliser: " + knownSpells);
    }
}

