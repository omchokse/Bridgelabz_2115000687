import java.util.*;
public class L_one_10{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		double total_inches = height/2.54;
		int feet = (int)total_inches/12;
		double inches = total_inches%12;
		System.out.println("Your Height in cm is "+ height +" while in feet is "+ feet + " and inches is "+inches);
	}
}