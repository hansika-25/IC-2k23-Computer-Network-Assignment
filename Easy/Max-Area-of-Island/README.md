# LeetCode 695 - Max Area of Island

## Problem Statement

You are given a 2D grid where `1` represents land and `0` represents water.

An island is a group of connected land cells.

Find the maximum area of any island in the grid.

Cells are connected horizontally or vertically.

## Approach

We use Depth-First Search (DFS).

We traverse every cell in the grid.

Whenever we find an unvisited land cell (`1`), we start DFS and calculate the area of that island.

The DFS counts the current cell and all connected land cells.

We keep track of the maximum area found.

Visited cells are changed from `1` to `0`.

## Algorithm

1. Initialize `maxArea` to `0`.
2. Traverse every cell of the grid.
3. If the current cell is land:
   - Start DFS.
   - Calculate the area of the island.
4. Update `maxArea` with the maximum area.
5. Return `maxArea`.

During DFS:

1. Check whether the cell is inside the grid.
2. If it is water or already visited, return `0`.
3. Mark the cell as visited.
4. Count the current cell as `1`.
5. Recursively visit the four neighboring cells.
6. Return the total area.

## Time Complexity

O(R × C)

## Space Complexity

O(R × C)

## Sample Input

```text
grid = [
  [0,0,1,0,0,0],
  [0,0,1,0,0,0],
  [0,1,1,0,0,0],
  [0,0,0,0,1,1]
]