class Solution {
    public boolean checkString(String s) {
        int mark = -1;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'b'){
                mark = i;
                break;
            }
        }
        if(mark == -1){
            return true;
        }
        for(int i = mark;i<s.length();i++){
            if(s.charAt(i) == 'a'){
                return false;
            }
        }

        return true;
    }
}