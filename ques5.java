package lab1;
import java.util.Scanner;
public class ques5 {
	 public static void main(String[] args)
	    {
		 	String[] item={"Meat","Chicken","Milk","Juice","Apples"};
		 	int[] price={70,50,22,19,16};
	        Scanner str =new Scanner(System.in);
	        System.out.print("Enter your balance: ");
	        int balance=str.nextInt();
	        System.out.print("Enter your balance: ");
	        System.out.print("You can buy meat, juice, milk, apples or chicken. Which one do you choose?: ");
	        String myItem=str.next();
	        for(int i=0; i<5; i++) {
	        	
	        	if(myItem.equalsIgnoreCase(item[i])) {
	        		balance -= price[i];
	        	  if(balance>=0) {
	        		System.out.print("Your new balance is" + balance+" Enjoy!");
	        	  }
	        	   else {
	        		System.out.print("Your budget is not enough!");
	        	  }
	        	
	        	
	        	}
	        }
	        
	        
	        
	        }
	    }
	            

