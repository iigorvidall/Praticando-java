/*
* Sistema de audio, musicas, musicas preferidas, podcasts...
* avaliações, reproduções, curtidas e etc
*
* */


import Classes.Audio;
import Classes.Musica;
import Classes.Podcast;
import Calculos.Avaliacao;

public class Main {
    public static void main(String[] args) {
        Audio audio = new Audio();
        Musica musica = new Musica();
        Podcast podcast = new Podcast();
        Avaliacao avaliaMusica = new Avaliacao();
        Avaliacao avaliaPodcast = new Avaliacao();

        musica.setNome("50Cent");
        musica.setDuracao(4);
        musica.setTotalReproducoes(115);
        musica.setCurtidas(19);
        avaliaMusica.media(5.8);
        avaliaMusica.media(9.1);
        avaliaMusica.media(6.5);

        musica.exibeMusica();
        musica.exibeFicha();
        avaliaMusica.mostraMedia();

        //---------------------------
        podcast.setConvidados("Jhon, Peiper e Anne");
        podcast.setDuracao(125);
        podcast.setTotalReproducoes(89);
        podcast.setCurtidas(68);
        podcast.exibePodcast();
        podcast.exibeFicha();

        avaliaPodcast.media(9.5);
        avaliaPodcast.media(9.8);
        avaliaPodcast.media(8.1);
        avaliaPodcast.media(10);

        avaliaPodcast.mostraMedia();
        }
    }