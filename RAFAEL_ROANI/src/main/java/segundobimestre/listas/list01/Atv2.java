package segundobimestre.listas.list01;

import java.util.HashSet;
import java.util.Set;

public class Atv2 {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(4);
        numeros.add(5);

        System.out.println(numeros.contains(4));
        numeros.forEach(System.out::println);
    }
}
