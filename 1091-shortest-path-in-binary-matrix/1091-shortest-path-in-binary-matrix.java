class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        Deque<int[]> queue = new ArrayDeque<>();
        if(grid[0][0] == 1 || grid[n-1][n-1] == 1){
            return -1;
        }

        queue.offer(new int[] {0,0});
        int[][] dirArr = new int[][] {
            {-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}
        };
        int ans = 0;
        while(!queue.isEmpty()){
            int qn = queue.size();
            for(int i = 0;i<qn;i++){
                int[] currIndex = queue.poll();
                int row = currIndex[0];
                int col = currIndex[1];
                if(row == n - 1 && col == n-1){
                    return ans + 1;
                }
                for(int[] dir : dirArr){
                    int nr = row + dir[0];
                    int nc = col + dir[1];
                    if(nr >= 0 && nr < n && nc >= 0 && nc < n && grid[nr][nc] == 0){
                        grid[nr][nc] = -1;
                        queue.offer(new int[]{nr,nc});
                    } 
                }
            }
            ans++;
        }
        return -1;
    }
}