package com.lukasz;

import java.util.*;

public class Solution {
    private List<String> passphrases;
    private int numberOfValidPassphrases;

    public Solution(List<String> passphrases) {
        this.passphrases = passphrases;
        this.numberOfValidPassphrases = checkPassphrases();
    }

    private int checkPassphrases() {
        int sum = 0;

        ListIterator<String> i = passphrases.listIterator();
        while (i.hasNext()) {
            String currentPassphrase = i.next();
            if(passphraseValid(currentPassphrase))
                sum++;
        }

        return sum;
    }

    private static boolean passphraseValid(String line) {
        Set<String> set = new HashSet<>();
        Scanner passphraseScanner = new Scanner(line);
        while (passphraseScanner.hasNext()) {
            String currentWord = passphraseScanner.next();
            if(!set.add(currentWord)) {
                return false;
            }
        }

        return true;
    }


    public int getNumberOfValidPassphrases() {
        return numberOfValidPassphrases;
    }
}
