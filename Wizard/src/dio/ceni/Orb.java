package dio.ceni;

import dio.ceni.schools.Spell;

import java.util.List;
import java.util.Random;

public class Orb {
    private final Random random = new Random();

    public void copySpells(Wizard wizard) {
        List<Spell> allSpells = wizard.getAllSpells();
        if (allSpells.size() < 2) {
            System.out.println("Not enough spells to copy.");
            return;
        }
        Spell spell1 = allSpells.get(random.nextInt(allSpells.size()));
        Spell spell2 = allSpells.get(random.nextInt(allSpells.size()));
        System.out.println("Orb copied spells: " + spell1.getName() + " and " + spell2.getName());
    }

    public void causeDistraction() {
        System.out.println("Pift Puft! The Orb caused a distraction!");
    }

    public void healWizard(Wizard wizard) {
        wizard.heal(20); // Arbitrary healing amount
        System.out.println("Orb healed the wizard by 20 HP.");
    }
}
