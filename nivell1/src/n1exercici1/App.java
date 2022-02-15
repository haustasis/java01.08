package n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
    // Fase 1 A
    // Tenint una llista de cadenes de noms propis, escriu un mètode que retorni una llista de totes les cadenes
    // que comencen amb la lletra 'a' (mayuscula) i tenen exactament 3 lletres. Imprimeix el resultat.
        System.out.println("[+] FASE 1A");
        ArrayList<String> llista1A = new ArrayList<>();
        llista1A.add("ABC");
        llista1A.add("abc");
        llista1A.add("ABCD");
        llista1A.add("Abcd");
        llista1A.add("ACB");

        List<String> llista1AA = llista1A
                .stream()
                .filter(str -> str.charAt(0) == 'A' && str.length() == 3)
                .collect(Collectors.toList());

        System.out.println(llista1AA);

        System.out.println("----------");

    // Fase 1 B
    // Escriu un mètode que retorna una cadena separada per comes basada en una llista d’Integers.
    // Cada element hauria d'anar precedit per la lletra "e" si el nombre és parell,
    // i precedit de la lletra "o" si el nombre és imparell. Per exemple, si la llista  d'entrada és (3,44),
    // la sortida hauria de ser "o3, e44". Imprimeix el  resultat.
        System.out.println("[+] FASE 1B");
        List<Integer> llista1B = Arrays.asList(3, 44, 9, 88);

        List<String> llista1BB = llista1B
                .stream()
                .filter(n -> n % 2 == 0)
                .map(n -> "e" + n)
                .collect(Collectors.toList());

        List<String> llista1BBB = llista1B
                .stream()
                .filter(n -> n % 2 != 0)
                .map(n -> "o" + n)
                .collect(Collectors.toList());

        List<String> llista1b = Stream.concat(llista1BB.stream(), llista1BBB.stream()).collect(Collectors.toList());

        System.out.println(llista1b);

        System.out.println("----------");

    // Fase 1 C
    // Tenint una llista de Strings, escriu un mètode que retorna una llista de totes les cadenes
    // que continguin la lletra ‘o’ i imprimeix el resultat.
        System.out.println("[+] FASE 1C");
        ArrayList<String> llista1C = new ArrayList<>();
        llista1C.add("Jordi profe");
        llista1C.add("Ana");
        llista1C.add("Maria alumne");
        llista1C.add("Toni alumne");
        llista1C.add("Carlo");

        List<String> llista1CC = llista1C
                .stream()
                .filter(str -> str.contains("o"))
                .collect(Collectors.toList());

        System.out.println(llista1CC);

        System.out.println("----------");

    // Fase 1 D
    // Has de fer el mateix que en el punt anterior, però retornant una llista que inclogui els elements
    // amb més de 5 lletres. Imprimeix el resultat.
        System.out.println("[+] FASE 1D");
        ArrayList<String> llista1D = new ArrayList<>();
        llista1D.add("Jordi profe");
        llista1D.add("Ana");
        llista1D.add("Maria alumne");
        llista1D.add("Toni alumne");
        llista1D.add("Carlo");

        List<String> llista1DD = llista1D
                .stream()
                .filter(str -> str.contains("o") && str.length() > 5)
                .collect(Collectors.toList());

        System.out.println(llista1DD);

        System.out.println("----------");

    // Fase 1 E
    // Crea una llista amb els noms de mesos de l’any. Imprimeix tots els elements de la llista amb una lambda.
        System.out.println("[+] FASE 1E");
        ArrayList<String> llista1E = new ArrayList<>();
        llista1E.add("Gener");
        llista1E.add("Febrer");
        llista1E.add("Març");
        llista1E.add("Abril");
        llista1E.add("Maig");
        llista1E.add("Juny");
        llista1E.add("Juliol");
        llista1E.add("Agost");
        llista1E.add("Setembre");
        llista1E.add("Octubre");
        llista1E.add("Novembre");
        llista1E.add("Decembre");

        llista1E.forEach(mes -> System.out.println(mes));

        System.out.println("----------");

    // Fase 1 F
    // Has de fer la mateixa impressió del punt anterior però fent-ho mitjançant method reference.
        System.out.println("[+] FASE 1F");

        llista1E.forEach(System.out::println);

        System.out.println("----------");

    }
}
