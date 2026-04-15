class Solution {
    public int maxArea(int[] height) {
        int m = 0;
        int lp = 0, rp = height.length-1;
        while(lp<rp){
            int w = rp - lp;
            int h = Math.min(height[lp], height[rp]);
            int c = w * h;

            m = Math.max(m,c);
            if(height[lp] < height[rp]) lp++;
            else rp--;
        }
        return m;
    }
}