class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> a  = new HashSet<Integer>();
        
        for(int i = 0; i<nums.length; i++){
            a.add(nums[i]);
        }
        if(nums.length == a.size()){
            return false;
        }
        
        else return true;
    }
}