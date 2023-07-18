// Bruno Hamada de Freitas
import java.util.Scanner;
class carrinho{
    public String item1 = "";
    public String item2 = "";
}
public class Ex4 {

        public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);
            carrinho objItens = new carrinho();

            System.out.print("Digite o 1º item que deseja adicionar: ");
            objItens.item1 = input.nextLine();
            System.out.print("Digite o 2º item que deseja adicionar: ");
            objItens.item2 = input.nextLine();

            System.out.println("Você adicionou " + objItens.item1 + " e " + objItens.item2 + " na lista.");
            System.out.println("Atenção! está não uma lista de compras completa, apenas exibe as duas informações " +
                    "que o úsuario digitou.");

        }
    }


