import java.util.Scanner;
public class Bobcar {
public static void main(String[] args) {
				int Choice, Days, Club, Price, Discount;
				double Total, Package = 0;
				String Plan = null;
				Scanner scan = new Scanner(System.in);
				System.out.println("Welcome to Bobcar.java");
				System.out.println("Available cars: 1 for Economy, 2 for Compact, 3 for Standard");
				System.out.println("Please choose the rental car: ");
				Choice = scan.nextInt();
				if (Choice == 1){
				Choice = (35);
				Plan = ("Economy");
				}else if (Choice == 2){
					Choice = (45);
					Plan = ("Compact");
				}else if (Choice == 3){
					Choice = (95);
					Plan = ("Standard");
				}else
					Choice = (0);
				System.out.println("Please choose the number of rental days: ");
				Days = scan.nextInt();
				if (Days > 0){
				System.out.println("Club member?: 1 for yes, 0 for no: ");
				Club = scan.nextInt();
				Price = (Days*Choice);
					if (Club == 1){
						Club = (Days/7);
						System.out.println("Platinum Executive Package?: 1 for yes, 0 for no: ");
						Package = scan.nextDouble();
						if (Package == 1){
							Package = (Price*0.15);
						}else if (Package == 0){
							Package = (0);
					}else{
						System.out.println("Cannot determine package status.");}
						}else if (Club == 0){
						Club = (0);
					}else{
					System.out.println("Cannot determine club status.");}
				Discount = (Club*Choice);
				Total = (Price - Discount + Package);
				System.out.println("Base: " + Days + " days for a " +  Plan + " @ $" + Choice + " per day: $ "  + Price);
				if (Club > 0){
				System.out.println("Club Member Discount: - $ " + Discount);
				}else if (Club <= 0){
				System.out.println("");
				}if (Package > 0){
				System.out.println("Platinum Executive Package: + $ " + Package);
				}else if (Package <= 0){System.out.println("");}
				System.out.println("Total Estimate for Rental: $ " + Total); } 
				else
					System.out.println("Incorrect number of days detected. Please restart application.");} }