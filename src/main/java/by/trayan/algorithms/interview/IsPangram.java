package by.trayan.algorithms.interview;

import java.util.List;

/**
 * Meaning of pangram in English. a sentence that contains every letter of the alphabet, if possible with
 * each letter only being used once: A familiar example of a pangram, though with duplications, is the
 * typists' test sentence: The quick brown fox jumps over the lazy dog.

 * example: Pack my box with five dozen liquor jugs.
 */

public class IsPangram {

    // contains all letters - a-z
    public static String isPangram(List<String> pangram) {
        final StringBuilder result = new StringBuilder();

        for (String element : pangram) {
            boolean[] alphaList = new boolean[26];
            int index = 0;
            int flag = 1;
            for (int i = 0; i < element.length(); i++) {
                if (element.charAt(i) >= 'a' && element.charAt(i) <= 'z') {
                    index = element.charAt(i) - 'a';
                }
                alphaList[index] = true;
            }
            for (int i = 0; i <= 25; i++) {
                if (!alphaList[i]) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) result.append("1");
            else result.append("0");
        }
        return String.valueOf(result);
    }


    public static int gemstones(List<String> rocks) {
        String[] rocksArray = new String[rocks.size()];  // array of rocks
        // ArrayList to Array Conversion
        for (int j = 0; j < rocks.size(); j++) {
            rocksArray[j] = rocks.get(j);
        }

        int gemStoneCounter = 0;  // counter for gemstones

        int[] matchCounter = new int[26];  // 26 counts (for each of the 26 letters in alphabet)
        // rock to test
        for (String x : rocksArray) {  // for each rock, matchCounter letters
            for (int j = 0; j < 26; j++) {  // for each letter in alphabet
                char y = (char) (j + 97);  // from decimal ASCII code to lower-case char
                if (x.indexOf(y) != -1)  // if current letter-char found in rock
                    matchCounter[j]++;  // increment letter-matchCounter
            }

        }  // test next rock against alphabet (and matchCounter)

        for (int i = 0; i < 26; i++) { // test each letter counter if it satisfies (at least once per rock)
            if (matchCounter[i] == rocksArray.length)
                gemStoneCounter++;  // if satisfied (gemstone found) then increment counter
        }
        return gemStoneCounter;
    }
}
