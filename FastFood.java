import java.util.Scanner;
public class FastFood extends Food{
	
	@Override
	public void displayfood()
	{
	System.out.println("___Welcome to our FastFood section___");
	System.out.println("");
	System.out.println("1. Chicken Burger......150/-");
	System.out.println("2. Pizza...............200/-");
	System.out.println("3. Sandwich............100/-");
	System.out.println("4. Soft Drinks..........20/-");
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
				totalBill += 150;
				System.out.println("Amount = "+totalBill);
				
			}
			
			else if(i == '2') {
				totalBill += 200;
				System.out.println("Amount = "+totalBill);
				
			}
			
			else if(i == '3') {
				totalBill += 100;
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
