class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        String first = strs[0];
        String last = strs[strs.length-1];
        if(strs.length == 1){
            return first;
        }
        for(int i=0;i<first.length();i++){
            if(first.charAt(i) != last.charAt(i)){
               break;
            }
            sb.append(first.charAt(i));
        }
        return sb.toString();
    }
}