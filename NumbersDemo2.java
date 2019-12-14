import java.util.Scanner;
public class NumbersDemo2 {
    public static void main (String args[])
    {
            Scanner number = new Scanner(System.in);
            int num1 , num2 ;
            System.out.print("Enter an integer >> ");
            num1 = number.nextInt();
            System.out.print ("Enter second integer >> ");
            num2 = number.nextInt();
            displayTwiceTheNumber(num1);
            displayNumberPlusFive(num1);
            displayNumberSquared(num1);
            displayTwiceTheNumber(num2);
            displayNumberPlusFive(num2);
            displayNumberSquared(num2);
        }
        public static void displayTwiceTheNumber(int num)
        {
            final int TWICE = 2;
            System.out.println(num + " times " + TWICE + " is " + (num * TWICE));
        }
        public static void displayNumberPlusFive (int num) {
            final int PLUS = 5;
            System.out.println(num + " plus " + PLUS + " is " + (num + PLUS));
        }
        public static void displayNumberSquared (int num){
            System.out.println( num + " squared is " + (num * num));
        }
    }


