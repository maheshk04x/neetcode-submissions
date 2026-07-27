class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk = new Stack<>();
        for(String s:operations){
            if(s.equals("C")){
                stk.pop();
            }else if(s.equals("D")){
                stk.push(stk.peek() * 2);
            }else if(s.equals("+")){
                int top = stk.pop();
                int newTop = stk.peek() + top;
                stk.push(top);
                stk.push(newTop);
            }else{
                stk.push(Integer.parseInt(s));
            }
        }
        int sum = 0;
        for(int i:stk){
            sum+=i;
        }
        return sum;
    }
}