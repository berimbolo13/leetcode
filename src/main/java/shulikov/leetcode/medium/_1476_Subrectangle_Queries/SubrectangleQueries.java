package shulikov.leetcode.medium._1476_Subrectangle_Queries;

/**
 * Implement the class SubrectangleQueries which receives a rows x cols rectangle as a matrix of integers in the constructor and supports two methods:
 * <p>
 * 1. updateSubrectangle(int row1, int col1, int row2, int col2, int newValue)
 * <p>
 * Updates all values with newValue in the subrectangle whose upper left coordinate is (row1,col1) and bottom right coordinate is (row2,col2).
 * <p>
 * 2. getValue(int row, int col)
 * <p>
 * Returns the current value of the coordinate (row,col) from the rectangle.
 *
 * TODO Improve runtime
 */
class SubrectangleQueries {

    private final int[][] matrix;

    public SubrectangleQueries(int[][] rectangle) {
        matrix = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                matrix[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return matrix[row][col];
    }


    public void print() {
        for (int[] x : matrix) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
