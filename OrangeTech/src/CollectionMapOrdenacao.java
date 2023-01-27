import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionMapOrdenacao {
    public static void main(String[] args) {

        System.out.println("Ordem aleatória");
        Map<String, Livro> meuslivros = new HashMap<>(){{
            put("hawking, Stephen", new Livro("uma breve história do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
        }};
        for(Map.Entry<String, Livro> livro : meuslivros.entrySet()){
        System.out.println(livro.getKey()+" - "+ livro.getValue().getNome());
        }
        System.out.println("Ordem alfabética autores");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meuslivros);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()){
            System.out.println(livro.getKey() + " - "+livro.getValue().getNome());
        }
        System.out.println("Ordem alfabética dos livros");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meuslivros.entrySet());
        for(Map.Entry<String, Livro> livro : meusLivros3){
            System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
        }
        
    
    }
}
class Livro{
    private String nome;
    private int paginas;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + paginas;
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
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (paginas != other.paginas)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "livro [nome=" + nome + ", paginas=" + paginas + "]";
    }
    public Livro(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }
    
}
class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        // TODO Auto-generated method stub
   
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }

}