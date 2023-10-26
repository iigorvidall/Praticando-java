package Classes;

public class Audio {
    private int duracao;
    private int totalReproducoes;
    private int curtidas;
    private double classificacao;

    //==============================================================================


    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }
    //==============================================================================

    public void exibeFicha(){
        System.out.println("Duração: "+getDuracao()+" minutos");
        System.out.println("total de reproducoes: "+getTotalReproducoes());
        System.out.println("curtidas: "+ getCurtidas());
    }


}