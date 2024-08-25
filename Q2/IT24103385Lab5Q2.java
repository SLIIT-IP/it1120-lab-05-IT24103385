import java.util.Scanner;
public class IT24103385Lab5Q2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of new members introduced: ");
		int numofMembers = input.nextInt();

		switch (numofMembers) {
		
			case 0:
			
		System.out.println();
		System.out.println("No Prize");
					break;
					
			case 1:
		System.out.println();
		System.out.println("Prize is a : Pen");
					break;
					
			case 2:
		System.out.println();
		System.out.println("Prize is a : Umbrella");
					break;
					
			case 3:
		System.out.println();
		System.out.println("Prize is a : Bag");
					break;
					
			case 4:
		System.out.println();
		System.out.println("Prize is a : Travelling Chair");
					break;
					
			default:
				if (numofMembers >= 5) {
			System.out.println();
			System.out.println("Price is a : Headphone");
				}
		else {
					System.out.println("Input must be a number 0 or greater");
				}
				break;	
		}
	}
}
