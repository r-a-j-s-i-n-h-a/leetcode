class Solution {
    public int minSwaps(String s) {
        if(s.length()%2!=0){
            
        }
    Stack<Character> stack = new Stack<>();
        
        
    for(int i=0;i<s.length();i++){
        if( s.charAt(i)=='['){
            stack.push(s.charAt(i));
            
        }
        else{
            if(!stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
    }
        int unb = stack.size()/2; // # of open or close bracket
        return (unb+1)/2;
    }
}