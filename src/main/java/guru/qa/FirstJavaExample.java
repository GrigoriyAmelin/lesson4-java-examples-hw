package guru.qa;

public class FirstJavaExample {

    public static void main (String[] args) {

        byte aByte = -128;
        short aShort = 32767;
        int a = 100;
        int b = 200;
        char aChar = 1;
        float aFloat = 0.123f;
        double aDouble = 0.123;

        int c = a + b;
        int d = a - b;
        double e = a * aDouble;
        double f = a * aFloat;
        int g = 0;


        System.out.println("\n" + "Тестовые данные: " + "\n");
        System.out.println("a = " + a + "; b = " + b + "; aByte = " + aByte + "; aShort = " + aShort + ";");
        System.out.println("aChar = " + aChar + "; aFloat = " + aFloat + "; aDouble = " + aDouble + ".");
        System.out.println("\n" + "Результаты расчетов: " + "\n");

        System.out.println("c = (a + b) = " + c);
        System.out.println("d = (a - b) = " + d);
        System.out.println("(c * d) / 5450 = " + ((c * d) / 5450));
        System.out.println("e = (a * aDouble) = " + e);
        System.out.println("f = (a * aFloat) = " + f);
        System.out.println("(c * e) / 5450 = " + ((c * e) / 5450 + "\n"));
        System.out.println("(c * f) = " + c * f);
        System.out.println("(c * f) / 5450 = " + ((c * f) / 5450));
        System.out.println("(c * f) % 5 = " + ((c * f) % 3690) + "\n");

        System.out.println("c > (a + b) >> " + (c > (a + b)));
        System.out.println("e < f >> " + (e < f));
        System.out.println("e >= f >> " + (e >= f));
        System.out.println("(e < f) && (d <= c) >> " + ((e < f)&&(d <= c)));
        System.out.println("(e < f) || (d >= c) >> " + ((e < f)||(d >= c)));
        System.out.println("! ((e < f) || (d <= c)) >> " + (!(e < f)||(d >= c)) + "\n");
        System.out.println("a++ = " + a++);
        System.out.println("a = " + a);
        System.out.println("(a *= a) = " + (a *= a));
        System.out.println("(a += a) = " + (g += a));

        System.out.println("Переполнение: aShort * 2 = " + (aShort * 2));
    }
}
