class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat[0].length*mat.length!=r*c){
            return mat;
        }
        int rr=0;
        int cc=0;
        int k=-1;
        int ans[][]=new int[r][c];
        // System.out.println(1%0);
        for(int i=0;i<mat.length;i++){
                rr=rr%r;
            for(int j=0;j<mat[0].length;j++){
               cc=cc%c;
               System.out.println(rr+"\t"+cc);
               ans[rr][cc]=mat[i][j];
               cc+=1;
               if(cc==c){
                   rr+=1;
                   rr=rr%r;
               }
            }
           
        }
        return ans;
    }
}