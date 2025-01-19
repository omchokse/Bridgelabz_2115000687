import java.util.*;
public class Self_problem2{
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Input length: ");
	Double length = sc.nextDouble();
	System.out.print("Input width: ");
	Double width = sc.nextDouble();
	Double perimeter = 2*(length+width);
	System.out.print("perimeter is "+perimeter);
}
}