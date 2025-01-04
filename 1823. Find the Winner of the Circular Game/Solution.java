class Solution {
    public void makeArray(int n, int[] arr){
        for (int i = 0; i < n; i++) {
            arr[i]=i+1;
        }       
    }

    public int findTheWinner(int n, int k) {
        int [] friends = new int[n];
        makeArray(n, friends);
        int removeIndex = 0;
        while(n>1){
            removeIndex =(removeIndex+k-1)%n;
            for(int i = removeIndex;i<n-1;i++){
                friends[i]=friends[i+1];
            }
            n--;
    }
    return friends[0];
    }
}
// i feel like circular linkedlist method would have made more sense.
// but this also gets the job done