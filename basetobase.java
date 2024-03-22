package Number_System;
import java.util.Scanner;

class Base {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print(" Enter the number : ");
        int n = s.nextInt();
        System.out.print("Enter base1 : ");
        int b1 = s.nextInt();
        System.out.print("Enter base2 : ");
        int b2 = s.nextInt();
        int result = basetobase(n, b1, b2);
        System.out.println(result);
    }

    public static int basetobase(int n, int b1, int b2) {
        int bd = basetodecimal(n, b1);
        int db = decimaltobase(bd, b2);
        return db;
    }

    public static int basetodecimal(int n, int b) {
        int rv = 0;
        int power = 1;

        while (n > 0) {
            int d = n % 10;
            n = n / 10;

            rv += d * power;
            power = power * b;
        }
        return rv;
    }

    public static int decimaltobase(int n, int b) {
        int rv = 0;
        int power = 1;

        while (n > 0) {
            int d = n % b;
            n = n / b;

            rv += d * power;
            power = power * 10;
        }
        return rv;

    }

}