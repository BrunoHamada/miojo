import java.util.ArrayList;

public class ArrayL {
    // Array dinâmico ou Lista.
    public static void main(String[] args) {
        ArrayList<String> contatos= new ArrayList<>();
        contatos.add("Bruno Hamada");
        contatos.add("99999-9999");
        contatos.add("bruno@email.com");
        contatos.add("José de Assis");
        contatos.add("5555-5555");
        contatos.add("ze@email.com");
        System.out.println();
        System.out.println("Tamanho do array: "+contatos.size());
        System.out.println();
        System.out.println(contatos);
        System.out.println("E-mail José de Assis (índice[5]): "+contatos.get(5));

        // Percorrendo o array com laço "for" para obter todos os valores armazenados
        System.out.println("______________________");
        for(int i=0;i<contatos.size();i++){
            System.out.println(contatos.get(i));
        }
    }
}
