public class ex12 {
    public static void main(String[] args) {
        int n=4,sp=n+2;
        for(int i=1;i<=n;i++){
            //First
            for(int j=1;j<i+1;j++){
                System.out.print(j);
            }
            //Space
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            //Second
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            sp-=2;
            System.out.println();
        }
    }
}
