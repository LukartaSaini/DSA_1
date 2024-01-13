import java.util.*;
class Main {
   //  SET OF NO FORM PYTHAGOREAN TRIPLET(TRIANGE i.e LARGEST SIDE = SQUARE OF 2 SMALLER SIDE i.e 13^2=5^2+12^2)
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter  sides of a triange : ");
    int a= sc.nextInt();
    int b= sc.nextInt();
    int c= sc.nextInt();
    
    int max=a;
    if(b>=max)
      max=b;
  
    if(c>=max)
      max=c;
      
    if(max==a){
      boolean flag=((b*b + c*c) == (a*a));
      System.out.println("Pythagorean Triplet form "+flag);
    }
    else if(max == b){
      boolean flag=(((a*a) +( c*c)) == (b*b));
      System.out.println("Pythagorean Triplet form "+flag);
    }
    else{
      boolean flag=((a*a + b*b) == (c*c));
      System.out.println("Pythagorean Triplet form "+flag);
    }
  }
}
