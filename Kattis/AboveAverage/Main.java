package AboveAverage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        List<Double> toPrint = new ArrayList<>();

        for (int i = 0; i < cases; i++)
        {
            int numberOfPeople = scanner.nextInt();
            int[] grades = new int[numberOfPeople];
            int totalGrades = 0;
            for (int j = 0; j < grades.length; j++)
            {
                grades[j] = scanner.nextInt();
                totalGrades += grades[j];
            }
            double average = (double) totalGrades / numberOfPeople;
            double numberOfPeopleAboveAverage = 0;
            for (int grade : grades)
            {
                if (grade > average)
                {
                    numberOfPeopleAboveAverage++;
                }
            }
            double percentageOfPeopleAboveAverage = (numberOfPeopleAboveAverage / numberOfPeople) * 100;
            toPrint.add(percentageOfPeopleAboveAverage);
        }
        for (Double dub : toPrint)
        {
            String output = String.format("%.3f%%", dub);
            System.out.println(output);
        }
    }
}
