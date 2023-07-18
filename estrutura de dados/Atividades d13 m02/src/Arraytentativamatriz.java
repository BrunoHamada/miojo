import java.util.Scanner;

public class Arraytentativamatriz {
    public static void main(String[] args) {
        int matriz[][]= new int[2][2];
        int l,c;

        Scanner scan= new Scanner(System.in);
        System.out.println("Digite os números da matriz: ");
        for (l=0;l<2;l++){
            for (c=0;c<2;c++){
                matriz[l][c]=scan.nextInt();
            }
        }
        for (l=0;l<2;l++){// para fazer a linha
            for (c=0;c<2;c++){ // para fazer a coluna
                System.out.printf("%d ", matriz[l][c]);
            }
            System.out.printf("%n");
        }
    }
}
