package leetcode;

public class LC240 {

    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix==null || matrix.length==0 || matrix[0].length==0) {
            return  false;
        }
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        int r = rowLength-1;
        int c = 0;
        while (r>=0 && c < columnLength) {
            if (matrix[r][c] > target) {
                r--;
            } else if (matrix[r][c] < target) {
                c++;
            } else {
                return true;
            }
        }
        return false;
    }
}
