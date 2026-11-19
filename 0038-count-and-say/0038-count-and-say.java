class Solution {
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        String prev = countAndSay(n-1);
        StringBuilder ans = new StringBuilder();
        char lastChar = prev.charAt(0); 
        int count = 1;
        for(int i = 1;i<prev.length();i++){
            char curr = prev.charAt(i);
            if(curr == lastChar){
                count++;
            }
            else{
                ans.append(count);
                ans.append(lastChar);
                lastChar = curr;
                count = 1;
            }
        }
        ans.append(count);
        ans.append(lastChar);
        return ans.toString();
    }
    
}