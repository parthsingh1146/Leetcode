class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Deque<int[]> queue = new ArrayDeque<>();
        for(int i  = 0;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                if(mat[i][j] == 0){
                    queue.offer(new int[] {i,j});
                }
            }
        }
        boolean[][] done = new boolean[mat.length][mat[0].length];
        // Arrays.fill(done,false);
        while(!queue.isEmpty()){
            int n = queue.size();
            for(int i = 0;i<n;i++){
                int[] currIndex = queue.poll();
                int row = currIndex[0];
                int col = currIndex[1];

                int nr = row + 1;
                int nc = col + 1;
                if(row > 0 && mat[row - 1][col] == 1){
                    if(!done[row-1][col]){
                    mat[row-1][col] = mat[row][col] + 1;
                    done[row-1][col] = true; 
                    queue.offer(new int[]{row-1,col});
                    }
                }
                if(col > 0 && mat[row][col - 1] == 1){
                    if(!done[row][col - 1]){
                    mat[row][col - 1] = mat[row][col] + 1;
                    done[row][col - 1] = true; 
                    queue.offer(new int[]{row,col-1});
                    }
                }
                if(nr < mat.length && mat[nr][col] == 1){
                    if(!done[nr][col]){
                    mat[nr][col] = mat[row][col] + 1;
                    done[nr][col] = true; 
                    queue.offer(new int[]{nr,col});
                    }
                }
                if(nc < mat[0].length && mat[row][nc] == 1){
                    if(!done[row][nc]){
                    mat[row][nc] = mat[row][col] + 1;
                    done[row][nc] = true;
                    queue.offer(new int[]{row,nc});
                    }
                }
            }
        }
        return mat;
    }
}