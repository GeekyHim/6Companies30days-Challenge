class Solution{
    //using merge sort to sort the array
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
    
    public void wiggleSort(int[] nums){
        mergeSort(nums);
        int [] sortedArray = nums.clone(); //clone to use for tangling it
        int mid = (nums.length-1)/2;
        int last = nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(i%2==0) nums[i] = sortedArray[mid--];
            else nums[i] = sortedArray[last--];
        }  
    } 


}