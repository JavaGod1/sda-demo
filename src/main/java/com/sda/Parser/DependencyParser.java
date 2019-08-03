package com.sda.Parser;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DependencyParser {

    String input;

    public static String convertToShortForm(String input) {

        Pattern pattern = Pattern.compile("compile group: '(\\S*)', name: '(\\S*)', version: '(\\S*)'");
        Matcher matcher = pattern.matcher(input);
        matcher.find();

        String secondBlock = matcher.group(1);
        String thirdBlock = matcher.group(2);
        String fourthBlock = matcher.group(3);

        return "'" + secondBlock + ":" + thirdBlock + ":" + fourthBlock + "'";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String s = convertToShortForm(input);

        System.out.println(s);

    }

}

