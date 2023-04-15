package leetcode;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(findLongestCommonPrefix(new String[] {"flower","flow","flight"}));
    }
    public static String findLongestCommonPrefix(String[] s) {
        StringBuilder answer = new StringBuilder();
        boolean isEqual = true;
        int minLength = s[0].length();
        for (int i = 1; i < s.length; i++) {
            if (s[i].length() < minLength) {
                minLength = s[i].length();
            }
        }
        for (int i = 0; i < minLength; i++) {
            for (int j = 0; j < s.length - 1; j++) {
                if (s[j].charAt(i) != s[j + 1].charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                answer.append(s[0].charAt(i));
            }
        }
        return answer.toString();
    }
}