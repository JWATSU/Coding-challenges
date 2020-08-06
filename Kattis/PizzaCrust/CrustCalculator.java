package PizzaCrust;

import java.util.Scanner;

public class CrustCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");

        double totalRadius = Double.parseDouble(array[0]);
        double crustRadius = totalRadius - Double.parseDouble(array[1]);
        double percentagePizza = Math.pow(crustRadius, 2) * Math.PI / (Math.pow(totalRadius, 2) * Math.PI);

        System.out.println(percentagePizza * 100);

        scanner.close();
    }
}

