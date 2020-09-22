package OneChickenPerPerson;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = scanner.nextInt();
        int numberOfChickens = scanner.nextInt();

        int difference = numberOfChickens - numberOfPeople;
        String pieceOrPieces = Math.abs(difference) > 1 ? "pieces" : "piece";
        if (difference < 0)
        {
            System.out.println("Dr. Chaz needs " + Math.abs(difference) + " more " + pieceOrPieces + " of chicken!");
        } else
        {
            System.out.println("Dr. Chaz will have " + difference + " " + pieceOrPieces + " of chicken left over!");
        }
    }
}
