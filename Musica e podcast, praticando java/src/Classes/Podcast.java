package Classes;

public class Podcast extends Audio{
    private String titulo;
    private String convidados;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConvidados() {
        return convidados;
    }

    public void setConvidados(String convidados) {
        this.convidados = convidados;
    }

    public void exibePodcast(){
        System.out.println("---Podcast histórico---");
        System.out.println("Convidados: "+convidados);
    }
}
