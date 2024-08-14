package Day_14;

import java.util.Arrays;
public class Solution {
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] nums={1,3,1};
        int k=1;
        System.out.println(s.smallestDistancePair(nums,k));
    }
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int low = 0, high = nums[n - 1] - nums[0];

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (countPairs(nums, mid) < k) low = mid + 1;
            else high = mid;
        }

        return low;
    }

    private int countPairs(int[] nums, int maxDistance) {
        int count = 0, j = 0;
        for (int i = 0; i < nums.length; ++i) {
            while (j < nums.length && nums[j] - nums[i] <= maxDistance) ++j;
            count += j - i - 1;
        }
        return count;
    }
}
