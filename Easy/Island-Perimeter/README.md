# LeetCode 463 - Island Perimeter

## Problem Statement

You are given a 2D grid where `1` represents land and `0` represents water.

The grid contains one island.

Find the perimeter of the island.

Cells are connected horizontally and vertically.

## Approach

We examine every cell in the grid.

Whenever we find a land cell (`1`), we check its four sides:

- Top
- Bottom
- Left
- Right

If a side is outside the grid or touches water (`0`), that side contributes `1` to the perimeter.

We add all such sides to calculate the total perimeter.

## Algorithm

1. Initialize `perimeter` to `0`.
2. Traverse every cell of the grid.
3. If the cell contains land:
   - Check its top side.
   - Check its bottom side.
   - Check its left side.
   - Check its right side.
4. If any side is outside the grid or touches water, increase `perimeter`.
5. Return the total perimeter.

## Time Complexity

O(R × C)

## Space Complexity

O(1)

## Sample Input

```text
grid = [
  [0,1,0,0],
  [1,1,1,0],
  [0,1,0,0],
  [1,1,0,0]
]