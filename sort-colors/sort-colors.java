class Solution {
    public void sortColors(int[] nums) {
        int red = 0, white = 0, blue = 0;
        
        for(int n : nums){
            switch(n){
                case 0:red++;
                    break;
                case 1: white++;
                    break;
                case 2: blue++;
                    break;
                default:
                    
            }
        }
        
        int i=0;
        while(red>0){
            nums[i]=0;
            i++;
            red--;
        }
        while(white>0){
            nums[i]=1;
            i++;
            white--;
        }
        while(blue>0){
            nums[i]=2;
            i++;
            blue--;
        }
    }
}