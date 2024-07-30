package dio.ceni.commands;

import dio.ceni.Orb;
import dio.ceni.Wizard;

public class CopySpellsCommand implements Command {
    private final Orb orb;
    private final Wizard wizard;

    public CopySpellsCommand(Orb orb, Wizard wizard) {
        this.orb = orb;
        this.wizard = wizard;
    }

    @Override
    public void execute() {
        orb.copySpells(wizard);
    }
}
