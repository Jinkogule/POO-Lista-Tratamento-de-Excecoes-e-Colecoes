package lista6.questao6;

public class Q6_Main {
    public static void main(String[] args) throws MusicaNaoIncluida {
        Musica m1 = new Musica("Linkin Park", "Lying From You");
        Musica m2 = new Musica("Korn", "Blind");
        Musica m3 = new Musica("Korpiklaani", "Wooden Pints");
        Musica m4 = new Musica("Finntroll", "Jaktens Tid");
        Musica m5 = new Musica("Angra", "Carry On");

        Karaoke.AddNoKaraoke(m1);
        Karaoke.AddNoKaraoke(m2);
        Karaoke.AddNoKaraoke(m3);
        Karaoke.AddNoKaraoke(m4);

        Karaoke.OrdenadaPorArtista();
        Karaoke.OrdenadaPorNome();

        Karaoke.ColocaNaFila(m2);
        Karaoke.ColocaNaFila(m4);
        Karaoke.ColocaNaFila(m1);
        try{
            Karaoke.ColocaNaFila(m5);
        }
        catch (Exception e){
            System.out.println(e.getMessage()+"\n");
        }

        Karaoke.TocandoAgora();
        Karaoke.PularMusica();
        Karaoke.TocandoAgora();
        Karaoke.PularMusica();
        Karaoke.TocandoAgora();
    }
}
