package lab1;

import java.util.Scanner;

public class ques4 {

	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the date in dd.mm.yyyy format:");
		String strDate= str.next();
		
		String strDD= strDate.substring(0,2);
		String strMM= strDate.substring(3,5);
		String strYY= strDate.substring(6,10);
		System.out.print("The date you entered is ");
		System.out.print(strMM+"/"+strDD+"/"+strYY);
	}

}
