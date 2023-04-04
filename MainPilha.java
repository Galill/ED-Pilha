package Pilha;

public class MainPilha {
    
    public static void main(String[] args){
        PilhaSequencial pilhaSeq = new PilhaSequencial();
        PilhaEncadeada pilhaEncad = new PilhaEncadeada();

        System.out.printf("Pilha Sequencial:\n\n");

        pilhaSeq.push(111);
        pilhaSeq.push(222);
        pilhaSeq.push(333);

        System.out.println("Valor no topo: " + pilhaSeq.top());
        System.out.println("Tamanho atual da pilha: " +  pilhaSeq.tamanho());

        System.out.printf("\nRemovendo valor!\n\n");

        pilhaSeq.pop();
        System.out.println("Novo valor no topo: " + pilhaSeq.top());
        System.out.println("A pilha está vazia? " + pilhaSeq.vazia());
        System.out.println("Tamanho atual da pilha: " + pilhaSeq.tamanho());

        System.out.printf("\n\n");

        System.out.printf("Pilha encadeada:\n\n");

        pilhaEncad.push(999);
        pilhaEncad.push(888);
        pilhaEncad.push(777);

        System.out.println("Valor no topo: " + pilhaEncad.top());
        System.out.println("Tamanho atual da pilha: " + pilhaEncad.tamanho());

        System.out.printf("\nRemovendo valor!\n\n");

        pilhaEncad.pop();
        System.out.println("Novo elemento no topo: " + pilhaEncad.top());
        System.out.println("A pilha está vazia? " + pilhaEncad.vazia());
        System.out.println("Tamanho atual da pilha: " + pilhaEncad.tamanho());
    }
}
