import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 3, 5, 6};
        System.out.println("Result: ");
        int[] result = twoSum(nums, 8);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
