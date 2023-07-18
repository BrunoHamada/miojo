import java.util.Scanner;
import java.time.LocalDate;

public class TesteEx02{

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        //Pessoa pessoa1 = new Pessoa(); // Classes abstratas não podem ser instaciadas.

        System.out.println();
        SecretariaAdmnistrativa Sa = new SecretariaAdmnistrativa("Sabrina", "456" , LocalDate.of(2019, 11, 6), "2",2000);
        System.out.println(Sa);

        System.out.println();
        SecretariaExecutiva Se = new SecretariaExecutiva("Simone", "123" , LocalDate.of(2019, 11, 29), "1",20000);
        System.out.println(Se);

        System.out.println();
        Presidente Pr = new Presidente("BolsoFurado","20119762", LocalDate.of(2018, 1, 6),"789",1000000, Se);
        System.out.println(Pr);

        System.out.println();
        Gerente Ger = new Gerente("Carlos Bananinha","504520", LocalDate.of(2018, 1, 6),"141516",200000, Sa);
        System.out.println(Ger);

        System.out.println();
        Supervisor Sup = new Supervisor("Bananinha","5562018", LocalDate.of(2018, 1, 6),"111213",100000, Sa);
        System.out.println(Sup);

        System.out.println("");
    }
}