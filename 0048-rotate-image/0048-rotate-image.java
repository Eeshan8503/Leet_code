class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        row_reverse(matrix);
    }
    public void transpose(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    public void row_reverse(int[][]matrix){
        int n=matrix[0].length;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<n/2;j++){
                // matrix[i][j]=matrix[i][n-j-1]^matrix[i][j];
                // matrix[i][n-1-j]=matrix[i][n-j-1]^matrix[i][j];
                // matrix[i][j]=matrix[i][n-j-1]^matrix[i][j];
                // swap(matrix[j],matrix[n-j])
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
                // System.out.print(matrix[i][j]);
            }
            // System.out.println();
        }
    }
}