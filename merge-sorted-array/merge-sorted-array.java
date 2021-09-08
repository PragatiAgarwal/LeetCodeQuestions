class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        ArrayList<Integer> l = new ArrayList<Integer>(m+n);
        int i = 0, j = 0;
        
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                l.add(nums1[i]);
                i++;
            }
            
            else{
                l.add(nums2[j]);
                j++;
            }
        }
        
        while(i < m){
            l.add(nums1[i]);
            i++;
        }
        
         while(j < n){
            l.add(nums2[j]);
            j++;
        }
        
        System.out.println(l);
        
        for(i = 0; i<m+n; i++){
            nums1[i] = l.get(i);
        }
    }
}