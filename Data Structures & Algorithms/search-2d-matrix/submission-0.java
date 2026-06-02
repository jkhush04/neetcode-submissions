class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            if (target <= matrix[i][n - 1]) {
                return binarySearch(matrix, i, target);
            }
        }
        return false;
    }

    public boolean binarySearch(int[][] matrix, int row, int target) {
        int low = 0, high = matrix[0].length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[row][mid] == target) return true;
            else if (target < matrix[row][mid]) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }
}
