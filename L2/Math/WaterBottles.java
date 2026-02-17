class WaterBottles {
    public static int numWaterBottles(int numBottles, int numExchange) {
        //For Understanding 
        int n=numBottles, k=numExchange;
        int sum=n;
        while(n>=k){
            int newBottles = n / k;        // bottles we get after exchange
            int remaining = n % k;         // leftover empty bottles 
            sum += newBottles;             // drink the new bottle      
            n = newBottles + remaining;    // total empty bottles now
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int n=12,k=3;
        System.out.println("Ans:"+numWaterBottles(n,k));
    }
}