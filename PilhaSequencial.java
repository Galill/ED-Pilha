package Pilha;

public class PilhaSequencial extends No implements Pilha {

    private int dados[];
    private int topo;
    private int tamMax;

    public PilhaSequencial() {
        tamMax = 100; 
        dados = new int[tamMax];
        topo = -1;
    }

    /*Método que verifica se a pilha está vazia e retorna true (caso esteja vazia) ou false (caso tenha algum elemento nela).*/
    @Override
    public boolean vazia() {
        if(topo == -1)
            return true;
        else
            return false;
    }
    /*Método que verifica se a pilha está cheia e retorna true (caso esteja vazia) ou false (caso tenha algum elemento nela).*/
    public boolean cheia(){
        if(topo == (tamMax - 1))
            return true;
        else 
            return false;
    }

    /*Método que retorna o tamanho da pilha.*/
    @Override
    public int tamanho() {
        return topo + 1;
    }

    /*Método que verifica e retorna o valor no topo da pilha ou -1 caso ela esteja vazia.*/
    @Override
    public int top() {
        if(vazia())
            return -1;

        return dados[topo];
    }

    /*Método que insere um novo valor no topo da pilha*/
    @Override
    public boolean push(int valor) {
        if(cheia())
            return false;

        topo++;
        dados[topo] = valor;
        return true;
    }

    /*Método que remove o valor no topo da pilha*/
    @Override
    public int pop() {
        if(vazia())
            return -1;
        
        int valor = dados[topo];
        topo--;
        return valor;
    }
    
}
