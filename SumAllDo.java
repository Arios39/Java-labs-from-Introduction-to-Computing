import java.util.Scanner;

public class SumAllDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		int i = 0;
		int sum = 0;
		do {
			System.out.println("Number " + i);
			sum= i+sum;
			i++;
		} while ( i <= max);
		System.out.print("The sum of all numbers is " + sum);
	}

}
