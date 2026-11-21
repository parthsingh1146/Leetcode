class Solution {
    public int minOperations(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int min = 'z';
        int max = 'a';
        boolean alreadySorted = true;
        for(int c : arr){
            if(c < min){
                min = c;
            }
            if(c > max){
                max = c;
            }
        }
        for(int i = 1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                alreadySorted = false;
                break;
            }
        }

        if (alreadySorted) return 0;

        if (n == 2) return -1;

        if (arr[0] == min || arr[n - 1] == max) {
            return 1;
        }

        if (arr[0] == max && arr[n - 1] == min) {
            int minCount = 0, maxCount = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == min) minCount++;
                if (s.charAt(i) == max) maxCount++;
            }
            if (minCount == 1 && maxCount == 1) return 3;
        }
        return 2;
    }
}