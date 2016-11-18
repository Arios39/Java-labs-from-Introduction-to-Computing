import java.util.Scanner;

public class PosAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		int i = 0;int count = 0;int sum = 0;
		do {
			System.out.println("Number " + i);
			sum= i+sum;
			count=i;
			i++;
		} while ( i <= max);
		double runningCount;
	runningCount = sum /count;
		System.out.println("The Average is " + runningCount);
		}	

}
