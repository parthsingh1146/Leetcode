class Solution {
    public int maxLength(int[] nums) {
        int max = 2;
        int left = 0;
        long currProd = 1;

        for (int right = 0; right < nums.length; right++) {
            while (findGCD(currProd, nums[right]) > 1) {
                currProd /= nums[left];
                left++;
            }
            currProd *= nums[right];
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
    int findGCD(long a, long b) {
        if (b == 0) {
            return Math.abs((int)a);
        }
        return findGCD(b, a % b);
    }
}