public class ex15 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
            for(char j='A';j<(char)'A'+i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
