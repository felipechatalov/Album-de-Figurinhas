public class Pagina{
    private int qtdFigurinhas = 0;
    private int maxFigurinhas = 0;
    public Pagina(int maxFigurinhas, int qtdFigurinhas){
        this.maxFigurinhas = maxFigurinhas;
        this.qtdFigurinhas = qtdFigurinhas;
    }

    public String toString(){
        return "Pagina{" + "maxFigurinhas=" + maxFigurinhas +
        "qtdFigurinhas=" + qtdFigurinhas + 
        '}';
    }
}