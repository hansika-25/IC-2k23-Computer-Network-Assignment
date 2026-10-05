class Solution {

    public int numIslands(char[][] grid) {

        int islands = 0;

        for (int row = 0; row < grid.length; row++) {

            for (int col = 0; col < grid[0].length; col++) {

                if (grid[row][col] == '1') {

                    islands++;

                    dfs(grid, row, col);
                }
            }
        }

        return islands;
    }

    private void dfs(char[][] grid, int row, int col) {

        // Check boundaries
        if (row < 0 || row >= grid.length ||
            col < 0 || col >= grid[0].length) {
            return;
        }

        // Stop if this is water or already visited
        if (grid[row][col] != '1') {
            return;
        }

        // Mark land as visited
        grid[row][col] = '0';

        // Visit four directions
        dfs(grid, row - 1, col); // Up
        dfs(grid, row + 1, col); // Down
        dfs(grid, row, col - 1); // Left
        dfs(grid, row, col + 1); // Right
    }
}