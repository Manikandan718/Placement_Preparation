class Solution {
    public void rotate(int[][] mat) 
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=i+1;j<mat[0].length;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            reverseRow(mat[i]);
        }
    }
    static void reverseRow(int[] row) {
        int left = 0, right = row.length - 1;
        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
}
