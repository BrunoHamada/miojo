import java.util.Stack;
public class Pilhas {
    public static void main(String[] args) {

        Stack<String> carros= new Stack<>();

        carros.push("Skyline");
        carros.push("Golf");
        carros.push("Sprint trueno");
        carros.push("Camaro");
        carros.push("350z");

        //System.out.println("Topo da pilha: "+ carros.peek());// exibe o topo da fila apenas.
        System.out.println("Topo da pilha: "+ carros.pop());// exibe o topo e arranca da lista.
        System.out.println(carros);
        //carros.clear();
        System.out.println(carros.empty()?"Pilha vazia":"Pilha com elementos");
        //                       Funciona  como um if  ^  escolhendo entre essas duas opções onde uma é para quando a
        // lista estiver vazia


        /*for(String c:carros){
            System.out.println(carros);
        } */
    }
}
