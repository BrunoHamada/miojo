// Account class with a double instance variable balance and a constructor
// and deposit method that perform validation.

public class Account
{   
   private String name; // instance variable 
   private double balance; // instance variable 

   // Account constructor that receives two parameters  
   

   public Account(String name, double v) {
      this.name = name;
      this.balance = v;
}

// method that deposits (adds) only a valid amount to the balance
   public void deposit(double depositAmount) 
   {      
      if (depositAmount > 0.0) // if the depositAmount is valid
         balance = balance + depositAmount; // add it to the balance 
   }

   public void withdraw(double withdrawAmount)
   {
      
      if (withdrawAmount > 0.0)
      {
         balance = balance - withdrawAmount;
      }

   }
   
   // method returns the account balance
   public double getBalance()
   {
      return balance; 
   } 

   // method that sets the name
   public void setName(String name)
   {
      this.name = name; 
   } 

   // method that returns the name
   public String getName()
   {
      return name; 
   } 
   
} // end class Account

