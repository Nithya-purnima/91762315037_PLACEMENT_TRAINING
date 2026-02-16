// We are finding:
// The biggest value of
// frequency(x) + frequency(x + 1)
import java.util.HashMap;
class LongestHarmoniumSubsequence {
    public static int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxLength = 0;

        // Check pairs
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                maxLength = Math.max(maxLength,
                        map.get(key) + map.get(key + 1));
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7};
        int res=findLHS(nums);
        System.out.println(res);
    }

}