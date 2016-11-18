import java.util.Scanner;

public class AnyAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("*****This program prints the Average of all numbers*****");
		System.out.print("Please enter the maximum number:");
		int max = input.nextInt();
		int i = 0;
		int count = 0;
		int sum = 0;
		while ( i <= max) {
		 System.out.println("Number " + i);
		 sum= i+sum; 
		 count=i;
			 i++;
		}
		double runningCount;
		runningCount =sum/count;
		System.out.println("The Average is " + runningCount);
	}

}
