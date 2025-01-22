public class L_one_7{
	public static void main(String [] args){
		int radius = 6378;
		double volume_in_km = ((Math.PI*Math.pow(radius,3))*4)/3;
		double volume_in_miles = Math.pow(1.6,3)*volume_in_km;
		System.out.println("The volume in cubic kilometers is "+volume_in_km+" and cubic miles is "+volume_in_miles);
	}
}