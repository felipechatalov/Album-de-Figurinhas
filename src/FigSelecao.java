public class FigSelecao extends Figurinha{
    private int qtdCopas;
    private String tecnico;

    public FigSelecao(int id, String nome, String raridade, int qtdCopas, String tecnico){
        super(id, raridade, nome);
        this.qtdCopas = qtdCopas;
        this.tecnico = tecnico;
    }

    public String toString(){
        return "Figurinha{" + "id=" + id + 
        ", raridade=" + raridade + 
        ", nome=" + nome + 
        ", qtdCopas=" + qtdCopas +
        ", tecnico=" + tecnico + 
        '}';
    }
}