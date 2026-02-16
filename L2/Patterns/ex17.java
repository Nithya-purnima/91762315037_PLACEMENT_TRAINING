public class ex17 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 0; i < n; i++){
            // spaces
            for(int j = 1; j <= n - i - 1; j++){
                System.out.print(" ");
            }
            // increasing letters
            for(int j = 0; j <= i; j++){
                System.out.print((char)('A' + j));
            }
            // decreasing letters
            for(int j = i - 1; j >= 0; j--){
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }
    }
}
