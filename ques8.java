package lab1;
import java.util.Scanner;
public class ques8 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = str.nextLine();
        System.out.print("Enter an integer: ");
        int integer = str.nextInt();
        for (int i = 0; i < integer; i++) {
        	System.out.print(word);
        }
        
        
    }
}
