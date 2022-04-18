public class FigJogador extends Figurinha{
    private String posicao;
    private int[] stats;
    private String selecao;
    private String time;
    
    public FigJogador(int id, String raridade, String nome, String posicao, String selecao, String time){
        super(id, raridade, nome);
        this.posicao = posicao;
        this.selecao = selecao;
        this.time = time;
    }

    public String toString(){
        return "Figurinha{" + "id=" + id +
        ", raridade=" + raridade + 
        ", nome=" + nome + 
        ", posicao=" + posicao +
        ", stats=" + stats +
        ", selecao=" + selecao + 
        ", time=" + time + 
        '}';
    }
}