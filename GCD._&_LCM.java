import java.util.*;

class Main {
    // greatest common divion(GCD) & LCM of 2 number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter  no: ");
        int n1 = sc.nextInt();
        System.out.print("enter 2nd no: ");
        int n2 = sc.nextInt();
        int on1 = n1, on2 = n2;

        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int gcd = n2;
        int lcm = (on1 * on2) / gcd;

        System.out.println("Greatest Common Divion" + gcd);
        System.out.println("LCM" + lcm);
    }

}
