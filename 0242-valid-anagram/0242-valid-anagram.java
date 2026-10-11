class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        for(int index = 0;index<sArr.length;index++){
            if(sArr[index] != tArr[index]){
                return false;
            }
        }
        return true;
    }
}