package guru.qa;

public class FirstJavaExample {

    public static void main (String[] args) {

        byte aByte = -128;
        short aShort = 32767;
        int a = 100;
        int b = 200;
        char aChar = 1;
        float aFloat = 0.1f;
        double aDouble = 0.1;

        int c = a + b;
        int d = a - b;


        System.out.println("\n" + "Тестовые данные: ");
        System.out.println("a = " + a + "; b = " + b + "; aByte = " + aByte + "; aShort = " + aShort + ";");
        System.out.println("aChar = " + aChar + "; aFloat = " + aFloat + "; aDouble = " + aDouble + ".");
        System.out.println("\n" + "Результаты расчетов: ");

        System.out.println("c = (a + b) = " + c);
        System.out.println("d = (a - b) = " + d);
        System.out.println("(c * d) / 5 = " + ((c * d) / 5));
        System.out.println(a++); // будет выведен результат до подсчета инкремента, а потом посчитан инкремент и сохранен
        System.out.println(++a);
    }
}
