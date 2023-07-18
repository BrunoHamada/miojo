// Bruno Hamada de Freitas
import java.util.Scanner;

public class Ex1calculo4num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Num n1=new Num();
        Num n2=new Num();
        Num n3=new Num();
        Num n4=new Num();
        Num res=new Num();
        String Escolha="S";

        while(Escolha.equals("s") || Escolha.equals("S")){
        System.out.printf("%nDigite o 1º número: ");
        n1.setValor(scan.nextInt());
        System.out.printf("%nDigite o 2º número: ");
        n2.setValor(scan.nextInt());
        System.out.printf("%nDigite o 3º número: ");
        n3.setValor(scan.nextInt());
        System.out.printf("%nDigite o 4º número: ");
        n4.setValor(scan.nextInt());
        res.setValor(n1.getValor() + n2.getValor() + n3.getValor() + n4.getValor());

        System.out.printf("%nO resultado é: %d", res.getValor());
        System.out.printf("%nSomar novos valores?(s/n)");
        Escolha = scan.next();
        System.out.printf("%n");
        }
    }
}
