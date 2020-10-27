package ru.denis.gb;

public class HelloJava {

    public static void main(String args[]) {

        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;
        float t = 5.1f;
        double y = 6.1;
        char u = 'u';
        boolean i = true;

        Form(50, 5, 70, 50);
        Form(3, 18, 9, 78);
    }

    static void Form(int a, int b, int c, int d) {

        int sum = a * (b + (c / d));//int обрезал все что после '.'
        System.out.println(sum);
        boolean s = Form1(7, 9);
        System.out.println(s);
        Form2(-5);
         //boolean x = Form3(5);
    }


    static boolean Form1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }//не понимаю, почему не разрешается разместить вызов метода Form2
    }

    static void Form2(int i) {

        if (i >= 0)
            System.out.println("Это положительное число.");
        else if (i < 0)
            System.out.println("Это отрицательное число.");
        Form4("Андрей");

    }

    /*static boolean Form3(int d) {
        if (d < 0) return true;  //не понимаю, почему ошибка
    }*/

    static void Form4(String name) {
        System.out.println("Привет " + name + "!");
        Form5(2020);
    }

    static void Form5 (int a) {
        int c= (a%100);
        System.out.println(c);

        if ((a%100) != 0 & (a%4) == 0 | (a%400) == 0)
            System.out.println("Год високосный");
    }

}





