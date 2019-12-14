import java.util.Scanner;
public class MetricConversion {
    public static void main(String args[]) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a length in inch >> ");
        int number = input.nextInt();
        System.out.print("Enter a number of gallons >> ");
        int gallons = input.nextInt();
        converter(number, gallons);

    }
    public static void converter (int num, int gal){
        final double FACTOR = 2.54;
        final double LITTER = 3.7854;
        System.out.print(num + " inches is equal to " + (num * FACTOR) + " cm. ");
        System.out.print(gal + " gallons is equal to " + (gal * LITTER ) + " Litters.");
    }


}
