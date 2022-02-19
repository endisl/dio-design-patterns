package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Robot {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter commands: ");
        String commands = input.next().toUpperCase();
        System.out.println(commands);

        List<Character> validCommands = new ArrayList<>();

        List<Character> movements = Arrays.asList('F', 'T', 'E', 'D');
        //movements.add('F'); movements.add('T'); movements.add('E'); movements.add('D');
        System.out.println(movements);

        for (char c : commands.toCharArray()) {
            if (movements.contains(c))
                validCommands.add(c);
            else {
                System.out.println("Oba!");
                System.exit(0);
            }
        }
        //System.out.println(validCommands);

        for (char c : validCommands)
            if (c == 'E')
                System.out.println("E");
            else if (c == 'D')
                System.out.println("E");
            else if (c == 'T')
                System.out.println("T");
            else if (c == 'F')
                System.out.println("F");
    }
}
