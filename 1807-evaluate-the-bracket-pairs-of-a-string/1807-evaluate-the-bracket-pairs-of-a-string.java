class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        for(List<String> li : knowledge){
            map.put(li.get(0),li.get(1));
        }
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while(index != s.length()){
            char ch = s.charAt(index);
            if(ch == '('){
                StringBuilder place = new StringBuilder();
                index++;
                while(s.charAt(index) != ')'){
                    place.append(s.charAt(index));
                    index++;
                }
                String value = map.get(place.toString());
                if(value == null){
                    sb.append("?");
                }else{
                    sb.append(value);
                } 
            }
            else{
                sb.append(ch);
            }
            index++;
        }
        return sb.toString();
    }
}