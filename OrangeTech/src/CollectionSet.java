import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7.0, 8.5, 9.3, 5.0, 7.0, 0.0, 3.6));
        System.out.println(notas.toString());

        System.out.println(notas.contains(5.0));

        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));

        Iterator<Double> iterator =  notas.iterator();
        double soma= 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);
        System.out.println(soma/notas.size());

        notas.remove(0.0);
        System.out.println(notas);

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            double next= iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);

        System.out.println(notas2);

        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

    }
}
