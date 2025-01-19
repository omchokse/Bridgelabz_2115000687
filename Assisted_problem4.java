import java.util.*;
public class Assisted_problem4{
public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Input radius: ");
	double radius = sc.nextDouble();
	double pi = Math.PI;
	double area = pi*radius*radius;
	System.out.print("Area: "+area);
}
}