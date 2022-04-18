public class Album{
    private Pagina[] paginas;
    private int qtdFigurinhas = 0;
    private int maxPaginas = 0;
    // 32 selecoes
    // 1 selecao por pagina
    // pagina:
    // 11 figurinhas de jogadores
    // 1 do brasao da selecao

    // + 12 figurinhas de estadios
    // 364 figurinhas

    // figurinha da bola?? 
    // figurinha da taça??


    // paginas de figurinhas
    // primeira pagina para os estadios, 12 divido em 4 linhas de figurinhas

    // para paginas de selecoes, vai ter:
    // 1 selecao por pagina
    // nome da selecao escrito em cima da pagina
    // figurinha do brasao + 5 de jogadores na 1 linha
    // mais 6 jogadores na linha debaixo
    // fundo com a bandeira da selecao  


    public Album(int maxPaginas){
        this.maxPaginas = maxPaginas;
    }

    public String toString(){
        return "Album{" + "paginas=" + paginas + 
        ", qtdFigurinhas=" + qtdFigurinhas +
        ", maxPaginas=" + maxPaginas + 
        '}';
    }
}