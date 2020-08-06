package ADifferentProblem;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine())
        {
            String[] input = scanner.nextLine().split(" ");

            long a = Long.valueOf(input[0]);
            long b = Long.valueOf(input[1]);

            if (a > b)
            {
                System.out.println(a - b);
            } else
            {
                System.out.println(b - a);
            }
        }
        scanner.close();
    }
}
