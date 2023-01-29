import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import javax.sound.sampled.SourceDataLine;

public class StrreamAPI2 {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        System.out.println("Imprima todos os elementos dessa lista de string:");

        numerosAleatorios.forEach(s->System.out.println(s));

        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um set:");
        numerosAleatorios.stream().limit(5).collect(Collectors.toList()).forEach(System.out:: print );
    }
}
