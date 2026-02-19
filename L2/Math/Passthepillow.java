public class Passthepillow {
    public static int passThePillow(int n, int time) {
        int cycle = 2 * (n - 1);
        int pos = time % cycle;
        if (pos <= n - 1) {
            return 1 + pos;      // forward direction
        } else {
            return n - (pos - (n - 1));  // backward direction
        }
    }

    public static void main(String[] args) {
        System.out.println(passThePillow(4,5));
        System.out.println(passThePillow(4,10));
    }

}
