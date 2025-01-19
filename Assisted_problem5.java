import java.util.*;
public class Assisted_problem5{
public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Input radius: ");
	double radius = sc.nextDouble();
	System.out.print("Input height: ");
	double height = sc.nextDouble();
	double pi = Math.PI;
	double volume = pi*radius*radius*height;
	System.out.print("Volume: "+volume);
}
}