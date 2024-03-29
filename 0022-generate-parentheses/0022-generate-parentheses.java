class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        backtrace(ans, "",0,0,n);
        return ans;

    }
    public void backtrace(List<String> ans, String cur,int open, int close, int max){
        if(cur.length()==max*2){
            ans.add(cur);
            return;

        }
        if(open<max)
        backtrace(ans, cur+"(",open+1,close,max);
        if(close<open)
        backtrace(ans, cur+")",open, close+1,max);

    }
}