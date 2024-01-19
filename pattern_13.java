class Main{
    public static void main(String[] args) {
        int n=6;
        for(int i=0; i<n; i++){
           int oc=1;
            for(int j=0; j<=i; j++){
                System.out.print(oc+"\t");
               int ic= oc*(i-j)/(j+1);
                oc=ic;
            }
            System.out.println();
        }
    }
}


// OUTPUT
// 1
// 1       1
// 1       2       1
// 1       3       3       1
// 1       4       6       4       1
// 1       5       10      10      5       1