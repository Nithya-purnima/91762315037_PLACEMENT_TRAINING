public class ex19 {
    public static void main(String[] args) {

        int n = 3;
        int sp = 0;

        // Upper part
        for (int i = n; i > 0; i--) {

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

        sp=n+1; 

        // Lower part
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
    }
}
