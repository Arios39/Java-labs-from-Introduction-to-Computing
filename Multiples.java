import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the max number:");
		int max = input.nextInt();
		System.out.print("Enter the Base:");
		int base = input.nextInt(); 
		for (int i = 0;  i <= max; i++) {	
			if( i % base == 0)
			System.out.println("Number " + i);
			
	}
	}

}
