
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       int n=s.nextInt();
       int b=s.nextInt();
       
       int f=  base_decimal(n,b);
       System.out.println(f);

    }
    public static int base_decimal(int n, int b)
    {    int return_value =0;
        int power=1;
        while(n>0)
        {
            int rem=n%10;
            n=n/10;

            return_value +=rem*power;
            power= power*b;
        }
        return return_value;


}}