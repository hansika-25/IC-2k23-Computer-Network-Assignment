# LeetCode 1971 - Find if Path Exists in Graph

## Problem Statement

Given an undirected graph with `n` nodes and a list of edges, determine whether there is a valid path from the `source` node to the `destination` node.

## Approach

We use Breadth-First Search (BFS) to explore the graph.

First, we create an adjacency list to represent the graph.

Then, we start BFS from the source node and visit all connected nodes.

If the destination node is reached, we return `true`.

If BFS finishes without reaching the destination, we return `false`.

## Algorithm

1. Create an adjacency list for all nodes.
2. Add each edge in both directions because the graph is undirected.
3. Create a `visited` array.
4. Add the source node to a queue.
5. Remove a node from the queue.
6. If it is the destination, return `true`.
7. Visit all its unvisited neighbors.
8. If the queue becomes empty, return `false`.

## Time Complexity

O(V + E)

## Space Complexity

O(V + E)

## Sample Input

```text
n = 3
edges = [[0,1],[1,2]]
source = 0
destination = 2