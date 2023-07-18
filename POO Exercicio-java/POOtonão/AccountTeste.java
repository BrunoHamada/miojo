// Inputting and outputting floating-point numbers with Account objects.
import java.util.Scanner;

public class AccountTeste
{
   public static void main(String[] args) 
   {
      Account account1 = new Account("Jane Green", 50.00);
      Account account2 = new Account("John Blue", -7.53); 

      // display initial balance of each object
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); 

      // create a Scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      System.out.print("Enter deposit amount for account1: "); // prompt
      double depositAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nadding %.2f to account1 balance%n%n", 
         depositAmount);
      account1.deposit(depositAmount); // add to account1's balance
      
      // display balances
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); 
      
      System.out.print("Enter withdraw amount for account1: ");
      double withdrawAmount = input.nextDouble();
      
      if (withdrawAmount <= account1.getBalance())
      {
         System.out.printf("%ndraw %.2f from account1 balance%n%n", withdrawAmount);
         account1.withdraw(withdrawAmount);
      }

      else 
      {
         System.out.println("Valor de débito excedeu o saldo da conta.");
      }

      // display balances
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); 
      
      System.out.print("Enter deposit amount for account2: "); // prompt
      depositAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nadding %.2f to account2 balance%n%n", 
         depositAmount);
      account2.deposit(depositAmount); // add to account2 balance

      // display balances
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); 

         System.out.print("Enter withdraw amount for account2: ");
         withdrawAmount = input.nextDouble();
         
         if (withdrawAmount <= account2.getBalance())
         {
            System.out.printf("%ndraw %.2f from account1 balance%n%n", withdrawAmount);
            account1.withdraw(withdrawAmount);
         }
   
         else 
         {
            System.out.println("\nValor de débito excedeu o saldo da conta.\n");
         }
   
      // display balances
      System.out.printf("%s balance: $%.2f%n", 
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); 

   } // end main
} // end class AccountTest
