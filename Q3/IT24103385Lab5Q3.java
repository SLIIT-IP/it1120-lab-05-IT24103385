import java.util.Scanner;
public class IT24103385Lab5Q3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		final double Room_Charge_Per_Day = 48000.00;
		final double Discount_3_to_4_Days = 0.1;
		final double Discount_5_or_more_Days = 0.2;
		
		int startDate, endDate, numofDaysReserved;
		double totalAmountBeforeDiscount, discountAmount, totalAmountToBePaid;
		
		double discountRate = 0;
		
		System.out.print("Enter Start Date (1-31): ");
		startDate = input.nextInt();
		
		System.out.print("Enter End Date (1-31): ");
		endDate = input.nextInt();
		
		if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
			System.out.println("Error: Days must be between 1 and 31");
			
			return;
		}
		
		if (startDate >= endDate) {
			System.out.println("Error: Start Date must be less than End date");
			
			return;
		}
		
		numofDaysReserved = endDate - startDate;
		
		if (numofDaysReserved >= 3 && numofDaysReserved <= 4) {
			discountRate = Discount_3_to_4_Days;
			
		}
		else if (numofDaysReserved >= 5) {
			discountRate = Discount_5_or_more_Days;
			
		}
		
		totalAmountBeforeDiscount = numofDaysReserved * Room_Charge_Per_Day ;
		discountAmount = totalAmountBeforeDiscount * discountRate ;
		totalAmountToBePaid = totalAmountBeforeDiscount - discountAmount ;
		
		System.out.println();
		System.out.println("Room Charge Per Day: Rs. " + Room_Charge_Per_Day + "/=");
		System.out.println("Number of Days Reserved: " + numofDaysReserved );
		System.out.println("Total Amount to be Paid: " + totalAmountToBePaid );
		
	}
}
		
		