class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        //Optimized
        int p = mat.length;
        int q = mat[0].length;
        int[][] resultMat = new int[r][c];
        
        if(p*q == r*c){
            int row = 0, col = 0;
            for(int i = 0; i<p; i++){
                for(int j = 0; j<q; j++){
                    resultMat[row][col++] = mat[i][j]; 
                    if(col == c){
                        row++;
                        col = 0;
                    }
                }
             } 
           
            return resultMat;
        }
        
    
            return mat;
    }
}