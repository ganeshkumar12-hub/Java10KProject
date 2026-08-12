package com.coder.strings;

public class StringEx {

    public static void main(String[] args) {

        String s = "hello world";

        System.out.println("length      : " + s.length());
        System.out.println("Upper       : " + s.toUpperCase());
        System.out.println("lower       : " + s.toLowerCase());
        System.out.println("Substring   : " + s.substring(1, 3));
        System.out.println("char at     : " + s.charAt(0));
        System.out.println("indexOf     : " + s.indexOf("o"));
        System.out.println("replace     : " + s.replace('l', 'm'));
        System.out.println("concat      : " + s.concat(" hi"));
        System.out.println("equals      : " + s.equals("hello world"));
        System.out.println("equalsIgnore: " + s.equalsIgnoreCase("HELLO WORLD"));
        System.out.println("contains    : " + s.contains("world"));
        System.out.println("startsWith  : " + s.startsWith("hello"));
        System.out.println("endsWith    : " + s.endsWith("world"));
        System.out.println("lastIndexOf : " + s.lastIndexOf("l"));
        String s2 = "   hello world   ";
        System.out.println("trim        : " + s2.trim());
        System.out.println("isEmpty     : " + s.isEmpty());
        System.out.println("replaceAll  : " + s.replaceAll("l", "x"));
        String[] words = s.split(" ");
        System.out.println("split       : ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("compareTo   : " + s.compareTo("hello world"));

        int num = 100;
        String number = String.valueOf(num);

        System.out.println("valueOf     : " + number);
    }
}