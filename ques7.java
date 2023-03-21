package lab1;

import java.util.Scanner;
import java.util.Random;


public class ques7 {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Random random = new Random();
        char alphabet = (char) (random.nextInt(26) + 'a');//Random in alphabet
        System.out.println("I have guessed a letter in the English alphabet.");
        String letter;
        int counter =0;
        do
        {
            System.out.print("Guess the letter: ");
            letter=str.next();
            if(alphabet<letter.charAt(0))
            {
                System.out.println("Go backward in the alphabet");
                counter++;
            } 
            else if((alphabet>letter.charAt(0))) 
            {

                    System.out.println("Go forward in the alphabet");
                    counter++;
            }


        }while(alphabet!=letter.charAt(0));

        System.out.println(letter+" is correct! You guessed correctly after "+counter+" tries!");

    }
}
