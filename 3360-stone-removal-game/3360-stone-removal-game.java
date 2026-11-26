class Solution {
    public boolean canAliceWin(int n) {
        int breakStones = 10;
        int count = 0;
        while(n >= breakStones){
            count++;
            n = n - breakStones;
            breakStones--;
        }
        if(count % 2 == 0){
            return false;
        }
        return true;
    }
}