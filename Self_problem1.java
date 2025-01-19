import java.util.*;
public class Self_problem1{
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Input prinicipal: ");
	double prinicipal = sc.nextDouble();
	System.out.print("Input rate: ");
	double rate = sc.nextDouble();
	System.out.print("Input time: ");
	double time = sc.nextDouble();
	double simpleInterest = (prinicipal*rate*time)/100;
	System.out.print("Simple Interest is "+ simpleInterest);
}
}