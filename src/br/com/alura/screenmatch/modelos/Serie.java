package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPortemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPortemporada() {
        return episodiosPortemporada;
    }

    public void setEpisodiosPortemporada(int episodiosPortemporada) {
        this.episodiosPortemporada = episodiosPortemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracao() {
        return temporadas * episodiosPortemporada * minutosPorEpisodio;
    }
}
