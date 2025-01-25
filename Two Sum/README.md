# Two Sum

## Problem Description
Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.

### Constraints:
- Each input will have exactly one solution.
- You may not use the same element twice.
- You can return the answer in any order.

### Examples:

#### Example 1:
**Input:**
```
nums = [2,7,11,15], target = 9
```
**Output:**
```
[0,1]
```
**Explanation:** Because `nums[0] + nums[1] == 9`, we return `[0, 1]`.

#### Example 2:
**Input:**
```
nums = [3,2,4], target = 6
```
**Output:**
```
[1,2]
```

#### Example 3:
**Input:**
```
nums = [3,3], target = 6
```
**Output:**
```
[0,1]
```

### Constraints:
- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- Only one valid answer exists.

## Approach
To solve this problem, we can use the following approaches:

1. **Brute Force:**
   - Use two nested loops to check all pairs of numbers in the array.
   - Time complexity: `O(n^2)`.

2. **Hash Map:**
   - Use a hash map to store the difference between the target and the current number.
   - Check if the complement exists in the hash map as we iterate through the array.
   - Time complexity: `O(n)`.


