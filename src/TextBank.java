import java.util.Scanner;

public class TextBank {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner userinp = new Scanner(System.in);
		int size=0;
		String[] accountnames = new String[270];
		double[] accountbalance = new double[270];
		int values9=0;
		
		while (values9!= -1){
		System.out.println("Bank Menu");
		System.out.println("Please enter a menu option :");
		System.out.println("Press 1 to open a new banking account for cusomer");
		System.out.println("Press 2 to change the name of customer");
		System.out.println("Press 3 to check the bank account balance");
		System.out.println("Press 4 to modify your account balance");
		System.out.println("Press 5 to check account summary");
		System.out.println("Press -1 to exit");
		
		int input9=userinp.nextInt();
		if (input9==1) {
			System.out.println("Add customers to open new Bank account");
			System.out.println("Please enter your account name :");
			
			String names = userinp.nextLine();
			accountnames[size]= names;
			userinp.nextLine();
			System.out.println("Please enter account balance :");
			
			double balance = userinp.nextDouble();
			accountbalance[size]= balance;
			System.out.println("Customer ID is :" + size);
			size=size+1;
		}
		
		else if(input9==2) {
			System.out.println("Change the name of bank acoount holder name");
			System.out.println("Enter the ID of the customer :");
			int index9 = userinp.nextInt();
			System.out.println("what is new name of the customer ?");
			userinp.nextLine();
			accountnames[index9]= userinp.nextLine();
		}
		else if(input9==3) {
			System.out.println("Checking the account bank balance ");
			System.out.println("Please enter the Customer ID to check the balance");
			int index9 = userinp.nextInt();
			double balance9 = accountbalance[index9];
			System.out.println("This customer has $" + balance9 + "in their account");
			
		}
		else if(input9==4) {
			System.out.println("Change the account balance");
			System.out.println("Please enter the Customer ID to change the balance:");
			int index9 = userinp.nextInt();
			System.out.println("Enter new balance of account");
			accountbalance[index9] = userinp.nextInt();
		}
		else if(input9==5) {
			double total=0;
			System.out.println("Enter summary of all customer bank details ");
			for(int i=0;i<size;i++) {
				total = total+ accountbalance[i]; 
				System.out.println(accountnames[i] + " has $" + accountbalance[i] + "in their account" );
			}
			System.out.println("There is $ " + total + " in the bank" );
		}
		else if(input9==-1) {
			System.exit(-1);;
		}
		else {
			System.out.println("Sorry. Please enter valid input.");
			
		}
	}
		
}
}
