import java.util.*;
class Main{
    
    public static void main(String[] args) {
       // System.out.println("hello");
        Scanner r = new Scanner(System.in);
        System.out.print("enter limit:");
        int n=r.nextInt();
     
        for(int i=0;i<n;i++){
            System.out.print("enter no:");
            int no=r.nextInt();
        
         int count=0;
         for(int j=2;j*j<=no;j++){
            if(no % j==0){
                count++;
                break;
            }
          }
          if(count==0){
            System.out.println(no+" prime");
          }
          else{
            System.out.println(no+" not prime");
          }
        }
    }}