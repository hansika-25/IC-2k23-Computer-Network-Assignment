# LeetCode 733 - Flood Fill

## Problem Statement

Given an image represented by a 2D array of integers, perform a flood fill starting from a given pixel.

The starting pixel is represented by `sr` and `sc`.

Change the color of the starting pixel and all connected pixels having the same original color to the given new color.

## Approach

We use Depth-First Search (DFS).

First, we store the original color of the starting pixel.

Then, we change the starting pixel and recursively visit its four neighboring pixels:

- Up
- Down
- Left
- Right

Only pixels having the original color are changed.

If the original color and the new color are the same, no operation is required.

## Algorithm

1. Store the original color of the starting pixel.
2. If the original color is the same as the new color, return the image.
3. Start DFS from the starting pixel.
4. Check whether the current pixel is within the image boundaries.
5. Check whether its color matches the original color.
6. Change its color to the new color.
7. Recursively visit the four neighboring pixels.
8. Return the modified image.

## Time Complexity

O(R × C)

## Space Complexity

O(R × C)

## Sample Input

```text
image = [[1,1,1],
         [1,1,0],
         [1,0,1]]

sr = 1
sc = 1
color = 2