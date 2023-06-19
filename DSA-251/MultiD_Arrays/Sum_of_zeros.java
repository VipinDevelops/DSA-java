import java.util.ArrayList;

public class Solution {
    public static int coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {
        int countAll = 0; // track of total coverage
        int rows = mat.size(); // store number of row
        int cols = mat.get(0).size(); // store number of cols

        for (int i = 0; i < rows; i++) { //itrate to row
            for (int j = 0; j < cols; j++) {// itrate to cols
                if (mat.get(i).get(j) == 0) { // if we find zero
                    countAll += count(mat, i, j, rows, cols); // use count method with current row and cols indecis 
                }
            }
        }
        return countAll;
    }
// The count method takes the matrix (mat), the current row and column indices (row and col), and the total number of rows and columns (rows and cols) as input.
    public static int count(ArrayList<ArrayList<Integer>> mat, int row, int col, int rows, int cols) {
        int count = 0;
        
        // Check top cell
        if (row > 0 && mat.get(row - 1).get(col) == 1) {
            count++;
        }
        
        // Check bottom cell
        if (row < rows - 1 && mat.get(row + 1).get(col) == 1) {
            count++;
        }
        
        // Check left cell
        if (col > 0 && mat.get(row).get(col - 1) == 1) {
            count++;
        }
        
        // Check right cell
        if (col < cols - 1 && mat.get(row).get(col + 1) == 1) {
            count++;
        }
        
        return count;
    }
}
