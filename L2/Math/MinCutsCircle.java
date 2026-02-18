public class MinCutsCircle{
        public static int numberOfCuts(int n) {
        if(n==0||n==1) {
           return 0;
       }
        else if(n%2==1){
            return n;
        }
        else{
            return n/2;
        }
    }

    public static void main(String[] args) {
        System.out.println(numberOfCuts(4));
        System.out.println(numberOfCuts(5));
    }
}