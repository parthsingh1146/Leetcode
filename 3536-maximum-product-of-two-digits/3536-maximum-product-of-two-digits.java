class Solution {
    public int maxProduct(int n) {
        int temp = n;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp >0){
            int r = temp % 10;
            list.add(r);
            temp = temp/10;
        }
        int max = Collections.max(list);
        list.remove(Integer.valueOf(max)); 
        int secMax = Collections.max(list);
        return max * secMax;
    }
}