class Solution {

    public int maxAreaOfIsland(int[][] grid) {

        int maxArea = 0;

        for (int row = 0; row < grid.length; row++) {

            for (int col = 0; col < grid[0].length; col++) {

                if (grid[row][col] == 1) {

                    int area = dfs(grid, row, col);

                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

    private int dfs(int[][] grid, int row, int col) {

        // Check boundaries
        if (row < 0 || row >= grid.length ||
            col < 0 || col >= grid[0].length) {
            return 0;
        }

        // Stop if water or already visited
        if (grid[row][col] == 0) {
            return 0;
        }

        // Mark as visited
        grid[row][col] = 0;

        // Count current cell + connected land
        int area = 1;

        area += dfs(grid, row - 1, col); // Up
        area += dfs(grid, row + 1, col); // Down
        area += dfs(grid, row, col - 1); // Left
        area += dfs(grid, row, col + 1); // Right

        return area;
    }
}