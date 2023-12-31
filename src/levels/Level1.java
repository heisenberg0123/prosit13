package levels;

import models.Teacher;
import utils.Data;

import java.util.Comparator;
import java.util.List;

public class Level1 {

    public static void main(String[] args) {
        List<Teacher> employees = Data.employees();

        /*
         * TO DO 1: Afficher tous les enseignants
         */
        employees.stream().forEach(System.out::println);

        /*
         * TO DO 2: Afficher les enseignants dont le nom commence par la lettre n
         */
        employees.stream().filter(e -> e.getName().startsWith("n")).forEach(System.out::println);

        /*
         * TO DO 3: Afficher les enseignants dont le nom commence par la lettre n et le salaire > 100000
         */
        employees.stream().filter(e -> e.getName().startsWith("n")).filter(e -> e.getSalary() > 100000).forEach(System.out::println);

        /*
         * TO DO 4: Afficher les enseignants JAVA triés par salaire (éliminer les redondances)
         */
        employees.stream().filter(e -> e.getSubject().equals("JAVA")).distinct().sorted(Comparator.comparing(Teacher::getSalary)).forEach(System.out::println);

        /*
         * TO DO 5: Afficher les noms des enseignants dont le salaire > 60000 avec 2 manières différentes
         */

        /* First Way */
        employees.stream().filter(e -> e.getSalary() > 60000).forEach(e -> System.out.println(e.getName()));
        /* Second Way */
        employees.stream().filter(e -> e.getSalary() > 60000).map(Teacher::getName).forEach(System.out::println);

        /*
         * TO DO 6:  Ajouter 200 Dt pour les enseignants dont le nom commence par m et afficher celui qui a le salaire le plus élevé
         */
        //employees.stream().filter(/* TO DO 6 */).forEach(/* TO DO 6 */);

    }
}
