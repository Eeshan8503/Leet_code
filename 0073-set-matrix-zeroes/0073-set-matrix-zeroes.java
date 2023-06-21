class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstrow=false,firstcol=false;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    if(i==0)
                        firstrow=true;
                    if(j==0)
                        firstcol=true;
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(firstrow){
            for(int i=0;i<matrix[0].length;i++){
                matrix[0][i]=0;
            }
        }
        if(firstcol){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }
        
        
        
        
        
    }
    public void zeroer(int matrix[][],int r,int c){
        for(int i=0;i<matrix[0].length;i++){
            matrix[r][i]=0;
        }
        for(int i=0;i<matrix.length;i++){
            matrix[i][c]=0;
        }
    }
}