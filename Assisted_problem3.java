import java.util.*;
public class Assisted_problem3{
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("temp in celsius: ");
	double cel = sc.nextDouble();
	double fahren = (cel*(9/5))+32;
	System.out.println("temp in fahrenheit: " +fahren);
}
}