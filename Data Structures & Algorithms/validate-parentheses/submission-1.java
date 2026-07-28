class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        Stack<Character> stk = new Stack<>();
        map.put(')' , '(');
        map.put('}' , '{');
        map.put(']' , '[');
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                if(stk.isEmpty()){
                    return false;
                }
                char top = stk.pop();
                if(top!= map.get(c)){
                    return false;
                }
            }else{
                stk.push(c);
            }
        }
        return stk.isEmpty();
    }
}
