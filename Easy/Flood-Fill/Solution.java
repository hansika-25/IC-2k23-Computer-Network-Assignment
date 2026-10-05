class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int originalColor = image[sr][sc];

        // If the color is already the same, no change is needed
        if (originalColor == color) {
            return image;
        }

        dfs(image, sr, sc, originalColor, color);

        return image;
    }

    private void dfs(int[][] image, int row, int col,
                     int originalColor, int newColor) {

        // Check boundaries
        if (row < 0 || row >= image.length ||
            col < 0 || col >= image[0].length) {
            return;
        }

        // Stop if the current pixel has a different color
        if (image[row][col] != originalColor) {
            return;
        }

        // Change the color
        image[row][col] = newColor;

        // Visit four neighboring pixels
        dfs(image, row - 1, col, originalColor, newColor); // Up
        dfs(image, row + 1, col, originalColor, newColor); // Down
        dfs(image, row, col - 1, originalColor, newColor); // Left
        dfs(image, row, col + 1, originalColor, newColor); // Right
    }
}