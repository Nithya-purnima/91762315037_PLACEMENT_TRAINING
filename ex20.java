public class ex20 {
    public static void main(String[] args) {

        int n = 5;
        int sp = 2 * (n - 1);   

        // Upper part
        for (int i = 1; i <= n; i++) {

            // First star group
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            // Space group
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }

            // Second star group
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            sp -= 2;  
            System.out.println();
        }

        sp = 2;   

        // Lower part
        for (int i = n - 1; i >= 1; i--) {

            // First star group
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            // Space group
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }

            // Second star group
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            sp += 2; 
            System.out.println();
        }
    }
}
