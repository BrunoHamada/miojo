// Bruno Hamada de Freitas
import java.util.Scanner;

public class Ex4ReajusteSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Funcionario sa= new Funcionario();
        Funcionario rea= new Funcionario();
        String Escolha="S";

        while(Escolha.equals("s") || Escolha.equals("S")){
        System.out.printf("%nDigite o valor do seu salário: ");
        sa.setSalario(scan.nextDouble());
        rea.setSalario((sa.getSalario() * 0.25) + sa.getSalario());

        System.out.printf("%nO seu salário após o reajuste de 25%% é: %.2f", rea.getSalario());
            System.out.printf("%nDeseja consultar um novo valor?(s/n)");
            Escolha = scan.next();
    }
    }}
