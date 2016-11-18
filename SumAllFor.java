import java.util.Scanner;

public class SumAllFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		int sum = 0; 
		for (int i = 3;  i < max; i+=3) {	
			sum = i +sum;
			System.out.println("Number " + i);
			
	}
		System.out.println("The sum of the numbers is " + sum);
		}
}
