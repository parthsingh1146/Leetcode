class Solution {
    public int orangesRotting(int[][] grid) {
        Deque<int[]> queue = new ArrayDeque<>();
        int pureCount = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j] == 2){
                    queue.offer(new int[]{i,j});
                }
                if(grid[i][j] == 1){
                    pureCount++;
                }
            }
        }
        int count = 0;
        while(!queue.isEmpty()){
            boolean rottedInThisMinute = false;
            int size = queue.size();

            for(int k = 0; k < size; k++){
                int[] currIndex = queue.poll();
                int i = currIndex[0];
                int j = currIndex[1];
                if(j<grid[0].length - 1 && grid[i][j+1] == 1){
                    grid[i][j+1] = 2;
                    pureCount--;
                    rottedInThisMinute = true;
                    queue.offer(new int[]{i,j+1});
                }
                if(j>0 && grid[i][j-1] == 1){
                    grid[i][j-1] = 2;
                    pureCount--;
                    rottedInThisMinute = true;
                    queue.offer(new int[]{i,j-1});
                }
                if(i>0 && grid[i-1][j] == 1){
                    grid[i-1][j] = 2;
                    pureCount--;
                    rottedInThisMinute = true;
                    queue.offer(new int[]{i-1,j});
                }
                if(i<grid.length - 1 && grid[i+1][j] == 1){
                    grid[i+1][j] = 2;
                    pureCount--;
                    rottedInThisMinute = true;
                    queue.offer(new int[]{i+1,j});
                }
            }
            if(rottedInThisMinute){
                count++;
            }
        }
        if(pureCount != 0){
            return -1;
        }
        return count;
    }
}