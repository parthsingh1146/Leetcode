class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder buildS = new StringBuilder();
        StringBuilder buildT = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '#'){
                if(buildS.length() > 0)
                    buildS.deleteCharAt(buildS.length() - 1);
            }
            else{
                buildS.append(ch);
            }
        }
        for(char ch : t.toCharArray()){
            if(ch == '#'){
                if(buildT.length() > 0)
                    buildT.deleteCharAt(buildT.length() - 1);
            }
            else{
                buildT.append(ch);
            }
        }
        return buildS.toString().equals(buildT.toString());
    }
}