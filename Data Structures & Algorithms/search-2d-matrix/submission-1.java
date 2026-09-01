class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        int mid = 0;

        while (left <= right) {
            if (left == right) {
                mid = right;
                break;
            }

            mid = (left + right) / 2;

            if (matrix[mid][0] == target) {
                return true;
            } else if (matrix[mid][0] < target && matrix[mid+1][0] > target) {
                break;
            } else if (matrix[mid][0] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        left = 0;
        right = matrix[mid].length - 1;
        int i = mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (matrix[i][mid] == target) {
                return true;
            } else if (matrix[i][mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;        
    }
}
