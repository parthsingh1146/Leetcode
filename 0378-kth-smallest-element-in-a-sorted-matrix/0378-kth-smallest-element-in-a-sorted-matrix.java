class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i<matrix.length;i++){
            for(int j = i;j<matrix[i].length;j++){
                pq.offer(matrix[i][j]);
                if(i != j){
                    pq.offer(matrix[j][i]);
                }
                while(pq.size() > k){
                    pq.poll();
                }
            }
        }
        return pq.peek();
    }
}