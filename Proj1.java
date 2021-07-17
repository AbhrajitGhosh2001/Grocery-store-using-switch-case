
import java.util.Scanner;

public class Proj1
{
	public static void main (String [] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double unitPrice;

		char letter;
		double number;
		String day;
		//product
		String produce;
		// cost
		double x=0;
		double y=0;
		//for dividing by 3 with no remainder
		int z;
		double ok;
		//
		double finalValue;
		//menu of products choice
		int choice;
		//transition for decimal
		int t1;

		do
		{

			System.out.println("What day is it?");
			day = keyboard.nextLine();


			//menu
			printMenu();
			//product
			choice = keyboard.nextInt();

			System.out.println("How many of them would you like?");
			number= keyboard.nextDouble();
			z=(int)(number/3);
			ok=z;

			switch(choice)
			{
			case 1:
				x=1;
				if (day.equalsIgnoreCase("friday") || day.equalsIgnoreCase("wensday")|| day.equalsIgnoreCase("monday")) {
					y= mondayWednesdayFriday(number,x);
				}
				else if (day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("thursday"))
					y= tuesdayThursday(ok,x);
				else if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
					y= saturdaySunday(ok,x);
				}

				break;
			case 2:
				x=2;
				if (day.equalsIgnoreCase("friday") || day.equalsIgnoreCase("wensday")|| day.equalsIgnoreCase("monday")) {
					y= mondayWednesdayFriday(number,x);
				}
				else if (day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("thursday"))
					y= tuesdayThursday(ok,x);
				else if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
					y= saturdaySunday(ok,x);
				}
				break;
			case 3:
				x=3;
				if (day.equalsIgnoreCase("friday") || day.equalsIgnoreCase("wensday")|| day.equalsIgnoreCase("monday")) {
					y= mondayWednesdayFriday(number,x);
				}
				else if (day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("thursday"))
					y= tuesdayThursday(ok,x);
				else if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
					y= saturdaySunday(ok,x);
				}
				break;
			case 4:
				x=4;
				if (day.equalsIgnoreCase("friday") || day.equalsIgnoreCase("wensday")|| day.equalsIgnoreCase("monday")) {
					y= mondayWednesdayFriday(number,x);
				}
				else if (day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("thursday"))
					y= tuesdayThursday(ok,x);
				else if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
					y= saturdaySunday(ok,x);
				}
				break;
			case 5:	
				x=5;
				if (day.equalsIgnoreCase("friday") || day.equalsIgnoreCase("wensday")|| day.equalsIgnoreCase("monday")) {
					y= mondayWednesdayFriday(number,x);
				}
				else if (day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("thursday"))
					y= tuesdayThursday(ok,x);
				else if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
					y= saturdaySunday(ok,x);
				}
				break;
			case 6:
				x=6;
				if (day.equalsIgnoreCase("friday") || day.equalsIgnoreCase("wensday")|| day.equalsIgnoreCase("monday")) {
					y= mondayWednesdayFriday(number,x);
				}
				else if (day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("thursday"))
					y= tuesdayThursday(ok,x);
				else if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
					y= saturdaySunday(ok,x);
				}
				break;
			default:
				y= mondayWednesdayFriday(number,x);
				System.out.println("You did not enter " +
						"a valid choice.");
			}
			//finding final value
			finalValue=y+((number%3)*x);
			
			//initialize unit price
			unitPrice=(finalValue/number);
			
			
			keyboard.nextLine(); // Consume the new line
			
			
			System.out.format("pay %.2f",finalValue);
			System.out.println();
			System.out.format("unit price is %.2f",unitPrice);
			System.out.println();
			
			System.out.println("Are you done " +
					"shoping (Y/N)?: ");
			String answer = keyboard.nextLine();
			letter = answer.charAt(0);



		} while(letter != 'Y' && letter != 'y');

	}
	static double mondayWednesdayFriday(double number,double x) {
		return (number*x);
	}
	static double tuesdayThursday(double ok,double x) {
		return (3*ok*x*(9.00/10.00));
	}
	static double saturdaySunday(double ok,double x) {
		return (3*ok*x*(2.00/3.00));		
	}

	/*
	 * Menu list of items
	 */
	static void printMenu( ) {
		System.out.printf("This is a grocery store. \r\n" + 
				"Choose what you would like to buy.\r\n" + 
				"\n");
		System.out.printf(" 1 Fish sticks 1$.\n");
		System.out.printf(" 2 Yogurt 2$.\n");
		System.out.printf(" 3 Carrots 3$.\n");
		System.out.printf(" 4 Duck 4$ .\n");
		System.out.printf(" 5 Tomatoes 5$ .\n");
		System.out.printf(" 6 Mushrooms 6$ .\n"); 
		System.out.println();
		System.out.println(" 2 for 3 on saturday and sunday");  
		System.out.println(" 10% off on tuesday and thursday when you buy 3");   
	}

}

