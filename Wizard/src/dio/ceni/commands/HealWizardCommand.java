package dio.ceni.commands;

import dio.ceni.Orb;
import dio.ceni.Wizard;

public class HealWizardCommand implements Command {
    private final Orb orb;
    private final Wizard wizard;

    public HealWizardCommand(Orb orb, Wizard wizard) {
        this.orb = orb;
        this.wizard = wizard;
    }

    @Override
    public void execute() {
        orb.healWizard(wizard);
    }
}
