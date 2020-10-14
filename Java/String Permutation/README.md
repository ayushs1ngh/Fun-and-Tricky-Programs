Problem: Given a string str, the task is to print all the permutations of str. A permutation is an arrangement of all or part of a set of objects, with regard to the order of the arrangement. For instance, the words ‘bat’ and ‘tab’ represents two distinct permutation (or arrangements) of a similar three letter word.

Approach: Write a recursive function that print distinct permutations. Make a boolean array of size ’26’ which accounts the character being used. If the character has not been used then the recursive call will take place. Otherwise, don’t make any call. Terminating condition will be when the passed string is empty.

Examples:

Input: 
```java
str = “cd”
Output: cd dc
```

Input: 
```java
str = “123”
Output: 123 132 213 231 312 321
```
