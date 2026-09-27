# LeetCode 841 - Keys and Rooms

## Problem Statement

There are `n` rooms labeled from `0` to `n - 1`.

Room `0` is unlocked initially. Each room may contain keys to other rooms.

A key with value `i` can be used to unlock room `i`.

Determine whether all rooms can be visited.

## Approach

We use Depth-First Search (DFS).

We start from room `0` because it is initially unlocked.

Whenever we enter a room, we mark it as visited and use all the keys inside that room to visit other rooms.

After DFS is complete, we check whether every room has been visited.

If every room is visited, return `true`; otherwise, return `false`.

## Algorithm

1. Create a `visited` array.
2. Start DFS from room `0`.
3. Mark the current room as visited.
4. Visit every room for which we have a key.
5. After DFS, check all rooms.
6. Return `true` if every room was visited.
7. Otherwise, return `false`.

## Time Complexity

O(N + K)

## Space Complexity

O(N)

## Sample Input

```text
rooms = [[1], [2], [3], []]