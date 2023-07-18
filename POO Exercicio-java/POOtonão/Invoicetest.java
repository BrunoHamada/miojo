import java.util.Scanner;
public class Invoicetest {
    public static void main(String[] args) {
        
        Scanner scann = new Scanner(System.in); 
        Invoice fatura = new Invoice(null, null, 0, 0);
        
        System.out.println();
        System.out.print("Digite o tipo de item: ");
        String descrição = scann.nextLine();

        System.out.print("Digite o número do item: ");
        String numItem = scann.nextLine();
        
        System.out.print("Digite a quant. de itens: ");
        int quantItem = scann.nextInt();
        
        if (quantItem < 0){
            
            quantItem = 0;    
        }

        System.out.print("Digite o preço por item: ");
        double precoItem = scann.nextDouble();
        if (precoItem <= 0){

            precoItem = 0.0;
        }

        fatura.setDescrição(descrição);
        fatura.setNumeroItem(numItem);
        fatura.setQuantItem(quantItem);
        fatura.setPreçoItem(precoItem);
       
        System.out.println();
        System.out.println("Descrição do produto: "+ fatura.getDescrição()
        +"\nNúmero do item: "+ fatura.getNumeroItem()
        +"\nQuantidade de itens: "+ fatura.getQuantItem()
        +"\nPreço por item: $"+ fatura.getPreçoItem());

        System.out.println();
        System.out.println("Total a pagar: $"+ fatura.getInvoiceAmount());
        System.out.println();
    
    }
}
