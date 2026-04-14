class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
         getAllSubsets(nums, 0, res, subset);
         return res;
    }
    void getAllSubsets(int[] nums, int i, List<List<Integer>> res, List<Integer> subset){
        if(i == nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        getAllSubsets(nums, i+1, res, subset);
        subset.remove(subset.size() - 1);
        while(i+ 1 < nums.length && nums[i] == nums[i + 1]) i++;
        getAllSubsets(nums, i+1, res, subset);
    }
}