package dio.ceni.strategies;

import dio.ceni.Wizard;

public class AggressiveAttackStrategy implements AttackStrategy {
    @Override
    public void apply(Wizard wizard) {
        System.out.println("Executing aggressive attack strategy...");
        wizard.getAttackSpells().forEach(spell -> System.out.println("Casting " + spell.getName() + ": " + spell.getDescription()));
        System.out.println(">!>!> " + wizard.getName() + " is exhausted @u@! <!<!<");
    }
}
