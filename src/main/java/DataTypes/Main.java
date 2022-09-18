package PrimitiveTypes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Primitive TYPE");
        System.out.println("---------------------------");
        byte num1 = 127;
        byte num2 = -128;
        System.out.println("Byte: -127 to 128 " +
                "\nMax:" + num1 +
                " Min:" + num2);
        short num3 = 32767;
        short num4 = -32768;
        System.out.println("---------------------------");
        System.out.println("Short:-32768 to 32767" +
                "\nMax:" + num3 +
                " Min:" + num4);
        int num5 = -2147483648;
        int num6 = 2147483647;
        System.out.println("---------------------------");

        System.out.println("int:-2147483648 to 2147483647" +
                "\nMin:" + num5 +
                " Max:" + num6);

        System.out.println("---------------------------");

        System.out.println("Long:-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807" +
                "\nMin:" + "-9,223,372,036,854,775,808" +
                " Max:" + "9,223,372,036,854,775,807");

                System.out.println("---------------------------");
                System.out.println("Float:-32768 to 32767" +
                        "\nMax:" + num3 +
                        " Min:" + num4);
    }
}
