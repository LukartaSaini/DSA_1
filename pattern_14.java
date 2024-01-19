 import java.util.Scanner;

class Main{
    //table
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the Number to display the table: ");
        int n = r.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
            System.out.println();
        }
    }
}

//OUTPUT

// Enter the Number to display the table: 5
// 5 * 1 = 5

// 5 * 2 = 10

// 5 * 3 = 15

// 5 * 4 = 20

// 5 * 5 = 25

// 5 * 6 = 30

// 5 * 7 = 35

// 5 * 8 = 40

// 5 * 9 = 45

// 5 * 10 = 50