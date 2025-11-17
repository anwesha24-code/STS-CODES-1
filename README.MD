# STS Algorithm & Problem Collection

Welcome to my **STS (Short / Teaching / Simple) Algorithm & Problem Collection** repository!  

This repository contains **easier/brute-force versions** of popular algorithms and problems, implemented in **Java**. Each file is named according to the algorithm or problem it implements. These codes are ideal for learning, understanding, or quickly testing concepts.

---

## Table of Contents / Complexity Overview

| # | Algorithm / Problem | Brute-Force TC | Optimized TC | Space | Notes |
|---|-------------------|----------------|--------------|-------|-------|
| 1 | Euler Phi / Totient | O(n log n) | O(n log log n) | O(n) | Count coprime numbers |
| 2 | Booth Algorithm | O(n²) | O(n) | O(n) | Lexicographic minimal rotation |
| 3 | Chinese Remainder Theorem (CRT) | O(M * n) | O(n) | O(n) | Solve x ≡ a[i] (mod m[i]) |
| 4 | Strobogrammatic | O(5ⁿ) | O(1) per number | O(n) | Generate strobogrammatic numbers |
| 5 | Segmented Sieve | O(n log log n) | Same | O(sqrt(n)) | Primes in range [L,R] |
| 6 | Incremental / Simple Sieve | O(n log log n) | Same | O(n) | Basic prime generation |
| 7 | Euclid (GCD) | O(min(a,b)) | O(log max(a,b)) | O(1) | Recursive or iterative |
| 8 | Block Swap / Array Rotation | O(n²) | O(n) | O(1) | Rotate array by blocks |
| 9 | Combinations | O(n! / (r!(n-r)!)) | O(n*r) | O(r) | Backtracking / DP |
| 10 | Permutations | O(n!) | O(n!) | O(n) | Recursive or iterative |
| 11 | Max Equilibrium Sum | O(n²) | O(n) | O(1) | Prefix sum optimization |
| 12 | Max Product Subarray | O(n²) | O(n) | O(1) | Track max/min product |
| 13 | Max Sum in Hourglass | O(n²*m²) | O(n*m) | O(1) | Sliding window sum |
| 14 | Binary Palindrome | O(n*log n) | O(log n) | O(log n) | Convert & check bits |
| 15 | Manacher Algorithm | O(n²) | O(n) | O(n) | Longest palindromic substring |
| 16 | Maneuvering / Paths in Grid | O(2^(m+n)) | O(m*n) | O(m*n) | Count paths |
| 17 | Longest Subsequence of 1 after Flip | O(n²) | O(n) | O(1) | Sliding window technique |
| 18 | Selection Sort | O(n²) | O(n²) | O(1) | Standard selection sort |
| 19 | QuickSort | O(n²) | O(n log n) | O(log n) | Average-case fast sorting |
| 20 | Lexicographic Palindrome | O(n!*n) | O(n + alphabet) | O(n) | Generate smallest palindrome |
| 21 | Natural Sort | O(n log n) | O(n log n) | O(n) | Sort strings numerically |
| 22 | Warnsdorff / Knight’s Tour | O(8^n) | O(n²) | O(n²) | Heuristic for knight moves |
| 23 | Move Hyphen to Beginning | O(n) | O(n) | O(n) | Count & reconstruct string |
| 24 | Simple Sieve | O(n log log n) | Same | O(n) | Prime numbers generation |
| 25 | Swap 2 Nibbles | O(1) | O(1) | O(1) | Bitwise manipulation |
| 26 | Karatsuba | O(n²) | O(n^1.585) | O(n) | Fast multiplication |
| 27 | Weighted Substring / Max Sum | O(n²) | O(n) | O(n) | Sliding window / prefix sum |
| 28 | Majority Element | O(n²) | O(n) | O(1) | Boyer-Moore Voting Algorithm |
| 29 | Maze Solving | O(2^(n*m)) | O(n*m) | O(n*m) | Backtracking / DP |
| 30 | Leaders in Array | O(n²) | O(n) | O(1) | Traverse from right |
| 31 | N Queens | O(n!) | O(n!) with pruning | O(n²) | Backtracking with safety check |
| 32 | Kruskal | O(E log E) | Same | O(V + E) | MST using Union-Find |
| 33 | Prims | O(V²) | O(E log V) | O(V + E) | MST using PriorityQueue |
| 34 | Josephus Problem | O(n*k) | O(n) | O(n) | Recursive formula |

---

## Features

- All codes are implemented in **Java**.
- Focused on **easier / brute-force methods** to understand the core logic.
- Can be used for **learning, teaching, or competitive programming practice**.
- Each file is named according to the algorithm/problem it implements.

---

> ⚠️ **Note:** These implementations prioritize **simplicity and clarity** over extreme performance. Optimized versions exist for most algorithms, but these are meant for **learning and teaching purposes**.

---

Feel free to **explore, learn, and contribute**!

