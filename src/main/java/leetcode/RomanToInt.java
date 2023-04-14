package leetcode;

import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(convertRomanToInt("MCMXCVIII"));
    }
    public static int convertRomanToInt(String s) {
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((i+1) < s.length()) {
                char cNext = s.charAt(i+1);
                if (map.get(c) > map.get(cNext)) {
                    result += map.get(c);
                } else if (map.get(c) < map.get(cNext)) {
                    result -= map.get(c);
                } else result += map.get(c);
            }
            else result += map.get(c);
        }
        return result;
    }
}

// get char in string: str.charAt(i));
// remove char in string:
/*
String str = "www.journaldev.com";
System.out.println("Last 4 char String: " + str.substring(str.length() - 4));
System.out.println("First 4 char String: " + str.substring(0, 4));
System.out.println("website name: " + str.substring(4, 14));*/
