class Solution {
    public boolean hasDuplicate(int[] nums) {
        //create a Hash Map obj to store appeared num
        Map<Integer, Integer> map = new HashMap<>();

        //loop thru each element in the array
        for (int i = 0; i < nums.length; i++) {
            //use if else statement to check if a key value pair already exists
            //if true that it means the num has already appeared
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i],1);
            }
        }
        return false;
    }
}