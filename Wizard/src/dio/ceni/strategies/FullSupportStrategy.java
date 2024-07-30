package dio.ceni.strategies;

import dio.ceni.Wizard;

public class FullSupportStrategy implements SupportStrategy {
    @Override
    public void apply(Wizard wizard) {
        System.out.println("Executing full support strategy...");
        wizard.getSupportSpells().forEach(spell -> System.out.println("Casting " + spell.getName() + ": " + spell.getDescription()));
        System.out.println(">?!?> " + wizard.getName() + " is high *x*! <?!?<");
    }
}
