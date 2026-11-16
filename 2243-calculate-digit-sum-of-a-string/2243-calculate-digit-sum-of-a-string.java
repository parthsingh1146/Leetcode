class Solution {
    public String digitSum(String s, int k) {
        while(s.length() > k){
            StringBuilder sb = new StringBuilder();
            int count = 0;
            int sum = 0;
            for(int i = 0;i<s.length();i++){
                if(count == k){
                    sb.append(String.valueOf(sum));
                    sum = 0;
                    count = 0;
                }
                count++;
                int n = (int) s.charAt(i) - '0';
                sum += n;
            }
            if(count > 0){
                sb.append(String.valueOf(sum));
            }

            s = sb.toString();
        }
        return s;
    }
}