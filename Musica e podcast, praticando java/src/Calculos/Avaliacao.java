package Calculos;


public class Avaliacao {
    private int totalAvaliacao;
    private int nota;
    private int pegaMedia;
    public double media (double nota){
        pegaMedia += nota;
        totalAvaliacao++;
        return nota;
    }
    public void mostraMedia(){
        System.out.println("Total de avaliações: "+totalAvaliacao);
        double Mediamedia =  (double) pegaMedia /totalAvaliacao;
        System.out.printf("Classificação: %.2f",Mediamedia);
        System.out.println("\n==========================================");
    }


}
