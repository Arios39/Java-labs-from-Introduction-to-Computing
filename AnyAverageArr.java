import java.util.Scanner;

public class AnyAverageArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int max, i;
		int count = 0;
		int total = 0;

		System.out.println("This program will find the average of any numbers");
		System.out.print("Please choose the amount of numbers to average: ");
		max = input.nextInt();

		int[] arr1 = new int [max + 1];

		for (i = 0; count < max; ++i){
		System.out.print("Please enter " + count + " number: ");
		arr1[i] = input.nextInt();
		total +=arr1[i];
		++count;
		}

		System.out.println("The numbers being averaged: ");
		for (i = 0; i < max; ++i){
		System.out.print(arr1[i] + " ");
		if (i % 5 == 4){
		System.out.print("\n");
		}
		}

		System.out.println("Average is: " + (total/count));

		input.close();
	
	}

}
