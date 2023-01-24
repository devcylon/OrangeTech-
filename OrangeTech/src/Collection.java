import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Collection {

    public static void main(String[] args) {
        List<Double> notas =new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());
        System.out.println(notas.indexOf(5d));
        notas.add(4, 8d);
        System.out.println(notas);
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);
        System.out.println(notas.contains(5.0));
        for(Double nota : notas) System.out.println(nota);
        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));
        Iterator<Double> iterator = notas.iterator();
        double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);
        System.out.println(soma/notas.size());
        notas.remove(0.0);
        System.out.println(notas);
        notas.remove(0);
        System.err.println(notas);
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            double next = iterator1.next();
            if(next < 7)iterator1.remove();
        }
        System.out.println(notas);



    }
    
}
