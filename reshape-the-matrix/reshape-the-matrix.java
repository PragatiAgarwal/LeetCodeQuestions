class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int p = mat.length;
        int q = mat[0].length;
        int[][] resultMat = new int[r][c];
        
        if(p*q == r*c){
            ArrayList<Integer> l = new ArrayList<Integer>();
            for(int i = 0; i<p; i++){
                for(int j = 0; j<q; j++){
                    l.add(mat[i][j]);
                }
             } 
            int k = 0;
            for(int i = 0; i<r; i++){
                for(int j = 0; j<c; j++){
                    resultMat[i][j] = l.get(k++);
                }
            }
            return resultMat;
        }
        
    
            return mat;
    }
}