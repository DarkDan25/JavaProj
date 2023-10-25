package Pract_8_8;

public class Polindrome {

    String isPalindrome(String word) {
        if (word.length() < 2) return "YES";
        else if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return "NO";
        }
        return isPalindrome(word.substring(1, word.length() - 1));
    }
}
