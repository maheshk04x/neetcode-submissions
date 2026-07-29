class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for(String s:tokens){
            switch(s){
                case "+" -> {
                    int top = stk.pop();
                    stk.push(stk.pop() + top);
                }
                case "*" -> {
                    int top = stk.pop();
                    stk.push(stk.pop() * top);
                }
                case "-" -> {
                    int top = stk.pop();
                    stk.push(stk.pop() - top);
                }
                case "/" -> {
                    int top = stk.pop();
                    stk.push(stk.pop() / top);
                }
                default -> stk.push(Integer.parseInt(s));
            }
        }
        return stk.pop();
    }
}
