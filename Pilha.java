package Pilha;

public interface Pilha {
    
    /*Verifica se a pilha está vazia.*/
    public boolean vazia();

    /*Retorna o tamanho da pilha.*/
    public int tamanho();

    /*Retorna o elemento no topo da pilha.*/
    public int top();

    /*Insere um elemento no topo da pilha.*/
    public boolean push(int valor);

    /*Remove o elemento do topo da pilha.*/
    public int pop();
}
