class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] copy = Arrays.copyOf(nums1, m);
        int index = 0 , i = 0 , j= 0;
        while(index < m+n){
            if(j>=n || (i<m && copy[i] <= nums2[j])){
                nums1[index] = copy[i];
                index++;
                i++;
            }else{
                nums1[index] = nums2[j];
                index++;
                j++;
            }
        }
    }
}