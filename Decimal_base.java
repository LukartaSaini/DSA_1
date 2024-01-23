import java.util.Scanner;

class Main{
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       int n=s.nextInt();
       int b=s.nextInt();
       
       int f= decimal_base(n,b);
       System.out.println(f);

    }
    public static int decimal_base(int n, int b)
    {    int return_value =0;
        int power=1;
        while(n>0)
        {
            int rem=n%b;
            n=n/b;

            return_value +=rem*power;
            power= power*10;
        }
        return return_value;


}}