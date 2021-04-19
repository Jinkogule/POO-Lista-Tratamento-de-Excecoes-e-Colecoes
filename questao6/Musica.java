package lista6.questao6;

public class Musica {
    private String nome;
    private String artista;

    public Musica(String artista, String nome){
        this.artista = artista;
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public String getNome() {
        return nome;
    }
}
