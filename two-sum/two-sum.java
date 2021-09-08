class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int i = 0; i< nums.length; i++){
            int comp = target - nums[i];
            if(l.contains(nums[i])){
                result[0] = l.indexOf(nums[i]);
                result[1] = i;
                System.out.println("hi");
                return result;
            }
            
            else {
                l.add(comp);
            }
        }
        
        return result;
    }
}