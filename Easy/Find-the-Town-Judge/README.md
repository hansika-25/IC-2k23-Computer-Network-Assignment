# LeetCode 997 - Find the Town Judge

## Problem Statement

In a town, there are `n` people labeled from `1` to `n`.

A town judge is a person who:

1. Does not trust anybody.
2. Is trusted by everybody else.
3. There is exactly one person who satisfies these conditions.

Given the trust relationships, find the town judge.

If there is no town judge, return `-1`.

## Approach

We use an array called `score`.

For every trust relationship `[a, b]`:

- Person `a` trusts someone, so their score is decreased by `1`.
- Person `b` is trusted by someone, so their score is increased by `1`.

The town judge must be trusted by all other `n - 1` people and must trust nobody.

Therefore, the judge will have a score of `n - 1`.

## Algorithm

1. Create a score array of size `n + 1`.
2. Traverse every trust relationship.
3. Decrease the score of the person who trusts.
4. Increase the score of the person being trusted.
5. Traverse all people.
6. If a person's score is `n - 1`, return that person's number.
7. If no such person exists, return `-1`.

## Time Complexity

O(N + T)

## Space Complexity

O(N)

## Sample Input

```text
n = 3
trust = [[1,3],[2,3]]