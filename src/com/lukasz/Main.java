package com.lukasz;

import java.util.*;

public class Main {

    private static List<String> getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter passphrase: ");
        String line;
        List<String> passphrases = new ArrayList<>();
        while(!(line = scanner.nextLine()).isEmpty()) {
            passphrases.add(line);
        }

        return passphrases;
    }

    public static void main(String[] args) {

        List<String> passphrases = getInput();

        Solution solution = new Solution(passphrases);
        SolutionPart2 solution2 = new SolutionPart2(passphrases);
        System.out.println("There are " + solution.getNumberOfValidPassphrases() + " valid passphrases for part I.");
        System.out.println("And there are " + solution2.getNumberOfValidPassphrases() + " valid passphrases for part II.");


    }
}
