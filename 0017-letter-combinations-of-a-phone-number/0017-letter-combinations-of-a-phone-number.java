class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<>();
        String output = "";
        String[] mapping = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(digits, mapping,0, output,ans);
        return ans;
    }
    // void solve(String digits, HashMap<Character,String> map, int index, String output,ArrayList<String> ans ){
    //     // base case
    //     if(index == digits.length()){
    //         System.out.println("String: "+ output);
    //         ans.add(output);
    //         return;
    //     }

    //     // 1 case
    //     for(char ch : map.get(digits.charAt(index)).toCharArray()){
    //         solve(digits,map,index+1, output + ch,ans);
    //     }
    // }
    // more optimal using string array
    void solve(String digits, String[] mapping, int index, String output,ArrayList<String> ans ){
        // base case
        if(index == digits.length()){
            System.out.println("String: "+ output);
            ans.add(output);
            return;
        }
        // 1 case
        String mapped = mapping[digits.charAt(index) - 50];
        for(char ch : mapped.toCharArray()){
            solve(digits,mapping,index+1, output + ch,ans);
        }
    }
}