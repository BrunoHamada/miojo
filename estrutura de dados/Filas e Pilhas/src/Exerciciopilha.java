public class Exerciciopilha {
    public static void main(String[] args) {

        Pilha pilha= new Pilha(3);

        pilha.empilha(3);
        pilha.empilha(6);
        pilha.empilha(9);
        pilha.empilha(1);

        System.out.println("Pilha está cheia? "+pilha.cheia());
        System.out.println(pilha);
        int topo = pilha.topo;
        System.out.println("Posição do topo: "+topo);
        pilha.desimpilha();
        System.out.println(pilha);
        pilha.desimpilha();
        System.out.println(pilha);
        pilha.desimpilha();
        System.out.println(pilha);
        pilha.desimpilha();

        System.out.println();
        System.out.println("Pilha está cheia? "+pilha.cheia());
        /*
        System.out.println(pilha);
        pilha.empilha(1);
         System.out.println(pilha);
        */
    }
}
