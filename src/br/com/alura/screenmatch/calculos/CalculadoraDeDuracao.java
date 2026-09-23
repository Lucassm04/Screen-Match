package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;

public class CalculadoraDeDuracao {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Filme f){
        tempoTotal += f.getDuracao();
    }
}
