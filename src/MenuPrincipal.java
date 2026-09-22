import br.com.alura.screenmatch.modelos.Filme;

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

    }
}
