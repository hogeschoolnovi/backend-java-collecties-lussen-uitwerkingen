package nl.Novi;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        HashSet<Integer> secretnumber = randomnumbergenerator();
        String stringnumber = setToStringConverter(secretnumber);
        System.out.println(stringnumber);
        // geef de variabele "stringnumber" mee aan de aanroep van de "feedback" methode
        feedback(stringnumber);
    }

    public static void feedback(String stringnumber) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder feedback = new StringBuilder();
        System.out.println("take a guess");
        String guess = scanner.nextLine();
        if (Objects.equals(guess, stringnumber)) {
            System.out.println("gefeliciteerd je hebt het goed");
        } else {
            for (int i = 0; i < 4; i++) {
                if (guess.substring(i, i + 1).equals(stringnumber.substring(i, i + 1))) {
                    feedback.append("+");
                } else if (stringnumber.contains(guess.substring(i, i + 1))) {
                    feedback.append("0");
                } else {
                    feedback.append("X");
                }
            }
        }
        System.out.println(feedback.toString());
    }

    public static HashSet<Integer> randomnumbergenerator() {
        Random rand = new Random();
        HashSet<Integer> secretnumber = new HashSet<>();
        while (secretnumber.size() < 4) {
            int randomnumber = rand.nextInt(9) + 1;
            secretnumber.add(randomnumber);
        }
        return secretnumber;
    }

    public static String setToStringConverter(HashSet<Integer> secretnumber) {
        StringBuilder stringnumber = new StringBuilder();
        for (Integer element : secretnumber) {
            stringnumber.append(element.toString());
        }
        return stringnumber.toString();
    }

}
