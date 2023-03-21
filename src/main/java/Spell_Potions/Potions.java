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
/*
    public List<Potion> getPotion(){return potions;}
    public int getNumberPotion(){return potions.size();}
    public List<Spell> getSpell(){return knownSpells;}
    public int getNumberSpell(){return knownSpells.size();}
    */
    /*
    public List<Potion> addPotion(){
        int addMana=30;
        //Ajouter la potion à l'inventaire
        this.potions.add(new Potion(addMana));
        return potions;
    }

    public List<Spell> addSpell(){
        int addLife=20;
        //Ajouter la potion à l'inventaire
        this.knownSpells.add(new Spell(addLife));
        return this.knownSpells;
    }

    public List<Potion> consumePotion(){
        setLifePoints(getLifePoints()+potions.get(0).getAddMana());
        this.potions.remove(0);
        return this.potions;
    }
*/