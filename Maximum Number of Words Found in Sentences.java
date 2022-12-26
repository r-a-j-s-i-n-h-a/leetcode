class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<sentences.length;i++){
            String str=sentences[i];
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==' '){
                   count++; 
                }
                if(j==str.length()-1){
                    count++;
                }
            }
            if(count>max){
                max=count;
            }
            count=0;
        }
        return max;
    }
}
