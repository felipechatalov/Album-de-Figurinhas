// javac Figurinha.java & javac FigSelecao.java & javac FigEstadio.java & javac FigJogador.java & javac Album.java
// java Main.java
public class Main{
    public static void main(String[] args){


        Figurinha f = new Figurinha(1, "Comum", "Figurinha");
        FigJogador fj = new FigJogador(2, "Raro", "Messi", "PD", "PSG", "Argentina");
        FigSelecao fs = new FigSelecao(3, "Epico", "Brasil", 5, "Tite");
        FigEstadio fe = new FigEstadio(4, "Incomum", "Itaquera", "Sao Brasil", "Corinthians");
        // 32 selecoes + 1 pagina de estadios
        Pagina p = new Pagina(12, 0);
        Album a = new Album(33);
        

        System.out.println(f.toString());
        System.out.println(fj.toString());
        System.out.println(fs.toString());
        System.out.println(fe.toString());
        System.out.println(p.toString());
        System.out.println(a.toString());

    }
}