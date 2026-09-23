import br.com.alura.screenmatch.calculos.CalculadoraDeDuracao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class MenuPrincipal {
    public static void main(String[] args){
        Filme meuFilme = new Filme();
        meuFilme.setTitulo("Velozes e furiosos");
        meuFilme.setAnodelancamento(2001);
        meuFilme.setCategoria("Ação");
        meuFilme.setDuracao(120);

        meuFilme.exibaFichaTecnica();

        meuFilme.avaliacao(10);
        meuFilme.avaliacao(4);
        meuFilme.avaliacao(8);

        System.out.println("Avaliações: " + meuFilme.getTotaldeavaliacao());
        System.out.println("Média: " + meuFilme.MediaDeAvaliacoes());

        Serie serie = new Serie();
        serie.setTitulo("The Mentalist");
        serie.setAnodelancamento(2015);
        serie.setCategoria("Suspense");
        serie.setTemporadas(7);
        serie.setEpisodiosPortemporada(23);
        serie.setMinutosPorEpisodio(44);
        serie.exibaFichaTecnica();

        System.out.println("Duração em minutos para maratonar : " + serie.getDuracao() + "min");

        Filme meuFilme2 = new Filme();
        meuFilme2.setTitulo("Carros");
        meuFilme2.setAnodelancamento(2003);
        meuFilme2.setDuracao(110);

        CalculadoraDeDuracao calculadora = new CalculadoraDeDuracao();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        System.out.println(calculadora.getTempoTotal());

    }
}
