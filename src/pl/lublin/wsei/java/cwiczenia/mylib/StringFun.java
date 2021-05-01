package pl.lublin.wsei.java.cwiczenia.mylib;

import pl.lublin.wsei.java.cwiczenia.StrongPasswordGeneratorTest;

import java.util.Locale;
import java.util.Random;

public class StringFun {

    public static String anarchize(String word) {
        String result = "";
        int isEven = word.charAt(0) == Character.toLowerCase(word.charAt(0)) ? 0 : 1;
        for (int i = 0; i < word.length(); i++) {
            if (i % 2 == isEven) result += Character.toLowerCase(word.charAt(i));
            else result += Character.toUpperCase(word.charAt(i));
        }
        return result;
    }

    public static String camelize(String senten) {
        String result = "";
        senten = senten.trim().toLowerCase();
        for (int i = 0; i < senten.length(); i++) {
            if (i == 0) {
                result += senten.charAt(i);
                continue;
            }
            if (Character.isWhitespace(senten.charAt(i))) continue;
            if (Character.isWhitespace(senten.charAt(i - 1))) {
                result += Character.toUpperCase(senten.charAt(i));
                continue;
            }
            result += senten.charAt(i);
        }
        return result;
    }

    public static String decamelize(String senten) {
        String result = "";
        senten = senten.trim();
        for (int i = 0; i < senten.length(); i++) {
            if (Character.isUpperCase(senten.charAt(i))) {
                result += " " + senten.charAt(i);
                continue;
            }
            result += senten.charAt(i);
        }
        return result.toLowerCase().trim();
    }

    public static String decamelizeSub(String senten) {
        String result = "";
        senten = senten.trim();
        int a = 0, b;
        for (int i = 0; i < senten.length(); i++) {
            if (Character.isUpperCase(senten.charAt(i)) && i != 0) {
                b = i;
                result += senten.substring(a, b) + " ";
                a = b;
                continue;
            }
            if (i == senten.length() - 1) result += senten.substring(a);
        }
        return result.toLowerCase();
    }

    public static Boolean isPalindrome(String senten) {
        StringBuilder sente = new StringBuilder();
        for (int i = 0; i < senten.length(); i++) {
            if (Character.isWhitespace(senten.charAt(i))) continue;
            sente.append(senten.charAt(i));
        }
        if (sente.toString().equals(sente.reverse().toString())) return true;
        return false;
    }

    public static String shuffle(String senten) {
        String result = "";
        Random ran = new Random();
        int a;
        int loop = senten.length();
        for (int i = 0; i < loop; i++) {
            a = ran.nextInt(senten.length());
            result += senten.charAt(a);
            senten = senten.substring(0, a) + senten.substring(a + 1);
        }
        return result;
    }



}
