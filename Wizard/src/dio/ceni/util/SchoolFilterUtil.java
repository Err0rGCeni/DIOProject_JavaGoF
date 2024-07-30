package dio.ceni.util;

//import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import dio.ceni.schools.School;

public class SchoolFilterUtil {

    public static List<School> filterSchoolsWithAttackSpells(List<School> schools) {
        return schools.stream()
                      .filter(school -> !school.getAttackSpells().isEmpty())
                      .collect(Collectors.toList());
    }

    public static List<School> filterSchoolsWithNonSupportSpells(List<School> schools, List<School> selectedSchools) {
        return schools.stream()
                      .filter(school -> !selectedSchools.contains(school))
                      .filter(school -> !school.getAttackSpells().isEmpty() || !school.getDefenseSpells().isEmpty())
                      .collect(Collectors.toList());
    }

    public static List<School> filterRemainingSchools(List<School> schools, List<School> selectedSchools) {
        return schools.stream()
                      .filter(school -> !selectedSchools.contains(school))
                      .collect(Collectors.toList());
    }
}
