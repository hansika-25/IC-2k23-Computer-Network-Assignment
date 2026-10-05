# LeetCode 200 - Number of Islands

## Problem Statement

Given an `m x n` 2D grid containing `'1'` for land and `'0'` for water, find the number of islands.

An island is formed by connecting adjacent lands horizontally or vertically.

## Approach

We use Depth-First Search (DFS).

We traverse every cell in the grid.

Whenever we find a cell containing `'1'`, we have found a new island.

We increase the island count and perform DFS to visit all connected land cells.

Visited land cells are changed from `'1'` to `'0'`.

## Algorithm

1. Traverse every cell of the grid.
2. If the current cell contains `'1'`:
   - Increment the island count.
   - Start DFS from that cell.
3. During DFS:
   - Check the boundaries.
   - Stop if the cell is water or already visited.
   - Change the cell from `'1'` to `'0'`.
   - Visit the four neighboring cells.
4. Return the total island count.

## Time Complexity

O(R × C)

## Space Complexity

O(R × C)

## Sample Input

```text
grid = [
  ["1","1","0","0"],
  ["1","0","0","1"],
  ["0","0","1","1"]
]
