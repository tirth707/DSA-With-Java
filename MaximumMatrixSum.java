class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long totalsum = 0;
        int minabs = Integer.MAX_VALUE;
        int negCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int val = matrix[i][j];
                int absVal = Math.abs(val);

                if (val < 0) {
                    negCount++;
                }

                totalsum += absVal;

                if (absVal < minabs) {
                    minabs = absVal;
                }
            }
        }

        if (negCount % 2 != 0) {
            return totalsum - (2L * minabs);
        }

        return totalsum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] exampleMatrix = {
            {1, -1},
            {-1, 1}
        };
        System.out.println("Maximum Matrix Sum: " + sol.maxMatrixSum(exampleMatrix));
    }
}