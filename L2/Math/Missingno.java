public class Missingno {
    public static int missingNumber(int[] nums) {
        int realsum=0,actsum=0;
        for(int i=1;i<=nums.length;i++){
                realsum+=i;
        }
        //For real sum : n * ((n + 1) / 2) ==>(3*4)/2=6

        for(int i:nums){
                actsum+=i;
        }
        return realsum-actsum;
    }

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
}
