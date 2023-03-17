package String_RegxLAB;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurringChar {

    public static void main(String[] args) {
        String inputString = "Hello World!";
        char maxChar = getMaxOccurringChar(inputString);
        System.out.println("The maximum occurring character in the string is: " + maxChar);
    }

    public static char getMaxOccurringChar(String str) {
        char maxChar = ' ';
        int maxCount = 0;
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = charCountMap.getOrDefault(ch, 0) + 1;
            charCountMap.put(ch, count);
            if (count > maxCount) {
                maxChar = ch;
                maxCount = count;
            }
        }
        return maxChar;
    }
}