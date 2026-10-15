class Solution {
    public String simplifyPath(String path) {
        Deque<String> st = new ArrayDeque<>();
        String[] parts = path.split("/");
        for(String part : parts){
            if(part.equals("")){
                continue;
            }
            if(part.equals(".")){
                continue;
            }
            if(st.isEmpty() && part.equals("..")){
                continue;
            }
            if(!st.isEmpty() && part.equals("..")){
                st.pop();
                continue;
            }
            else{
                st.push(part);
            }
        }
        if(st.isEmpty()){
            return "/";
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append("/");
            ans.append(st.removeLast());
        }
        return ans.toString();
    }
}