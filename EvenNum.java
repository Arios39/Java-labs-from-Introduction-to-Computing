import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.println("*****This program prints even numbers only*****");
		System.out.print("Please enter the maximum number:");
		
		int max = input.nextInt();
		int i = 0;
		while ( i <= max) {
			
			 if( i % 2 == 0)
			 
		 System.out.println("Number " + i);
			 i++;
	}
}
}