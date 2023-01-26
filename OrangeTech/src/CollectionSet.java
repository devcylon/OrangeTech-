import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.crypto.SealedObject;

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


        // ordenação com set

        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia ", 60));
            add(new Serie("dark", "drama ", 60));
            add(new Serie("that", "comedia ", 25));
        }};

        for(Serie serie: minhasSeries) System.out.println(serie.getNome());

        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia ", 60));
            add(new Serie("dark", "drama ", 60));
            add(new Serie("that", "comedia ", 25));
        }};

        for(Serie serie: minhasSeries1) System.out.println(serie.getNome());

        Set<Serie> minhasseries2 = new TreeSet<>(minhasSeries);
        System.out.println("rtrgfF");
        for(Serie serie: minhasseries2) System.out.println(serie.getNome()+" "+serie.getTempoEpisodio());

        System.out.println("ordem nome/genero/tempoepisodio");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for(Serie serie: minhasSeries3) System.out.println(serie.getNome()+" "+serie.getTempoEpisodio());

    }
}
class Serie implements Comparable<Serie>{
    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }
    private String nome;
    private String genero;
    private Integer tempoEpisodio;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }
    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }
    @Override
    public String toString() {
        return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((tempoEpisodio == null) ? 0 : tempoEpisodio.hashCode());
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
        Serie other = (Serie) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (tempoEpisodio == null) {
            if (other.tempoEpisodio != null)
                return false;
        } else if (!tempoEpisodio.equals(other.tempoEpisodio))
            return false;
        return true;
    }
    @Override
    public int compareTo(Serie serie) {
        // TODO Auto-generated method stub
        

        Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if(tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());
    }

    
}
class ComparatoNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        // TODO Auto-generated method stub
        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) return genero;
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());

    }

}
