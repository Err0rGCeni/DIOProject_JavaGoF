package dio.ceni.strategies;

import dio.ceni.Wizard;
import dio.ceni.schools.Spell;

import java.util.List;
import java.util.Random;

public class BalancedAttackStrategy implements AttackStrategy {
    private final Random random = new Random();

    @Override
    public void apply(Wizard wizard) {
        System.out.println("Executing balanced attack strategy...");
        List<Spell> attackSpells = wizard.getAttackSpells();
        if (!attackSpells.isEmpty()) {
            Spell spell = attackSpells.get(random.nextInt(attackSpells.size()));
            System.out.println("Casting " + spell.getName() + ": " + spell.getDescription());
        } else {
            System.out.println("No Attack spells available.");
        }
    }
}
