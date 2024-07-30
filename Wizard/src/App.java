import dio.ceni.Orb;
import dio.ceni.Wizard;
import dio.ceni.commands.CauseDistractionCommand;
import dio.ceni.commands.Command;
import dio.ceni.commands.CopySpellsCommand;
import dio.ceni.commands.HealWizardCommand;
import dio.ceni.schools.*;
import dio.ceni.strategies.AggressiveAttackStrategy;
import dio.ceni.strategies.AttackStrategy;
import dio.ceni.strategies.BalancedAttackStrategy;
import dio.ceni.strategies.BalancedDefenseStrategy;
import dio.ceni.strategies.BalancedSupportStrategy;
import dio.ceni.strategies.DefenseStrategy;
import dio.ceni.strategies.FullDefenseStrategy;
import dio.ceni.strategies.FullSupportStrategy;
import dio.ceni.strategies.SupportStrategy;
import dio.ceni.util.SchoolFilterUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AttackStrategy aggressiveAtk = new AggressiveAttackStrategy();
        AttackStrategy balancedAtk = new BalancedAttackStrategy();
        DefenseStrategy fullDef = new FullDefenseStrategy();
        DefenseStrategy balancedDef = new BalancedDefenseStrategy();
        SupportStrategy fullSup = new FullSupportStrategy();
        SupportStrategy balancedSup = new BalancedSupportStrategy();

        // Solicita o nome do mago ao usuário
        System.out.print("Enter the name of your Wizard: ");
        String name = scanner.nextLine();
        Wizard wizard = new Wizard(name);

        // Lista de escolas disponíveis
        List<School> allSchools = List.of(
                new Abjuration(),
                new Alteration(),
                new Conjuration(),
                new Divination(),
                new Illusion(),
                new Necromancy(),
                new Elementalyst());

        List<School> selectedSchools = new ArrayList<>();

        // Primeiro loop: escolher escola com spells de ataque
        System.out.println("Choose a school with Attack spells:");
        List<School> attackSchools = SchoolFilterUtil.filterSchoolsWithAttackSpells(allSchools);
        School chosenSchool = chooseSchool(scanner, attackSchools);
        selectedSchools.add(chosenSchool);

        // Segundo loop: escolher qualquer escola exceto as que possuem apenas suporte
        System.out.println("Choose a school (except those with only Support spells):");
        List<School> secondLoopSchools = SchoolFilterUtil.filterSchoolsWithNonSupportSpells(allSchools,
                selectedSchools);
        chosenSchool = chooseSchool(scanner, secondLoopSchools);
        selectedSchools.add(chosenSchool);

        // Terceiro loop: escolher qualquer escola
        System.out.println("Choose any school:");
        List<School> thirdLoopSchools = SchoolFilterUtil.filterRemainingSchools(allSchools, selectedSchools);
        chosenSchool = chooseSchool(scanner, thirdLoopSchools);
        selectedSchools.add(chosenSchool);

        // Adiciona as escolas ao mago
        for (School school : selectedSchools) {
            wizard.addSchool(school);
        }

        // Mostra as informações do mago
        System.out.println("Your wizard: " + wizard.getName());

        Orb orb = new Orb();
        Command copySpellsCommand = new CopySpellsCommand(orb, wizard);
        Command causeDistractionCommand = new CauseDistractionCommand(orb);
        Command healWizardCommand = new HealWizardCommand(orb, wizard);

        // Loop principal
        int choice = 0;
        while (true) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Execute Attack");
            System.out.println("2. Execute Defense");
            System.out.println("3. Execute Support");
            System.out.println("4. Command Orb to Copy Spells");
            System.out.println("5. Command Orb to Cause Distraction");
            System.out.println("6. Command Orb to Heal Wizard");
            System.out.println("0. Exit");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Choose Strategy:\n1. Aggressive\n2. Balanced");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice) {
                        case 1:
                            aggressiveAtk.apply(wizard);
                            break;
                        case 2:
                            balancedAtk.apply(wizard);
                            break;
                        default:
                            System.out.println("Invalid.");
                    }
                    break;
                case 2:
                    System.out.println("Choose Strategy:\n1. Full\n2. Balanced");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice) {
                        case 1:
                            fullDef.apply(wizard);
                            break;
                        case 2:
                            balancedDef.apply(wizard);
                            break;
                        default:
                            System.out.println("Invalid.");
                    }
                    break;
                case 3:
                    System.out.println("Choose Strategy:\n1. Full\n2. Balanced");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice) {
                        case 1:
                            fullSup.apply(wizard);
                            break;
                        case 2:
                            balancedSup.apply(wizard);
                            break;
                        default:
                            System.out.println("Invalid.");
                    }
                    break;
                case 4:
                    copySpellsCommand.execute();
                    break;
                case 5:
                    causeDistractionCommand.execute();
                    break;
                case 6:
                    healWizardCommand.execute();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static School chooseSchool(Scanner scanner, List<School> schools) {
        for (int i = 0; i < schools.size(); i++) {
            System.out.println((i + 1) + ". " + schools.get(i).getName() + " - " + schools.get(i).getDescription());
        }
        int choice = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline
        return schools.get(choice);
    }
}
