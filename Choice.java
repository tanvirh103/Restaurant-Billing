import java.util.Scanner;
public class Choice {

	void displayItem()
	{
		
	System.out.println("   ___Welcome to Food King Resturant___");
	System.out.println("============================================");
	System.out.println("");
	System.out.println("");
	System.out.println("Which Item you would like to have: ");
	System.out.println("1. Fatfood");
	System.out.println("2. Chinese");
	System.out.println("3. Bengali Dish");
	
	}
	
	void choiceItem() 
	{
		
	
		
	System.out.println("");
	try {
		System.out.print("Enter your Choice : ");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		if (choice == 1) {
			Food f1 = new FastFood();
			f1.displayfood();
			f1.displayFoodBill();
			
		}
		
		else if(choice == 2) {
			Food c1= new Chinese();
			c1.displayfood();
			c1.displayFoodBill();
		}
		
		else if(choice == 3){
			Food b1 = new BengaliDish();
			b1.displayfood();
			b1.displayFoodBill();
		}
		
		else {
			
		}
	}
	catch(Exception e) {
		//System.out.println(e);
		System.out.print("Invalid input. Please try again");
		choiceItem();
	}
	
	
	
	}
	
	
	
}
