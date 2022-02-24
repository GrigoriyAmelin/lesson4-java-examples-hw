package guru.qa;

public class FirstClass {

    // data types

    byte aByte = 10; // 8 bit -128..127
    short aShort = 100; // 16 bit -32,768..32,767
    int anInt = 100_000_000; // 32 bit -2,147,483,648..2,147,483,647 or (-2)^31 .. (2^31) -1
    long aLong = 100L; // 64 bit -9,223,372,036,854,775,808..9,223,372,036,854,775,807 or (-2)^63 .. 2^63-1

    char aChar; // 0..65,535

    float aFloat = 0.01F; //  32 bit -3.4E+38..3.4E+38 (стандарт IEEE 754)
    double aDouble = 0.00; // 64 bit -1.7E+308..1.7E+308 (стандарт IEEE 754)

    boolean aBoolean; // true или false

    // operators

    public static void main(String[] args){

        int a = 10;
        int b = 20;
        int c = a + b;
        a = a + b;
        a += b;

        System.out.println(c);
        System.out.println(++a); // будет посчитан инкремент, а потом выведен после подсчета
        System.out.println(a++); // будет выведен результат до подсчета инкремента, а потом посчитан инкремент и сохранен
        System.out.println(++a);

    }
}
