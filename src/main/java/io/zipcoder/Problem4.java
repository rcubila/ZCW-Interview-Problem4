package io.zipcoder;

import java.util.HashSet;
import java.util.Set;

public class Problem4 {

    public static void main(String[] args) {

        Problem4 problem4 = new Problem4();
        System.out.println(problem4.permutePalindrome("cd cdc dcdeeeef "));

    }

    public boolean permutePalindrome(String word) {

        word = word.replaceAll("\\s+", "").trim();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            if (!set.add(word.charAt(i))) set.remove(word.charAt(i));
        }
        return set.size() <= 1;
    }

}
