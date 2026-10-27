class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int total = 0;
        int min = 0;
        for(int i:weights){
            min = Math.max(i, min);
            total+=i;
        }
        int low = min;
        int high = total;
        while(low < high){
            int mid = low + (high - low)/2;
            int totalDays = cal(weights, mid);
            if(totalDays > days){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return low;
        
    }

    public int cal(int[] weights, int maxCapacity){
        int totalDays = 1;
        int cap = 0;
        for(int i=0;i<weights.length;i++){
            if(cap + weights[i] > maxCapacity){
                totalDays++;
                cap = 0;
            }
            cap+=weights[i];
        }
        return totalDays;
    }
}