public class Solution {
    public boolean IsOdd(int n){
      if(n%2!=0) return true;
      else return false;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int total = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int count = k;
            for (int j = i; j < len; j++) {
                if(IsOdd(nums[j])==true) count--;
                if(count==0){
                    total++;
                    break;
                } 

            }
        }

    }

}
