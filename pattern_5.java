 class pattern_5 {
   public static void main(String[] args) {
    for(int i=1; i<=3; i++ ){
        for(int j=1; j<=3-i; j++ ){
            System.out.print(" ");
        }  
       for(int t=1; t<=2*i-1; t++){
            System.out.print("*");
          }
          System.out.println();
      }
      for(int i=2; i>=1; i--)
      {for(int a=1;a<=3-i; a++)
        {System.out.print(" ");
        }
        for(int b=1; b<=2*i-1; b++){
          System.out.print("*");
        }
        System.out.println();
      }}}


    //   OUTPUT        

    //    *
    //   ***
    //  *****
    //   ***
    //    *

