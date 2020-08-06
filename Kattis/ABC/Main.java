package ABC;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[3];

        for (int i = 0; i < input.length; i++)
        {
            input[i] = scanner.nextInt();
        }
        scanner.nextLine();

        Arrays.sort(input);
        String[] ordering = scanner.nextLine().split("");

        for (int i = 0; i < ordering.length; i++)
        {
            if (ordering[i].equals("A"))
            {
                System.out.print(input[0] + " ");
            } else if (ordering[i].equals("B"))
            {
                System.out.print(input[1] + " ");
            } else
            {
                System.out.print(input[2] + " ");
            }
        }
        scanner.close();
    }
}
