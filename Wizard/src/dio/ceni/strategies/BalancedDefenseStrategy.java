package dio.ceni.strategies;

import dio.ceni.Wizard;
import dio.ceni.schools.Spell;

import java.util.List;
import java.util.Random;

public class BalancedDefenseStrategy implements DefenseStrategy {
    private final Random random = new Random();

    @Override
    public void apply(Wizard wizard) {
        System.out.println("Executing balanced defense strategy...");
        List<Spell> defenseSpells = wizard.getDefenseSpells();
        if (!defenseSpells.isEmpty()) {
            Spell spell = defenseSpells.get(random.nextInt(defenseSpells.size()));
            System.out.println("Casting " + spell.getName() + ": " + spell.getDescription());
        } else {
            System.out.println("No Defense spells available.");
        }
    }
}
