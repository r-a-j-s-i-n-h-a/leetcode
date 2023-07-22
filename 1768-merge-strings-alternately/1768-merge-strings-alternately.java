class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
        int a=word1.length();
        int b=word2.length();
        int c=Math.max(a,b);
        for(int i=0;i<c;i++){
            if(i<word1.length()){
                s+=word1.charAt(i);
            }
            
            if(i<word2.length()){
                s+=word2.charAt(i);
            }
            
        
        }
        return s;
            
    }
}