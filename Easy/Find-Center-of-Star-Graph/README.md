# LeetCode 1791 - Find Center of Star Graph

## Problem Statement

Given the edges of a star graph, find the center node of the graph.

A star graph consists of one center node connected to all other nodes.

## Approach

We only need to examine the first two edges.

Since both edges are connected to the center node, the common node between them must be the center.

For example:

edges = [[1,2], [2,3], [2,4]]

The common node between the first two edges is 2.

Therefore, the center is 2.

## Algorithm

1. Take the first two edges.
2. Compare their nodes.
3. If `edges[0][0]` is present in the second edge, return it.
4. Otherwise, return `edges[0][1]`.

## Time Complexity

O(1)

## Space Complexity

O(1)

## Sample Input

```text
edges = [[1,2],[2,3],[4,2]]