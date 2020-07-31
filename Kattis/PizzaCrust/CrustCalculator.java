import java.util.Scanner;

public class CrustCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] array = line.split(" ");
        double radius = Float.parseFloat(array[0]);
        double crust = Float.parseFloat(array[1]);

        double radiusPizza = Math.PI * Math.pow(radius, 2);
        double radiusCrust = Math.PI * Math.pow(crust, 2);

        double percentagePizza = (radiusCrust / radiusPizza) * 100;

        System.out.println(String.format("%.6f", percentagePizza));

        scanner.close();
    }
}

