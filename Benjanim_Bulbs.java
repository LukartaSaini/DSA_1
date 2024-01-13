import java.util.*;
class Main{
    //alternative bulb light i.e perfect square number of bulb
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter  nos: ");
        int n= sc.nextInt();
    
        for(int i=1;i*i<=n; i++){
          System.out.println(i*i);
        }
      }
}