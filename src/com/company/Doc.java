package com.company;

import java.util.Locale;

public class Doc {
    String string;

    public Doc(String string) {
        this.string = string; // конструктор
    }

    public static void getBlock(String doc) {
        System.out.println(doc.substring(0, 4) + " " + doc.substring(9, 13)); // вывод 2 первых блока цифр
    }

    public static void replSymb(String doc) {
        StringBuilder s2 = new StringBuilder(doc.toString());
        s2.replace(5, 8, "***");
        StringBuilder s3 = new StringBuilder(s2);
        s3.replace(14, 17, "***");
        System.out.println(s3); // вывод с заменой на *
    }

    public static void getLetDelimit(String doc) {
        System.out.println(doc.join("/", doc.substring(5, 8), // толькл буквы ч/з /
                doc.substring(14, 17),
                doc.substring(19, 20),
                doc.substring(21, 22)));
    }

    public static void getLetUpp(String doc) {
        StringBuilder s4 = new StringBuilder(doc.join("/", doc.substring(5, 8),
                doc.substring(14, 17),
                doc.substring(19, 20),
                doc.substring(21, 22)));
        System.out.println("Letters: " + s4.toString().toUpperCase(Locale.ROOT)); // вывод в верх. регистре
    }

    public static void containsLet(String doc) {
        if (doc.toLowerCase(Locale.ROOT).contains("abc".toLowerCase(Locale.ROOT))) {
            System.out.println("Содержит");
        } else {
            System.out.println("Не содержит");
        }
    }
    public static void beginsNum(String doc) {
        System.out.println(doc.indexOf("555"));
    }

    public static void endNumLet(String doc) {
        System.out.println(doc.lastIndexOf("1a2b"));
    }
}

   



