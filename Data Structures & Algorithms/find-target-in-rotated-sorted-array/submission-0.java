class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low < high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > nums[high]) low = mid+1;
            else high = mid;
        }
        int result = bns(0, low, nums, target);
        if(result!=-1) return result;
        return bns(low, nums.length-1, nums, target);
    }
    public int bns(int low, int high, int[] nums, int target){
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
}
