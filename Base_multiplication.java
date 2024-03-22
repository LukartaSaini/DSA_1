package Number_System;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Base for multiplication: ");
        int b = s.nextInt();
        System.out.print("Enter n1 : "); // smaller
        int n1 = s.nextInt();
        System.out.print("Enter n2: ");
        int n2 = s.nextInt();

        int result = multiplication(b, n1, n2);
        System.out.println(result);
    }

    public static int multiplication(int b, int n1, int n2) {

        int rv = 0;
        int power = 1;
        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;

            int singleresult = singleproduct(b, n1, d2);
            rv = sum(b, rv, singleresult * power);
            power = power * 10;
        }
        return rv;
    }

    public static int singleproduct(int b, int n1, int d2) {

        int rv = 0;
        int power = 1;
        int carry = 0;

        while (n1 > 0 || carry > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;

            int d = d1 * d2 + carry;

            carry = d / b;
            d = d % b;

            rv += d * power;
            power = power * 10;

        }
        return rv;
    }

    public static int sum(int b, int n1, int n2) {
        int rv = 0;
        int power = 1;
        int carry = 0;

        while (n1 > 0 || n2 > 0 || carry > 0) {

            int d1 = n1 % 10;
            int d2 = n2 % 10;

            n1 = n1 / 10;
            n2 = n2 / 10;

            int d = d1 + d2 + carry;
            carry = d / b;
            d = d % b;

            rv += d * power;
            power = power * 10;

        }
        return rv;
    }
}

// OUTPUT
// Enter Base for multiplication: 8
// Enter n1 : 432
// Enter n2: 27
// 14526
// Enter Base for multiplication: 8
// Enter n1 : 234
// Enter n2: 76
// 22710