package CandleBox;

import java.util.Scanner;

public class CandleCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int ageDifference = scanner.nextInt();
        int ritaNumOfCandles = scanner.nextInt();
        int theoNumOfCandles = scanner.nextInt();

        if (ageDifference < 1 || ageDifference > 20 || ritaNumOfCandles < 4 || ritaNumOfCandles >= 1000 || theoNumOfCandles < 0 || theoNumOfCandles >= 1000)
        {
            System.out.println("Wrong input!");
        } else
        {
            int totalCandles = ritaNumOfCandles + theoNumOfCandles;
            int ritaSimulatedCandles = 0;
            int theoSimulatedCandles = 0;
            int ritaAge = 0 + ageDifference;
            int theoAge = 0;

            while (true)
            {
                ritaAge++;
                theoAge++;
                if (ritaAge >= 4)
                {
                    ritaSimulatedCandles += ritaAge;
                }
                if (theoAge >= 3)
                {
                    theoSimulatedCandles += theoAge;
                }
                if (ritaSimulatedCandles + theoSimulatedCandles == totalCandles)
                {
                    System.out.println(ritaNumOfCandles - ritaSimulatedCandles);
                    break;
                }
            }
        }
        scanner.close();
    }
}