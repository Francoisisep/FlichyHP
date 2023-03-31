package Spell_Potions;

import java.util.ArrayList;
import java.util.List;

public class Potions {
    public Potions()
{
    List<String> Potions;
    Potions = new ArrayList<>();
    Potions.add(1,"potion 1");
    Potions.add(2,"potion 2");
    System.out.println("Voici la liste des potions que vous pouvez utiliser: " + Potions);
}
}
