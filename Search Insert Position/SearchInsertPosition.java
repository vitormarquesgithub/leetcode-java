public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
            int targetIndexInsert = nums.length;
    
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    return i;
                }
    
                if (nums[i]  > target) {
                    targetIndexInsert = i;
                    return targetIndexInsert;
                }
            }
    
            return targetIndexInsert;
        }
    
    public static void main(String[] args) {
        int[] nums = new int[] {1,3,5,6};
        int result = searchInsert(nums, 2);
        System.out.println("Insertion position: " + result); 
    }
}
