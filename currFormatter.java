//https://www.hackerrank.com/challenges/java-currency-formatter/problem
import java.util.*;
import java.text.*;


public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat usf = NumberFormat.getCurrencyInstance(Locale.US); 
        NumberFormat inf = NumberFormat.getCurrencyInstance(new Locale("en", "IN")); 
        NumberFormat chf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frf = NumberFormat.getCurrencyInstance(Locale.FRANCE); 
        
        String us = usf.format(payment);
        String india = inf.format(payment);
        String china = chf.format(payment);
        String france = frf.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

