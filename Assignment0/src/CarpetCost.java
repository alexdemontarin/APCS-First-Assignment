/*
 * Assignment 0: Carpet Cost
 * 
 * @Alex Varga
 * @8/15/2016
 * @AP Comp Sci
 * 
 */


import java.util.Scanner;

public class CarpetCost {

	public static void main(String[] args) {
		
		 Scanner console = new Scanner(System.in);
	        
	        //Variable declarations
	        double width;
	        double length;
	        String color;
	        double area;
	        double pricePerSQFoot;
	        double cost;
	        
	        //Ask for input values
	        System.out.print("What color carpet would you like? ");
	        color = console.nextLine();
	        System.out.print("What is the width of the room? ");
	        width = console.nextDouble();
	        System.out.print("What is the length of the room? ");
	        length = console.nextDouble();
	        
	        pricePerSQFoot = 2.50;
	        cost = (length * width) * pricePerSQFoot;
	        area = length * width;
	        
	        //Output area and cost
	        System.out.println("The area of the " + width + " by " + length + " room is " + area);
	        System.out.printf("The total cost for the %s carpet is $%.2f \n", color, cost);

	}

}
