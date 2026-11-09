class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            list.add(i);
        }
        int start = 0;
        while(list.size()>1){
            int index = (start + (k-1))%list.size();
            list.remove(index);
            start = index;
        }
        return list.get(0);
    }
}