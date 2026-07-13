import java.util.*;
import java.text.*;

public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));

        // Convert ₹ to Rs. because HackerRank expects Rs.
        String indiaCurrency = india.format(payment).replace("₹", "Rs.");
        System.out.println("India: " + indiaCurrency);

        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}