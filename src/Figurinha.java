public class Figurinha{
    public int id;
    public String nome;
    public String raridade;
    
    public Figurinha(int id, String raridade, String nome){
        this.id = id;
        this.raridade = raridade;
        this.nome = nome;
    }

    public String toString(){
        return "Figurinha{" + "id=" + id + 
        ", raridade=" + raridade + 
        ", nome=" + nome + 
        '}';
    }
}