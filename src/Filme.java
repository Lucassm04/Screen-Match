public class Filme {
    String titulo;
    String categoria;
    int anodelancamento;
    boolean inclusonoplano;
    private double notas; // é a variavel das Soma das avaliações
    private int totaldeavaliacao;
    int duracao;

    int getTotaldeavaliacao(){
        return totaldeavaliacao;
    }

    void exibaFichaTecnica(){
        System.out.println(titulo);
        System.out.println(categoria);
        System.out.println("Ano: " + anodelancamento);
        System.out.println(duracao + "min");
    }

    void avaliacao(double critica){
        notas += critica;
        totaldeavaliacao++;
    }

    double MediaDeAvaliacoes(){
        return notas / totaldeavaliacao;
    }
}


