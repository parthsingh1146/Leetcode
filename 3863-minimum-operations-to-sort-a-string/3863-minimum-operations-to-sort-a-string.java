class Solution {
    public int minOperations(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        char[] sorted = arr.clone();
        Arrays.sort(sorted);

        if (Arrays.equals(arr, sorted)) return 0;

        if (n == 2) return -1;

        if (arr[0] == sorted[0] || arr[n - 1] == sorted[n - 1]) {
            return 1;
        }

        if (arr[0] == sorted[n - 1] && arr[n - 1] == sorted[0]) {
            if(sorted[0] != sorted[1] && sorted[n-1] != sorted[n-2])
            return 3;
        }

        return 2;
    }
}