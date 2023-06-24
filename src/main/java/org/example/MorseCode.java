package org.example;

import java.util.HashMap;
import java.util.Set;

public class MorseCode {
    public MorseCode() {
    }
    public static String toMorseCode(String value) {
        HashMap<Character, String> hashMap = new HashMap<>();
        hashMap.put('E', ".");
        hashMap.put('O', "---");
        hashMap.put('S', "...");
        hashMap.put('T', "-");
        hashMap.put('W', ".--");

        Set<Character> keySet = hashMap.keySet();

        try {
            for (char c : value.toCharArray()) {
                System.out.println(c);
                if (!keySet.contains(c)) {
                    throw new IllegalArgumentException("Illegal Character in String");
                }
            }
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
            return "Illegal Character in String";
        }

        StringBuilder acc = new StringBuilder();
        String morseValue;

        for (int i = 0; i < value.length(); i++) {
            morseValue = hashMap.get(value.charAt(i));
            if (morseValue != null) {
                acc.append(morseValue).append("  ");
            }
        }

        return acc.toString().trim();
    }
}
