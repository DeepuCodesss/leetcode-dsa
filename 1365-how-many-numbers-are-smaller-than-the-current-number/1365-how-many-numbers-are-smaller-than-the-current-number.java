class Solution {
 public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] bsdk = new int[101];
        
        for(int i=0; i<nums.length; i++) {
            bsdk[nums[i]] +=1;
        }
        
        for(int j=1; j<= 100; j++) {
            bsdk[j] += bsdk[j-1];
        }
        
        for(int k=0; k< nums.length; k++) {
            int pos = nums[k];
            nums[k] = pos==0 ? 0 : bsdk[pos-1];
        }
        
        return nums;
    }   
}