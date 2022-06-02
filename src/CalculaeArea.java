import java.util.Scanner;
public class CalculaeArea {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		//Calculating AREA OF A RECTANGLE
		
				
		System.out.print("\n Calculating The Area of a Rectangle");
		Scanner input = new Scanner(System.in);
		System.out.print("\nPlease the length of  a rectangle: ");
		int length = input.nextInt();
		
		
		System.out.print("\nPlease the width of  a rectangle: ");
		int width = input.nextInt();
		
		
		int area = length * width;
		
		System.out.print("\nThe Area of the rectangle is: ");
		System.out.println(area);
	}
	 
}
