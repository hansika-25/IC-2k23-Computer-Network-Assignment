# LeetCode 690 - Employee Importance

## Problem Statement

You are given information about employees in a company.

Each employee has:

- An employee ID
- An importance value
- A list of subordinate employee IDs

Given the ID of an employee, calculate the total importance of that employee and all of their direct and indirect subordinates.

## Approach

We use Depth-First Search (DFS).

First, we store all employees in a HashMap using their employee ID as the key.

Then, starting from the given employee ID, we calculate:

- The importance of the current employee.
- The importance of all of their subordinates.

The DFS continues recursively until all subordinates have been processed.

## Algorithm

1. Create a HashMap to store employees by their ID.
2. Insert every employee into the HashMap.
3. Start DFS from the given employee ID.
4. Get the employee from the HashMap.
5. Add the employee's importance.
6. Recursively calculate the importance of all subordinates.
7. Return the total importance.

## Time Complexity

O(N)

## Space Complexity

O(N)

## Sample Input

```text
employees = [
    [1, 5, [2, 3]],
    [2, 3, []],
    [3, 2, []]
]

id = 1