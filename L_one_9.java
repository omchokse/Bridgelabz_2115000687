import java.util.*;
public class L_one_9{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		double fee = sc.nextDouble();
		double discountPercent = sc.nextDouble();
		double discount = (fee/100)*discountPercent;
		double discountedFee = fee - discount;
		System.out.println("The discount amount is INR "+ discount +" and final discounted fee is INR "+discountedFee);
	}
}