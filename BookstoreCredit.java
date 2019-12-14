import java.util.Scanner;
public class BookstoreCredit {
    public static void main (String args[])
    {
        String name;
        double gpa;
        Scanner user = new Scanner(System.in);
        System.out.print("Enter your name >> ");
        name = user.nextLine();
        System.out.print("Enter your gpa >> ");
        gpa = user.nextDouble();
        computeDiscount(name, gpa);

    }
    public static void computeDiscount (String name, double gpa)
    {
        double discount;
        final double FACTOR = 10;
        discount = gpa * FACTOR;
        System.out.println (name + " your GPA is " + gpa + ", so your discount is $" + discount);
    }
}
