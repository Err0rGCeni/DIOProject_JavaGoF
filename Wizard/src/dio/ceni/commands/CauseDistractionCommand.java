package dio.ceni.commands;

import dio.ceni.Orb;

public class CauseDistractionCommand implements Command {
    private final Orb orb;

    public CauseDistractionCommand(Orb orb) {
        this.orb = orb;
    }

    @Override
    public void execute() {
        orb.causeDistraction();
    }
}
