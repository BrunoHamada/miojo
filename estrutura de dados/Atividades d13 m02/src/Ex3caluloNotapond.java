// Bruno Hamada de Freitas
import java.util.Scanner;

public class Ex3caluloNotapond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Notas2 n1=new Notas2();
        Notas2 n2=new Notas2();
        Notas2 n3=new Notas2();
        Notas2 soma=new Notas2();
        Notas2 res=new Notas2();
        String Escolha="S";

        while(Escolha.equals("s") || Escolha.equals("S")){

            System.out.printf("%nDigite a 1º nota: (peso 0,5) ");
            n1.setNotas2(scan.nextFloat());
            System.out.printf("%nDigite a 2º nota: (peso 0,5) ");
            n2.setNotas2(scan.nextFloat());
            System.out.printf("%nDigite a 3º nota: (peso 0,25) ");
            n3.setNotas2(scan.nextFloat());

            soma.setNotas2((n1.getNotas2()*0.5) + (n2.getNotas2() * 0.5) + (n3.getNotas2()*0.25));
            res.setNotas2(soma.getNotas2()/3);

            System.out.printf("%nNota final: %.2f", res.getNotas2());
            System.out.printf("%nDeseja somar outras notas?(s/n)");
            Escolha = scan.next();
            System.out.printf("%n");}
        }
    }