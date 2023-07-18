import java.util.Scanner;

public class atividadeP1 {
    public static void main(String[] args) {
        int matriz [] []= new int[4][4];
        int l, c;
        Scanner s= new Scanner(System.in);

        System.out.println("Digite os números para fromar uma matriz 4X4: ");
        for(l=0;l<4;l++){
            for(c=0;c<4;c++){
             matriz[l][c]=s.nextInt();
         }
        }
        for(l=0;l<4;l++){
            for(c=0;c<4;c++){
                System.out.printf("%d ", matriz[l][c]);// para funcionar essa formatação é preciso ser "printf"
            }
            System.out.printf("%n");// local do erro, está parte tem q esta dentro do for
        }
    }
}
