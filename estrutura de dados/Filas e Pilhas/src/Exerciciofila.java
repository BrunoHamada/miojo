public class Exerciciofila {
    public static void main(String[] args) {

        Fila fila= new Fila();

        fila.adicionar(0);
        fila.remover();
        fila.mostrar();

        System.out.println("qtde de elementos possiveis na fila: "+fila.tamanho);
        fila.adicionar(4);
        fila.adicionar(8);

        System.out.println("qtde de elemntos na fila: "+fila.fim);
        System.out.println("Fila está cheia? "+fila.estaCheia());
        System.out.println("Fila está vázia? "+fila.estaVazia());
    }
}
