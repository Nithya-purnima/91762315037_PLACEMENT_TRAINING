import java.util.*;

public class FindDisappearedno {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int arr[] = new int[nums.length];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]-1] = 1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (arr[i] == 0) {
                list.add(i+1);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = findDisappearedNumbers(nums);
        System.out.println(result);
    }
}
