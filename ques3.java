package lab1;
import java.util.Scanner;
public class ques3 {

	public static void main(String[] args) {
		 Scanner str = new Scanner(System.in);
		 final double PI = 3.14;
		 System.out.print("Please enter the radius:");
		 double radius=str.nextDouble();
		 System.out.print("Please enter the height:");
		 double height=str.nextDouble();
		 double volume;
		 volume=(PI*height*radius*radius)/3;
		 System.out.print("The volume of the cone is ");
		 
		 System.out.println((int)volume);

	}

}
