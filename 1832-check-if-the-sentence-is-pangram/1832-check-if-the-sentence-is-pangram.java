class Solution {
    public boolean checkIfPangram(String sentence) {
        // HashSet<Character> set = new HashSet<>();
        // for(char ch : sentence.toCharArray()){
        //     set.add(ch);
        // }
        // return set.size() == 26;
        int[] freq = new int[26];
        for(char ch : sentence.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i = 0;i< 26;i++){
            if(freq[i] == 0){
                return false;
            }
        }
        return true;
    }
}