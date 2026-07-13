import java.io.*;
import java.text.NumberFormat;
import java.util.*;

public class ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale india = new Locale("en", "IN");

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(india);
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + usFormat.format(payment));
        System.out.println("India: " + indiaFormat.format(payment));
        System.out.println("China: " + chinaFormat.format(payment));
        System.out.println("France: " + franceFormat.format(payment));
    }
}