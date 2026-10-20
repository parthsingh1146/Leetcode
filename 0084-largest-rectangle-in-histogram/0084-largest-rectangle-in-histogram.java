class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        
        // ARRAY TO STORE PREVIOUS SMALLEST INDEX FOR EACH ELEMENT
        int[] pse = new int[n];
        Deque<Integer> pseStack = new ArrayDeque<>();
        int defaultVal = -1; // if element have no previous smallest index
        for(int i = 0;i<n;i++){
            while(!pseStack.isEmpty() && heights[i] <= heights[pseStack.peek()]){
                    pseStack.pop();
            }
            if(pseStack.isEmpty()){
                pse[i] = defaultVal;
            }
            else{
                pse[i] = pseStack.peek();
            }
            pseStack.push(i);
        }
        
        // ARRAY TO STORE NEXT SMALLEST INDEX FOR EACH ELEMENT
        int[] nse = new int[n];
        Deque<Integer> nseStack = new ArrayDeque<>();
        defaultVal = n; // if element have no next smallest index
        for(int i = n-1;i>=0;i--){
            while(!nseStack.isEmpty() && heights[i] <= heights[nseStack.peek()]){
                    nseStack.pop();
            }
            if(nseStack.isEmpty()){
                nse[i] = defaultVal;
            }
            else{
                nse[i] = nseStack.peek();
            }
            nseStack.push(i);
        }
        
        // NOW FOR EVERY ELEMENT WE WILL CALCULATE AREA AND FIND MAX-AREA
        int maxArea = 0;
        for(int i = 0;i<n;i++){
            int area = (nse[i] - pse[i] - 1) * heights[i];
            if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
}