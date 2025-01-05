// solving with median 
// going to use mergesort since one of the best sorting algo
public class Solution {
    public void mergeSort(int[] nums){
        int n = nums.length;
        if(n<=1) return;
        int[] left = new int[n/2];
        int[] right = new int[n-n/2];
        for(int i=0;i<n/2;i++){
            left[i] = nums[i];
        }
        for(int j=0;j<n-n/2;j++){
            right[j] = nums[j+n/2];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, nums);
    }

    public void merge(int[]left, int[]right,int[] nums){
        int i = 0;
        int j = 0;
        int k =0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]) nums[k++] = left[i++];
            else nums[k++] = right[j++];
        }
        while(i<left.length){
            nums[k++] = left[i++];
        }
        while(j<right.length){
            nums[k++] = right[j++];
        }
    }

    public int minMoves2(int[] nums) {
        int len = nums.length;
        int median;
        mergeSort(nums);
        if(len%2==0) median = (nums[len/2]+nums[(len-1)/2])/2;
        else median = nums[len/2];
        int minMoves = 0;
        for(int i=0;i<len;i++){
          minMoves += Math.abs(median-nums[i]);
        }
        return minMoves;
    }
}
