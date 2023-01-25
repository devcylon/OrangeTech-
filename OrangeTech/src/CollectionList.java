import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;



public class CollectionList {

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

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("John", 18, "Preto"));
            add(new Gato("Simba", 6, "Trigado"));
            add(new Gato("Jon", 12, "Amarelo"));
        }};
        System.out.println(meusGatos);

        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        Collections.sort(meusGatos);
        System.out.println("meus gatos"+ meusGatos);

        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());

        System.out.println("Ordem Idade");
        System.out.println(meusGatos);

        System.out.println("Ordem Cor");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);
        
        System.out.println("Nome/cor/idade");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
    
}
class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    @Override
    public String toString() {
        return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
    }
    @Override
    public int compareTo(Gato gato) {
        // TODO Auto-generated method stub
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
    
    
}
class ComparatorIdade implements Comparator<Gato>{
    public int compare(Gato g1, Gato g2){
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        // TODO Auto-generated method stub
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}
class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0)return nome;
        
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}