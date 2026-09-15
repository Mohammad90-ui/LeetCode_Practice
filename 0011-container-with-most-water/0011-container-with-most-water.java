class Solution {
    public int maxArea(int[] height) {
        int lp = 0, rp = height.length - 1;
        int m = 0;

        while(lp < rp){
            int width = rp - lp;
            int h = Math.min(height[lp], height[rp]);
            int area = width * h;

            m = Math.max(m, area);

            if(height[lp] <= height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return m;
    }
}