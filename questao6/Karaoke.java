package lista6.questao6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Stream;
import java.util.Queue;

public class Karaoke {
    private static ArrayList<Musica> MusicasKaraoke = new ArrayList<>();
    private static ArrayList<String> Ordered_by_Artist = new ArrayList<>();
    private static ArrayList<String> Ordered_by_Song = new ArrayList<>();

    private static Queue<String> filaTocaMusicas = new LinkedList<>();

    public static void AddNoKaraoke(Musica musica){
        MusicasKaraoke.add(musica);
        Ordered_by_Artist.add(musica.getArtista()+" - "+musica.getNome());
        Ordered_by_Song.add(musica.getNome()+" - "+musica.getArtista());
    }

    public static void OrdenadaPorArtista(){
        System.out.println("ORDENADA POR ARTISTA:");
        Stream<String> Ordered_by_Artist = Karaoke.Ordered_by_Artist.stream().sorted(Comparator.naturalOrder());
        Ordered_by_Artist.forEach(e -> System.out.println(e));
        System.out.println();
    }

    public static void OrdenadaPorNome(){
        System.out.println("ORDENADA POR NOME:");
        Stream<String> Ordered_by_Song = Karaoke.Ordered_by_Song.stream().sorted(Comparator.naturalOrder());
        Ordered_by_Song.forEach(e -> System.out.println(e));
        System.out.println();
    }

    public static void ColocaNaFila(Musica musica) throws MusicaNaoIncluida {
        if (MusicasKaraoke.contains(musica)){
            filaTocaMusicas.add(musica.getArtista()+" - "+musica.getNome());
        }
        else{
            throw new MusicaNaoIncluida("Música não está incluída no karaokê.");
        }
    }

    public static void TocandoAgora(){
        System.out.println("Tocando agora: "+filaTocaMusicas.peek());
    }

    public static void PularMusica(){
        System.out.println("-Música pulada-");
        filaTocaMusicas.remove();
    }
}
