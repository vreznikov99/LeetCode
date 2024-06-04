/**
 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 You may assume that each input would have exactly one solution, and you may not use the same element twice.
 You can return the answer in any order.

 Example 1:

 Input: nums = [2,7,11,15], target = 9
 Output: [0,1]
 Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 Example 2:

 Input: nums = [3,2,4], target = 6
 Output: [1,2]
 Example 3:

 Input: nums = [3,3], target = 6
 Output: [0,1]
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,-2,-3,-4,-5};
        int target = -8;
        int[] result = TwoSum.twoSum(nums, target);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }

    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int numSecond;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            int numCur = nums[i];
            for (int j = 0; j < nums.length; j++){
                sum = 0;
                if (i == j){
                    continue;
                }
                sum += numCur + nums[j];
                if(sum == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
//                if (j == nums.length - 1){
//                    break;
//                }

            }
        }
        return result;
    }
}
