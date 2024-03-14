package com.basics;
import java.util.*;
public class class3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Concatenation
        String str1 = "Hello";
        String str2 = "World";
        String concatenatedString = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatenatedString);

        // Length of String
        System.out.println("Length of concatenated string: " + concatenatedString.length());

        // Comparison
        String str3 = "Hello";
        if (str1.equals(str3)) {
            System.out.println("Strings str1 and str3 are equal.");
        } else {
            System.out.println("Strings str1 and str3 are not equal.");
        }

        // Substring
        String subString = concatenatedString.substring(3, 8);
        System.out.println("Substring: " + subString);

        // Conversion
        int num = 12345;
        String numAsString = String.valueOf(num);
        System.out.println("Number as String: " + numAsString);

        // Uppercase and Lowercase
        String upperCaseString = concatenatedString.toUpperCase();
        System.out.println("Uppercase String: " + upperCaseString);

        String lowerCaseString = concatenatedString.toLowerCase();
        System.out.println("Lowercase String: " + lowerCaseString);

        // Trim
        String stringWithSpaces = "   This is a string with spaces.   ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed String: " + trimmedString);

        // Replace
        String replacedString = stringWithSpaces.replace(" ", "_");
        System.out.println("Replaced String: " + replacedString);

        // Split
        String sentence = "Java is a programming language";
        String[] words = sentence.split(" ");
        System.out.println("Words in sentence:");
        for (String word : words) {
            System.out.println(word);
        }

        // Check if a string contains another string
        String mainString = "This is the main string";
        String subStringToCheck = "main";
        if (mainString.contains(subStringToCheck)) {
            System.out.println("Main string contains the substring");
        } else {
            System.out.println("Main string does not contain the substring");
        }

        scanner.close();
    }
}
