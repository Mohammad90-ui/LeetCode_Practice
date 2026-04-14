class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        dfs(0,0,"",ans, n);
        return ans;
    }
    void dfs(int op, int cp, String s, List<String> ans, int n){
        if(op == cp && op + cp == n * 2){
            ans.add(s);
            return;
        }
        if(op < n) dfs(op+1, cp, s + "(", ans, n);
        if(cp < op) dfs(op, cp+1, s+")", ans, n);
        
    }
}