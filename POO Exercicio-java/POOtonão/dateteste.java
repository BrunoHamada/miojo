import java.util.Scanner;

public class dateteste {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        date data = new date(0, 0, 0);

        System.out.println();
        System.out.print("Digite o dia: ");
        int dd = scan.nextInt();
        
        System.out.print("Digite o número mês: ");
        int mm = scan.nextInt();

        System.out.print("Digite o número do ano: ");
        int aa = scan.nextInt();

        data.setDia(dd);
        data.setMes(mm);
        data.setAno(aa);

        System.out.println("\nA data informada foi: "+ data.getdisplayDate());
        System.out.println();
    }
}
