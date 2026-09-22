package br.com.alura.screenmatch.modelos;

public class Filme {
   private String titulo;
   private String categoria;
   private int anodelancamento;
    private boolean inclusonoplano;
    private double notas; // é a variavel das Soma das avaliações
    private int totaldeavaliacao;
   private int duracao;

    public int getTotaldeavaliacao(){
        return totaldeavaliacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getAnodelancamento() {
        return anodelancamento;
    }

    public boolean isInclusonoplano() {
        return inclusonoplano;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnodelancamento(int anodelancamento) {
        this.anodelancamento = anodelancamento;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setInclusonoplano(boolean inclusonoplano) {
        this.inclusonoplano = inclusonoplano;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void exibaFichaTecnica(){
        System.out.println(titulo);
        System.out.println(categoria);
        System.out.println("Ano: " + anodelancamento);
        System.out.println(duracao + "min");
    }

    public void avaliacao(double critica){
        notas += critica;
        totaldeavaliacao++;
    }

    public double MediaDeAvaliacoes(){
        return notas / totaldeavaliacao;
    }
}


