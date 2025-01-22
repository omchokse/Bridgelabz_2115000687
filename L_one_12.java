import java.util.*;
public class L_one_12{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		double base= sc.nextDouble();
		double height= sc.nextDouble();
		double area_in_cm = (base*height)/2;
		double area_in_inches = ((base*height)/(2.56*2));
		System.out.println("Area of triangle in square cm is "+ area_in_cm+" and in square inches is "+area_in_inches);
	}
}