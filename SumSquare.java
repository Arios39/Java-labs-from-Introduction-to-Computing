import java.util.Scanner;

public class SumSquare {

	public static void main(String[] args) {
		System.out.print("Please enter the maximum number:");
		Scanner input = new Scanner(System.in);
		int max = input.nextInt();
		int i = 0;
		while ( i <= max) {
			 System.out.println("Number " +i+" squared is "+ (i*i));
			 i++;
	}

	}

}
