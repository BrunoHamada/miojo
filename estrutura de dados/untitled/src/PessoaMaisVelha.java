import java.util.Scanner;

public class PessoaMaisVelha {

    public static void main(String[] args) {
        int quantidadePessoas = 5;
        int idadeMaisVelha = 0;
        int idadeMaisNova= Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();

            if (idade > idadeMaisVelha) {
                idadeMaisVelha = idade;
            }

            else if (idade < idadeMaisNova) {
                idadeMaisNova= idade;
            }
        }

        System.out.println("A pessoa mais velha tem " + idadeMaisVelha + " anos.");
        System.out.println("A pessoa mais nova tem " + idadeMaisNova + " anos.");

    }
}
