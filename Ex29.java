import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		
		double circle1X = input.nextDouble();
		double circle1Y = input.nextDouble();
		double radius1 = input.nextDouble();

		
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		
		double circle2X = input.nextDouble();
		double circle2Y = input.nextDouble();
		double radius2 = input.nextDouble();
		
		double distance = Math.sqrt( Math.pow( ( circle2X - circle1X ), 2)  + Math.pow( ( circle2Y - circle1Y), 2) );
		double absRadiusDiff = Math.abs(radius1-radius2);
		
		if (distance <= absRadiusDiff) 
			System.out.println("circle2 is inside circle1");
		else if (distance <= (radius1 + radius2))
			System.out.println("circle2 overlaps circle1");
			else
				System.out.println("circle2 does not overlap circle1");
				
		
		
	}

}
