import java.util.Stack;
public class Maquina {
    public static void main(String[] args) {

        Stack<String> pecas= new Stack<>();

        pecas.push("peça sem defeito 1");
        pecas.push("peça sem defeito 2");
        pecas.push("peça sem defeito 3");
        pecas.push("peça sem defeito 4");
        pecas.push("peça com defeito 1");
        pecas.push("peça sem defeito 5");

        System.out.println();
        System.out.println(pecas);
        System.out.println("Peça com defeito encontrada! Iniciando troca!");
        System.out.println();

        System.out.println("Peça com defeito encontrada! Desempilhando peças!");
        System.out.println("Topo da pilha: "+ pecas.pop());
        System.out.println(pecas);
        System.out.println();

        System.out.println("Peça com defeito encontrada! Substituindo peça!");
        System.out.println("Topo da pilha: "+ pecas.pop());
        System.out.println(pecas);
        System.out.println();

        pecas.push("peça sem defeito 5");
        System.out.println("Peça com defeito substituida! ");
        System.out.println("Topo da pilha: "+ pecas.push("peça sem defeito 6"));
        System.out.println(pecas);
        System.out.println();

        System.out.println("Início da montagem, retirando peça para montar!");
        System.out.println("Topo da pilha: "+ pecas.pop());
        System.out.println(pecas.empty()?"Pilha de peças vazia!":"Pilha com peças!");
        System.out.println(pecas);
        System.out.println();

        System.out.println("Retirando peça para montar!");
        System.out.println("Topo da pilha: "+ pecas.pop());
        System.out.println(pecas.empty()?"Pilha de peças vazia!":"Pilha com peças!");
        System.out.println(pecas);
        System.out.println();

        System.out.println("Retirando peça para montar!");
        System.out.println("Topo da pilha: "+ pecas.pop());
        System.out.println(pecas.empty()?"Pilha de peças vazia!":"Pilha com peças!");
        System.out.println(pecas);
        System.out.println();

        System.out.println("Retirando peça para montar!");
        System.out.println("Topo da pilha: "+ pecas.pop());
        System.out.println(pecas.empty()?"Pilha de peças vazia!":"Pilha com peças!");
        System.out.println(pecas);
        System.out.println();

        System.out.println("Retirando peça para montar!");
        System.out.println("Topo da pilha: "+ pecas.pop());
        System.out.println(pecas.empty()?"Pilha de peças vazia!":"Pilha com peças!");
        System.out.println(pecas);
        System.out.println();

        System.out.println("Retirando peça para montar!");
        System.out.println("Topo da pilha: "+ pecas.pop());
        System.out.println(pecas);
        System.out.println(pecas.empty()?"Pilha de peças vazia!":"Pilha com peças!");
    }
}
