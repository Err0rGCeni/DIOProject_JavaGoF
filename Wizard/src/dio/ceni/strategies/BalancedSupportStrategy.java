package dio.ceni.strategies;

import dio.ceni.Wizard;
import dio.ceni.schools.Spell;

import java.util.List;
import java.util.Random;

public class BalancedSupportStrategy implements SupportStrategy {
    private final Random random = new Random();

    @Override
    public void apply(Wizard wizard) {
        System.out.println("Executing balanced support strategy...");
        List<Spell> supportSpells = wizard.getSupportSpells();
        if (!supportSpells.isEmpty()) {
            Spell spell = supportSpells.get(random.nextInt(supportSpells.size()));
            System.out.println("Casting " + spell.getName() + ": " + spell.getDescription());
        } else {
            System.out.println("No Support spells available.");
        }
    }
}
