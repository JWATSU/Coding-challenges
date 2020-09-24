package BabelFish;

import java.util.HashMap;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        HashMap<String, String> words = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        while (!input.isEmpty())
        {
            String[] toMap = input.split(" ");
            words.put(toMap[1], toMap[0]);
            input = scanner.nextLine().trim();
        }
        while (scanner.hasNextLine())
        {
            String word = scanner.nextLine();
            System.out.println(words.getOrDefault(word, "eh"));
        }
    }
}
