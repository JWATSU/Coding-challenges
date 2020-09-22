package ReversedBinaryNumbers;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String numberInBinary = Integer.toBinaryString(number);
        String reversedNumberInBinary = new StringBuilder(numberInBinary).reverse().toString();
        int reversedNumber = Integer.parseInt(reversedNumberInBinary, 2);
        System.out.println(reversedNumber);
    }
}
