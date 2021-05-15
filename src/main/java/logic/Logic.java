package logic;

public class Logic {
    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int divided(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("Nulou se nedá dělit TROUBO!!!");
        }
    }

    public int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public int factorial(int a) {
        if (a >= 0) {
            if (a == 0) return 1;
            if (a == 1) return 1;
            return a * factorial(a - 1);
        } else {
            throw new IllegalArgumentException("Když je číslo záporné, nelze z něj vypočítak Fakotriál!");
        }
    }
}
