package Apaxiaaaaaaaaaaaans;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        StringBuilder newName = new StringBuilder(name.substring(0, 1));
        for (int i = 1; i < name.length(); i++)
        {
            String charBefore = String.valueOf(name.charAt(i - 1));
            String currentChar = String.valueOf(name.charAt(i));
            if (!currentChar.equals(charBefore))
            {
                newName.append(currentChar);
            }
        }
        System.out.println(newName.toString());
    }
}
