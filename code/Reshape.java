public class Reshape {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int [][]result=new int[r][c];
        int row=0,col=0;
        if((nums.length*nums[0].length)==(r*c))
        {
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums[0].length;j++)
                {
                    result[row][col]=nums[i][j];
                    col++;
                    if(col==c){
                        col=0;
                        row++;
                    }
                }
            }
        }
        else{
            return nums;
        }
        return result;
    }
}