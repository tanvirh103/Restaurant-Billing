import java.util.Scanner;

public class Chinese extends Food{
	
	
	@Override
	public void displayfood()
	{
		System.out.println("___Welcome to our Chinese section___");
		System.out.println("");
		System.out.println("1. Chicken Masala......100/-");
		System.out.println("2. Rice.................50/-");
		System.out.println("3. Chinese vegetable....50/-");
		System.out.println("3. Soft drinks..........20/-");
	}
	
	@Override
	public void displayFoodBill() {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter your choice = ");
		System.out.println("To confirm your order press '='");
		char i = '0';
		
		while(true) {
			
			i = input.next().charAt(0);
			
			if(i == '=') {
				break;
			}
			
			else if(i == '1') {
				totalBill += 100;
				System.out.println("Amount = "+totalBill);
				
				
			}
			
			else if(i == '2') {
				totalBill += 50;
				System.out.println("Amount = "+totalBill);
				
			}
			
			else if(i == '3') {
				totalBill += 50;
				System.out.println("Amount = "+totalBill);
				
			}
			
			else if(i == '4') {
				totalBill += 20;
				System.out.println("Amount = "+totalBill);
				
			}
			
			//i = input.next();
			
		}
		
		System.out.println("Total Bill = "+totalBill);
	}
	
}
