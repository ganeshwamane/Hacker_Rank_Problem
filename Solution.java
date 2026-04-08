/*
Question:
Implement a program to check whether the given number is even number or odd number.

Input Format:
An integer value

Constraints:
n >= 0

Output Format:
even or odd or invalid

Sample Input 0:
12
Sample Output 0:
even

Sample Input 1:
13
Sample Output 1:
odd

Sample Input 2:
-12
Sample Output 2:
invalid
*/

package com.demo;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("invalid");
		} else if (num % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	}
}