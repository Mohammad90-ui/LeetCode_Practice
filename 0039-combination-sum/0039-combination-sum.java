class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        getAllCom(nums, target, 0, ans, c);
        return ans;
    }
    void getAllCom(int[] nums, int tar, int idx, List<List<Integer>> ans, List<Integer> c){
        if(idx == nums.length || tar < 0) return;
        if(tar == 0) {
            ans.add(new ArrayList<>(c));
            return;
        }
        c.add(nums[idx]);
        getAllCom(nums, tar - nums[idx], idx, ans, c);
        c.remove(c.size() - 1);
        getAllCom(nums, tar, idx + 1, ans, c);
    }
}