package PlantingTrees;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numberOfTrees = Integer.parseInt(scanner.nextLine());
        Integer[] growthTimes = new Integer[numberOfTrees];

        for (int i = 0; i < growthTimes.length; i++)
        {

            growthTimes[i] = scanner.nextInt();
        }
        Arrays.sort(growthTimes, Collections.reverseOrder());

        int daysToGrow = 0;
        for (int i = 1; i < growthTimes.length + 1; i++)
        {
            if (daysToGrow < i + growthTimes[i - 1])
            {
                daysToGrow = i + growthTimes[i - 1];
            }
        }
        System.out.println(daysToGrow + 1);
    }
}
