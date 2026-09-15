class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map = new HashMap<>();
        ArrayList<String> ans = new ArrayList<>();
        String output = "";
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        solve(digits,map,0, output,ans);
        return ans;
    }
    void solve(String digits, HashMap<Character,String> map, int index, String output,ArrayList<String> ans ){
        // base case
        if(index == digits.length()){
            System.out.println("String: "+ output);
            ans.add(output);
            return;
        }

        // 1 case
        for(char ch : map.get(digits.charAt(index)).toCharArray()){
            solve(digits,map,index+1, output + ch,ans);
        }
    }
}