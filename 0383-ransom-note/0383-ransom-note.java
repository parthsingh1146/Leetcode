class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] mfreq = new int[26];

        for(char ch : magazine.toCharArray()){
            mfreq[ch - 'a'] ++;
        }

        for( char ch : ransomNote.toCharArray()){
            mfreq[ch - 'a']--;
            if(mfreq[ch - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}