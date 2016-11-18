import java.util.Scanner;

public class SumAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("*****This program prints the sum of all numbers*****");
		System.out.print("Please enter the maximum number:");
		
		int max = input.nextInt();
		int i = 0;
		int sum = 0;
		while ( i <= max) {
		 System.out.println("Number " + i);
			sum= i+sum; 
		 i++;
		}
		System.out.println("The sum of the numbers is " + sum);
			 
		}
		}
	


