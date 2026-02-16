public class BinarySearch {
    public static int search(int[] nums, int target) {
        int l=0 , h=nums.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //Sorted Array
        int [] nums = {-1,0,3,5,9,12};
        int target=9;
        int ans=search(nums,target);
        System.out.println(ans);
    }

}
