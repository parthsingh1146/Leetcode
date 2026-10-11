class Solution {
    public int maxArea(int[] height) {
        int s = 0;
        int e = height.length - 1;
        int maxWater = 0;
        while(s < e){
            // calculate water
            int water = Math.min(height[s],height[e]) * (e - s);
            if(water>maxWater){
                maxWater = water;
            }
            if(height[s]<=height[e]){
                s++;
            }else{
                e--;
            }
        }
        return maxWater;
    }
}