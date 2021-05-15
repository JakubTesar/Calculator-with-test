package presentation;

import logic.Logic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Cli {
    static Scanner  sc = new Scanner(System.in);
    static Logic logic = new Logic();

    public static void show() {
        int choise = 0;
        while (true) {
            System.out.println();
            System.out.println("---------Čégo co si chceš vypočítat?---------");
            System.out.println("Napiš 1 pro sčítání");
            System.out.println("Napiš 2 pro odčítání");
            System.out.println("Napiš 3 pro násobení");
            System.out.println("Napiš 4 pro dělení");
            System.out.println("Napiš 5 pro mocnění");
            System.out.println("Napiš 6 pro faktoriál");
            choise = sc.nextInt();
            if (choise == 1) plus();
            if (choise == 2) minus();
            if (choise == 3) times();
            if (choise == 4) divided();
            if (choise == 5) power();
            if (choise == 6) factorial();
        }
    }

    public static void plus() {
        System.out.println("Napiš první číslo:");
        int a = sc.nextInt();
        System.out.println("Napiš druhé číslo:");
        int b = sc.nextInt();
        System.out.println("Součet těchto čísel je " + logic.plus(a, b));
    }
    public static void minus() {
        System.out.println("Napiš první číslo:");
        int a = sc.nextInt();
        System.out.println("Napiš druhé číslo:");
        int b = sc.nextInt();
        System.out.println("Rozdíl těchto čísel je " + logic.minus(a, b));
    }
    public static void times() {
        System.out.println("Napiš první číslo:");
        int a = sc.nextInt();
        System.out.println("Napiš druhé číslo:");
        int b = sc.nextInt();
        System.out.println("Násobek těchto čísel je " + logic.times(a, b));
    }
    public static void divided() {
        System.out.println("Napiš první číslo, které chceš vydělit:");
        int a = sc.nextInt();
        System.out.println("Napiš druhé číslo, kterým chceš dělit:");
        int b = sc.nextInt();
        System.out.println("Součet těchto čísel je " + logic.divided(a, b));
    }
    public static void power() {
        System.out.println("Napiš první číslo, které chceš umocnit:");
        int a = sc.nextInt();
        System.out.println("Napiš druhé číslo, kretým první číslo umocníš:");
        int b = sc.nextInt();
        System.out.println("Umocnění tohoto čísla na "+ b + logic.power(a, b));
    }
    public static void factorial() {
        System.out.println("Napiš první číslo:");
        int a = sc.nextInt();
        System.out.println("Faktoriál tohoto čísla je " + logic.factorial(a));
    }
}
