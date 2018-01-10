/**
 * @author Ryan A Cleland
 * @version 1.0
 */
import java.lang.Math;
import java.util.Scanner;

public class main {

	private static double radius;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(radius < 1 || radius > 100 ){
			setRadius();
			}
		System.out.print("Area of Circle: " + calcArea() + "\n" + "Circumference of Circle: " + calcCircumference() + "\n" + "Surface Area of Sphere: " + calcSurfaceArea() + "\n" + "Volume of Sphere: " + calcVolume() + "\n");
	}

	/* getRadius will get the radius from the user.
	@param r Inputs the radius of the circle given by main function
	@return circ Returns the circumference of the circle. 
	*/
	public static void setRadius(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the circle/sphere's radius (input between 1 and 100: ");
		radius = sc.nextInt();
		}
	
	/**
	 * circumference of circle
	 * @param r Radius of this circle.
	 * @return circ Circumference of this circle.
	*/
	public static float calcCircumference(){
		float circ = 0;
		return circ;
	}
	
	/**
	 * 
	 * @param r
	 * @return
	 */
	public static float calcArea(){
		float a = 0;
		return a;
	}

		/**
		 * Calculates the Surface Area of this sphere based on radius given.
		 * @return Surface area of sphere.
		 */
	public static float calcSurfaceArea(){
		float sa = 0;
		return sa;
	}

	/**
	 * Calculates the volume of sphere with given radius.
	 * @return Volume of this sphere.
	 */
	public static double calcVolume(){
		double vol = 0;
		return vol;
	}
}