package DngSesion1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int x = 10;
        double y = 3.14;
        String s = "Hello";
        System.out.println("x = " + x);
        y = y + 20 * x;

        if (y > 100) {
            System.out.println("y = " + y);
        } else {
            System.out.println("x =" + x);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        int S1 = 0;
        for (int i = 1; i <= 1000; i++) {
            S1 = S1 + i;
        }
        System.out.println("S1 = " + S1);
        double S2 = 0;
        for (int i = 1; i <= 1000; i++) {
            S2 = S2 + (double) 1 / i;
        }
        System.out.println("S2 =" + S2);


        int z = tinhTong(10, 15);
        boolean t = true;

        // nhap 1 so nguyen tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen");
        int n = sc.nextInt();

        System.out.println("Nhap 1 so thuc:");
        double d = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap 1 string:");
        String str = sc.nextLine();
        System.out.println("n: "+n);
        System.out.println("d: "+d);
        System.out.println("str: "+str);
    }


    }
}
