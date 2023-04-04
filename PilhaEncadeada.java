package Pilha;

public class PilhaEncadeada extends No implements Pilha {
    private No topo;
    private int nElementos;

    public PilhaEncadeada (){
        topo = null;
        nElementos = 0;
    }

    /*Método que verifica se a pilha está vazia e retorna true (caso esteja vazia) ou false (caso tenha algum elemento nela).*/
    @Override
    public boolean vazia() {
        if(nElementos == 0)
            return true;
        else
            return false;
    }

    /*Método que retorna o tamanho da pilha.*/
    @Override
    public int tamanho() {
        return nElementos;
    }

    /*Método que verifica e retorna o valor no topo da pilha ou -1 caso ela esteja vazia.*/
    @Override
    public int top() {
        if(vazia())
            return -1;
        else
            return topo.getConteudo();
    }

    /*Método que insere um novo valor no topo da pilha, para isso, ele cria um novoNo e o aponta para quem o topo da pilha aponta, então, ele aponta o topo para novoNo.*/
    @Override
    public boolean push(int valor) {
        No novoNo = new No();
        novoNo.setConteudo(valor);
        novoNo.setProximo(topo);

        topo = novoNo;
        nElementos++;
        return true;
    }

    /*Método que remove o valor no topo da pilha, para isso, ele cria o No p e o aponta para quem o topo da pilha aponta, então, ele aponta o topo para o 
    próximo de p e faz p ser nulo.*/
    @Override
    public int pop() {
        if(vazia())
            return -1;
        No p = topo;
        int valor = p.getConteudo();

        topo = p.getProximo();
        nElementos--;

        p = null;
        return valor;
    }
    
}
