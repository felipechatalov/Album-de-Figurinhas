public class FigEstadio extends Figurinha{
    private String pais;
    private String time;
    
    public FigEstadio(int id, String nome, String raridade, String pais, String time){
        super(id, raridade, nome);
        this.pais = pais;
        this.time = time;
    }

    public String toString(){
        return "Figurinha{" + "id=" + id + 
        ", raridade=" + raridade + 
        ", nome=" + nome + 
        ", pais=" + pais + 
        ", pais=" + pais +
        ", time=" + time + '}';
    }
}