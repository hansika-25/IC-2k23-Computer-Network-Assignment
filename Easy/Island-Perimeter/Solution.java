class Solution {

    public int islandPerimeter(int[][] grid) {

        int perimeter = 0;

        for (int row = 0; row < grid.length; row++) {

            for (int col = 0; col < grid[0].length; col++) {

                if (grid[row][col] == 1) {

                    // Top
                    if (row == 0 || grid[row - 1][col] == 0) {
                        perimeter++;
                    }

                    // Bottom
                    if (row == grid.length - 1 || grid[row + 1][col] == 0) {
                        perimeter++;
                    }

                    // Left
                    if (col == 0 || grid[row][col - 1] == 0) {
                        perimeter++;
                    }

                    // Right
                    if (col == grid[0].length - 1 || grid[row][col + 1] == 0) {
                        perimeter++;
                    }
                }
            }
        }

        return perimeter;
    }
}