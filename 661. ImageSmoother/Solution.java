class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;
                int totalSum = 0;
                // 3x3 grid me uper left se niche right tk.
                for(int row=i-1;row<=i+1;row++){
                    for(int col = j-1;col<=j+1;col++){
                        if(row<0 || row>m-1 || col<0 || col>n-1) 
                        continue; // validates if i m in the right grid, and if not skips
                        totalSum += img[row][col];
                        count++;
                    }
                }
                ans[i][j]= (totalSum/count);
            }
        }
        return ans;
    }
}

