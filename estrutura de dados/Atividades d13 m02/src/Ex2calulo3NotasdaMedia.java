// Bruno Hamada de Freitas
import java.util.Scanner;

public class Ex2calulo3NotasdaMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Notas n1=new Notas();
        Notas n2=new Notas();
        Notas n3=new Notas();
        Notas soma=new Notas();
        Notas res=new Notas();
        String Escolha="S";

        while(Escolha.equals("s") || Escolha.equals("S")){

        System.out.printf("%nDigite a 1º nota: ");
        n1.setNota(scan.nextFloat());
        System.out.printf("%nDigite a 2º nota: ");
        n2.setNota(scan.nextFloat());
        System.out.printf("%nDigite a 3º nota: ");
        n3.setNota(scan.nextFloat());

        soma.setNota(n1.getNota()+ n2.getNota()+ n3.getNota());
        res.setNota(soma.getNota()/3);

        System.out.printf("%nNota final: %.2f", res.getNota());
        System.out.printf("%nDeseja somar outras notas?(s/n)");
        Escolha = scan.next();
        System.out.printf("%n");}
    }
}
