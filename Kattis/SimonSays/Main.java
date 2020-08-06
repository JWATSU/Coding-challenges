package SimonSays;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int amountToParse = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < amountToParse; i++)
        {
            String lineToParse = scanner.nextLine();
            if (lineToParse.startsWith("Simon says"))
            {
                System.out.println(lineToParse.substring(10));
            }
        }
    }
}
