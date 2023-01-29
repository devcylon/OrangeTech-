import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionStreamAPI {
    public static void main(String[] args) {
        System.out.println("ordem aleatória");
        Map<Integer, Contato> agenda = new HashMap<>(){{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println(agenda);
        for(Map.Entry<Integer, Contato> entry : agenda.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue().getNome());
        }

        System.out.println("Ordem inseção");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>(){{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println(agenda1);
        for(Map.Entry<Integer, Contato> entry : agenda1.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue().getNome());
        }
        System.out.println("Ordem ID");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        for(Map.Entry<Integer, Contato> entry : agenda2.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue().getNome());
        }

       System.out.println("ordem numero telefone");
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>(){
                @Override
                public int compare(Entry<Integer, Contato> c1, Entry<Integer, Contato> c2) {
                    // TODO Auto-generated method stub
                    return c1.getValue().getNumero().compareTo(c2.getValue().getNumero());
                }}
        );
        set1.addAll(agenda.entrySet());
        for(Map.Entry<Integer, Contato> entry : set1){
            System.out.println(entry.getKey()+ " - "+entry.getValue().getNumero());
        }
        System.out.println("Ordem Nome contato");
        Set<Map.Entry<Integer, Contato>> set2 = new TreeSet<>(Comparator.comparing(cont-> cont.getValue().getNumero()));
        set2.addAll(agenda.entrySet());
        for(Map.Entry<Integer, Contato> entry : set2){
            System.out.println(entry.getKey()+" - "+entry.getValue().getNome());
        }
   
    } 
}
class Contato{
    private String nome;
    private Integer numero;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public Contato(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contato other = (Contato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", numero=" + numero + "]";
    } 
}
class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>>{
    @Override
    public int compare(Entry<Integer, Contato> c1, Entry<Integer, Contato> c2) {
        // TODO Auto-generated method stub
        return c1.getValue().getNumero().compareTo(c2.getValue().getNumero());
    }

}
class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>>{

    @Override
    public int compare(Entry<Integer, Contato> c1, Entry<Integer, Contato> c2) {
        return c1.getValue().getNome().compareToIgnoreCase(c2.getValue().getNome());
    }

}