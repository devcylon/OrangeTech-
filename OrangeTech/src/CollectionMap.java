import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionMap {
    public static void main(String[] args) {
       
        Map<String, Double> carroPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carroPopulares.toString());

        carroPopulares.put("gol", 15.2);
        System.out.println(carroPopulares);
        System.out.println(carroPopulares.containsKey("uno"));
        System.out.println(carroPopulares.get("uno"));
        System.out.println(carroPopulares.keySet());
        System.out.println(carroPopulares.values());
        Double consumoMaisEficiente = Collections.max(carroPopulares.values());
        Set<Map.Entry<String, Double>> entries = carroPopulares.entrySet();
        String modeloMaisEficiente ="";

        for(Map.Entry<String, Double> entry : entries){
            if(entry.getValue().equals(consumoMaisEficiente))
            modeloMaisEficiente = entry.getKey();
        }
        System.out.println(modeloMaisEficiente+"-"+consumoMaisEficiente);
        
        Iterator<Double> iterator = carroPopulares.values().iterator();
        double soma =0.0;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        Iterator<Double> iterator1 = carroPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carroPopulares);


        //treeMap

        Map<String, Double> carrosPopulares2 = new TreeMap<>(carroPopulares);
        System.out.println(carrosPopulares2);

        carroPopulares.clear();
        System.out.println(carroPopulares.isEmpty());


        
    }
}
