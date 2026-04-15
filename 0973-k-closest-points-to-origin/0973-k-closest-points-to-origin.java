class Solution {
    public int[][] kClosest(int[][] p, int k) {
        Arrays.sort(p, (a, b) -> a[0]*a[0]+a[1]*a[1] - (b[0]*b[0]+b[1]*b[1]));
        return Arrays.copyOfRange(p, 0, k);
    }
}