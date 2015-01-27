package static_example;

public class BankTeller {
		public static void main(String args[]){
			BankAccount acc1 = new BankAccount("Andy", 0);
			BankAccount acc2 = new BankAccount("Bart", 1);
			BankAccount acc3 = new BankAccount("Charlie", 2);
			BankAccount acc4 = new BankAccount("Dave", 3);
			BankAccount acc5 = new BankAccount("Ed", 4);
    
			System.out.println("name = "+acc1.getActHolderName()+" balance = "+acc1.getInitialAmount()
    		       +" account number is "+ acc1.getAccountNumber());
			System.out.println("name = "+acc2.getActHolderName()+" balance = "+acc2.getInitialAmount()
 		           +" account number is "+ acc2.getAccountNumber());
			System.out.println("name = "+acc3.getActHolderName()+" balance = "+acc3.getInitialAmount()
 		           +" account number is "+ acc3.getAccountNumber());
			System.out.println("name = "+acc4.getActHolderName()+" balance = "+acc4.getInitialAmount()
 		           +" account number is "+ acc4.getAccountNumber());
			System.out.println("name = "+acc5.getActHolderName()+" balance = "+acc5.getInitialAmount()
 		           +" account number is "+ acc5.getAccountNumber());
	}

}

