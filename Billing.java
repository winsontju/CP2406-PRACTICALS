public class Billing {
    public static void main(String [] args){
        System.out.println(computeBill(10));
        System.out.println(computeBill(10,10));
        System.out.println(computeBill(10,10,10));
    }

    public static double computeBill(double price){
        double total = price*1.08;
        return total;
    }

    public static double computeBill(double price, int quantity){
        double total = (price*quantity)*1.08;
        return total;
    }

    public static double computeBill(double price, int quantity, double coupon){
        double total = ((price*quantity)-coupon)*1.08;
        return total;
    }
}
