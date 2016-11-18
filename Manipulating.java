/*
 * Created by Andres rios
 */
import java.util.Scanner;

public class Manipulating {

	public static void main(String[] args) {

   Scanner input = new Scanner(System.in);
 int n1, n2;
System.out.println("Please enter the first number:");
			n1 = input.nextInt();
System.out.print("Please enter the second number:");
			n2 = input.nextInt();
	
			int add;
				add = (n1+n2);

System.out.println("Added is " + add);
			int sub;
				sub = (n1-n2);

				System.out.println("Subtracted is " + sub);
			int mul;
				mul = (n1*n2);

System.out.println("Multiplied is "+ mul);
			int rem;
				rem = (n1%n2);

System.out.println("remainder is "+ rem);
  Short n3, n4, add1, sub1, div1, mul1, rem1;

 System.out.println("Type in a third number: ");
  		n3 = input.nextShort();

System.out.println("Type in a fourth number: ");
	n4 = input.nextShort();
				add1 = (short) (n3+n4);
				sub1 = (short) (n3-n4);
				mul1 = (short) (n3*n4);
				rem1 = (short) (n3%n4);
System.out.println("the short sum is " + add1);
System.out.println("The short subtraction is " + sub1);
System.out.println("The short multiplied is " + mul1);
System.out.println("The short remainder " + rem1 );
  
  float n5, n6, add2, sub2, mul2,rem2;
  	
 System.out.println("Type in a fifth number: "); 	
  			n5 = input.nextFloat();
System.out.println("Type in a sixth number"); 
			n6 = input.nextFloat();
 				add2 = (float) (n5+n6);
  				sub2 = (float) (n5-n6);
  				mul2 = (float) (n5*n6);
  				rem2 = (float) (n5%n6);
System.out.println("The float sum is " + add2);
System.out.println("The float subtraction is " + sub2);
System.out.println("The float multiplied is " + mul2);
System.out.println("The float remainder " + rem2);

  double n7, n8, add3, sub3, mul3,rem3;
 
System.out.println("Type in a seventh number");	
		n7= input.nextDouble();
System.out.println("Type in an eighth number");
		n8= input.nextDouble();
			add3 = (double) (n7+n8);
			sub3 = (double) (n7-n8);
			mul3 = (double) (n7*n8);
			rem3 = (double) (n7%n8);
			System.out.println("The double sum is " + add3);
			System.out.println("The double subtraction is " + sub3);
			System.out.println("The double multiplied is " + mul3 );
			System.out.println("The double remainder " + rem3);
	}

}
