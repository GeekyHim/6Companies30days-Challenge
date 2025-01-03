public class Solution {
    public int atMostSubarrays(int[] nums, int k){
        // solving using sliding windows
        int left = 0;
        int right = 0;
        int count = 0;
        for(right=0;right<nums.length;right++){
            if(nums[right]%2==1) k--;
            while(k<0){
                if(nums[left]%2==1) k++;
                left++;
            }
            count  +=  (right - left + 1);
            // right - left + 1 se total sub-array milti hai 
            // count += se vo pichle count me add ho jati hai 
        }
        return count;
    }


    public int numberOfSubarrays(int[] nums, int k) {
        int ans = atMostSubarrays(nums, k) - atMostSubarrays(nums, k-1);
        // example 
        // ek sliding window me zyada se zyada 3 honi chahiye aur esi kinti hogi -- A
        // ek me max to max 2 honi chahiye and esi kitni hogi - B
        // A-B sirf A wali bach jayegi
        return ans;
    }

}
