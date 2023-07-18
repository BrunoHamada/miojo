import java.util.LinkedList;
import java.util.Queue;

public class Filas {
    public static void main(String[] args) {

        Queue<String> carros= new LinkedList<>();

        carros.add("Skyline");
        carros.add("Golf");
        carros.add("Sprint trueno");
        carros.add("Camaro");
        carros.add("350z");

        // System.out.println("Topo da fila: "+ carros.peek());// exibe o topo da fila apenas.
        System.out.println("Topo da fila: "+ carros.poll());// Mesma função do pop em pilha, mostrando e retirando o
        // elemento da fila.
        System.out.println(carros);
        //carros.clear();
        System.out.println(carros.isEmpty()?"Fila vazia":"Fila com elementos");

    }
}
