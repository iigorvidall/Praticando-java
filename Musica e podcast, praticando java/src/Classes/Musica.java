package Classes;

public class Musica extends Audio{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void exibeMusica(){
        System.out.println("\nNome da música: "+nome);
    }
}
