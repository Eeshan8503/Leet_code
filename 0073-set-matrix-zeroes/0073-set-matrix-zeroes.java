class Solution {
    public void setZeroes(int[][] matrix) {
        boolean defaultZ[][]=new boolean[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    defaultZ[i][j]=true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0 && defaultZ[i][j]){
                    setCol(matrix,i,j);
                    setRow(matrix,i,j);
                    // break;
                }
            }
        }

    }
    public void setCol(int[][] matrix,int r,int c){
        for(int i=0;i<matrix.length;i++){
            matrix[i][c]=0;
        }
    }
    public void setRow(int[][] matrix,int r,int c){
        for(int i=0;i<matrix[0].length;i++){
            matrix[r][i]=0;
        }
    }
}