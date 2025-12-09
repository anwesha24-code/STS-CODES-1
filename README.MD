# 🚀 STS Algorithm & Problem Collection

Welcome to my **STS Algorithm & Problem Collection** repository!  

This repository contains **easy / brute-force implementations** of popular algorithms and problems in **Java**. Each file is named according to the algorithm or problem it implements.  

> If you find this repo helpful, please ⭐ **star this repo** for easy reference!

---

## 🏷️ Features

- ✅ Implemented in **Java**
- 🧠 Focused on **easy / brute-force methods** for understanding core logic
- 📚 Ideal for **learning, teaching, and competitive programming**
- 📂 File names correspond directly to the **algorithm/problem implemented**
- ⚠️ **Note:** These implementations prioritize **simplicity and clarity** over extreme performance

---

## 📊 Table of Contents / Complexity Overview

| #  | Algorithm / Problem                     | Brute-Force TC          | Optimized TC              | Space       | Notes                                      |
|----|------------------------------------------|--------------------------|---------------------------|-------------|---------------------------------------------|
| 1  | Euler Phi / Totient                      | O(n log n)               | O(n log log n)            | O(n)        | Count coprime numbers                      |
| 2  | Booth Algorithm                           | O(n²)                    | O(n)                      | O(n)        | Lexicographic minimal rotation              |
| 3  | Chinese Remainder Theorem (CRT)          | O(M·n)                   | O(n)                      | O(n)        | Solve system of congruences                 |
| 4  | Strobogrammatic Numbers                   | O(5ⁿ)                    | O(1) per number           | O(n)        | Mirror-digit numbers                        |
| 5  | Segmented Sieve                           | O(n log log n)           | Same                      | O(√n)       | Primes in range [L, R]                      |
| 6  | Simple/Incremental Sieve                  | O(n log log n)           | Same                      | O(n)        | Basic sieve                                 |
| 7  | Euclid GCD                                | O(min(a, b))             | O(log max(a, b))          | O(1)        | Fast gcd computation                        |
| 8  | Block Swap Array Rotation                 | O(n²)                    | O(n)                      | O(1)        | Rotate by blocks                            |
| 9  | Combinations (nCr)                        | O(n!/(r!(n−r)!))         | O(n·r)                    | O(r)        | DP/backtracking                             |
| 10 | Permutations                              | O(n!)                    | O(n!)                     | O(n)        | Generate all permutations                   |
| 11 | Max Equilibrium Sum                       | O(n²)                    | O(n)                      | O(1)        | Prefix–sum method                           |
| 12 | Max Product Subarray                      | O(n²)                    | O(n)                      | O(1)        | Track max/min product                       |
| 13 | Hourglass Max Sum                         | O(n²·m²)                 | O(n·m)                    | O(1)        | Sliding window sum                          |
| 14 | Binary Palindrome Check                   | O(n log n)               | O(log n)                  | O(log n)    | Bitwise palindrome                          |
| 15 | Manacher’s Algorithm                      | O(n²)                    | O(n)                      | O(n)        | Longest palindromic substring               |
| 16 | Paths in Grid (DP)                        | O(2^(m+n))               | O(m·n)                    | O(m·n)      | Count paths                                 |
| 17 | Longest 1s After Flip                     | O(n²)                    | O(n)                      | O(1)        | Sliding window                              |
| 18 | Selection Sort                            | O(n²)                    | O(n²)                     | O(1)        | Basic sorting                               |
| 19 | QuickSort                                  | O(n²)                    | O(n log n)                | O(log n)    | Average-case fast sort                      |
| 20 | Lexicographic Palindrome                  | O(n!·n)                  | O(n + alphabet)           | O(n)        | Smallest palindrome                         |
| 21 | Natural Sort (Numeric Strings)            | O(n log n)               | O(n log n)                | O(n)        | Sort strings numerically                    |
| 22 | Warnsdorff / Knight’s Tour                | O(8ⁿ)                    | O(n²)                     | O(n²)       | Knight move heuristic                       |
| 23 | Move Hyphens to Start                     | O(n)                     | O(n)                      | O(n)        | String rearrangement                        |
| 24 | Simple Sieve                               | O(n log log n)           | Same                      | O(n)        | Prime generation                            |
| 25 | Swap Two Nibbles                          | O(1)                     | O(1)                      | O(1)        | Bit manipulation                            |
| 26 | Karatsuba Multiplication                  | O(n²)                    | O(n^1.585)                | O(n)        | Fast multiplication                         |
| 27 | Weighted Substring / Max Sum              | O(n²)                    | O(n)                      | O(n)        | Sliding window / prefix sums                |
| 28 | Majority Element (Boyer–Moore Voting)     | O(n²)                    | O(n)                      | O(1)        | Majority vote algorithm                     |
| 29 | Maze Solving (Backtracking)               | O(2^(n·m))               | O(n·m)                    | O(n·m)      | Backtracking / DP                           |
| 30 | Leaders in Array                          | O(n²)                    | O(n)                      | O(1)        | Traverse from right                         |
| 31 | N-Queens                                   | O(n!)                    | O(n!) with pruning        | O(n²)       | Backtracking                                |
| 32 | Kruskal’s Algorithm                        | O(E log E)               | Same                      | O(V + E)    | MST using DSU                               |
| 33 | Prim’s Algorithm                           | O(V²)                    | O(E log V)                | O(V + E)    | PriorityQueue implementation                |
| 34 | Josephus Problem                           | O(n·k)                   | O(n)                      | O(n)        | Recurrence relation                         |
| 35 | DSU / Union-Find                           | O(n²) if naive           | O(α(n)) ≈ constant        | O(n)        | Path compression + union by rank            |
| 36 | Boyer–Moore String Search                 | O(n·m)                   | O(n + m)                  | O(m)        | Fast substring search                       |


---

## 🎯 Quick Highlights

- All codes are **short, easy-to-read, and beginner-friendly**.
- Optimized solutions exist for most algorithms, but these prioritize **clarity over speed**.
- Great for **teaching, learning, or practicing coding problems**.

---

Made with ❤️ by **Anwesha Pal** – **star this repo** ⭐ if it helped you!
