public class ex16 {
    public static void main(String[] args) {
        int n=5;
        for(char i='A';i<(char)'A'+n;i++){
            for(char j='A';j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
