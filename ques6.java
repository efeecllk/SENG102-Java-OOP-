package lab1;
import java.util.Scanner;
public class ques6 {
	  public static void main(String[] args) {
	    Scanner str = new Scanner(System.in);
	    System.out.print("Enter your grade (0-100): ");
	    int grade = str.nextInt();

	    String letterGrade;
	    switch (grade / 10) {
	      case 10:
	      case 9:
	        letterGrade = "AA";
	        break;
	      case 8:
	        letterGrade = "BB";
	        break;
	      case 7:
	        letterGrade = "CC";
	        break;
	      case 6:
	        letterGrade = "DD";
	        break;
	      default:
	        letterGrade = "FF";
	    }

	    System.out.print("Your letter grade is " + letterGrade);
	  }
	}

