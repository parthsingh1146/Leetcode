class Solution {
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        String prev = countAndSay(n-1);
        StringBuilder ans = new StringBuilder();
        int lastDigit = prev.charAt(0) - '0'; 
        int count = 1;
        for(int i = 1;i<prev.length();i++){
            int curr = prev.charAt(i) - '0';
            if(curr == lastDigit){
                count++;
            }
            else{
                ans.append(count);
                ans.append(lastDigit);
                lastDigit = curr;
                count = 1;
            }
        }
        ans.append(count);
        ans.append(lastDigit);
        return ans.toString();
    }
    
}