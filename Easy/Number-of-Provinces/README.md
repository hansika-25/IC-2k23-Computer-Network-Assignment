# LeetCode 547 - Number of Provinces

## Problem Statement

There are `n` cities. Some cities are directly connected to each other.

A province is a group of directly or indirectly connected cities.

Given an `n x n` matrix `isConnected`, find the total number of provinces.

## Approach

We use Depth-First Search (DFS).

We maintain a `visited` array to keep track of cities that have already been visited.

For every unvisited city, we start a DFS. This DFS visits all cities belonging to the same province.

Every time we start DFS from an unvisited city, we have found a new province.

## Algorithm

1. Create a `visited` array of size `n`.
2. Initialize the number of provinces to `0`.
3. Traverse all cities.
4. If a city has not been visited:
   - Increment the province count.
   - Perform DFS from that city.
5. During DFS, mark the current city as visited.
6. Visit every connected and unvisited city.
7. Return the total number of provinces.

## Time Complexity

O(N²)

## Space Complexity

O(N)

## Sample Input

```text
isConnected = [[1,1,0],
               [1,1,0],
               [0,0,1]]