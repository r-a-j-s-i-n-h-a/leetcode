class Solution {
    public int strStr(String haystack, String needle) {
 
         int res = haystack.indexOf(needle);
        if (res == -1)
            return -1;
        else
            return res;
    }
}