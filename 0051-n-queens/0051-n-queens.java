class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0;i<n;i++){
            Arrays.fill(board[i] ,'.');
        }
        int colIndex = 0;
        solve(board,colIndex, n, ans);
        return ans;
    }
    void solve(char[][] board,int colIndex,int n, List<List<String>> ans){
        // Base Case
        if(colIndex >=n){
            List<String> list = new ArrayList<>();
            for(int i = 0;i<n;i++){
                String s = "";
                for(int j = 0;j<n;j++){
                    s = s + board[i][j];
                }
                list.add(s);
            }
            ans.add(list);
            return;
        }

        // 1 case
        for(int rowIndex = 0;rowIndex<n;rowIndex++){
            if(isSafeToMove(rowIndex,colIndex,n,board)){
                board[rowIndex][colIndex] = 'Q';
                solve(board,colIndex+1, n, ans);
                // backtracking
                board[rowIndex][colIndex] = '.';
            }
        }
    }
    boolean isSafeToMove(int rowIndex,int colIndex,int n,char[][] board){
        // left horizontal check
        int row = rowIndex;
        int col = colIndex;

        while(col>=0){
            if(board[row][col] == 'Q'){
                return false;
            }
            col--;
        }

        // upper diagonal check
        row = rowIndex;
        col = colIndex;

        while(row>=0 && col>=0){
            if(board[row][col] == 'Q'){
                return false;
            }
            row--;
            col--;
        }

        // lower diagonal check
        row = rowIndex;
        col = colIndex;

        while(row<n && col>=0){
            if(board[row][col] == 'Q'){
                return false;
            }
            row++;
            col--;
        }
        return true;
    }
}