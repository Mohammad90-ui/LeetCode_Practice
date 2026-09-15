class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid % 2 == 1) {
                mid--;   // force mid to always be even
            }

            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2;   // pair is normal, single is to the right
            } else {
                end = mid;         // pair is broken, single is here or left
            }
        }
        return nums[start];
    }
}