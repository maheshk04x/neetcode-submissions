class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int low = 0;
        int high = people.length-1;
        Arrays.sort(people);
        int boats = 0;
        while(low <= high){
            if(people[low] + people[high] <= limit){
                low++;
            }
            high--;
            boats++;
        }
        return boats;
    }
}