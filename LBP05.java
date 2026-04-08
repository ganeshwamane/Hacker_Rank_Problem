/*
Implement a program that takes a number as an argument, increments the number by +1 and returns the result.

Input Format

An integer value from the user.

Constraints

n>=0

Output Format

An incremented integer value

Sample Input 0

10
Sample Output 0

11
Sample Input 1

5
Sample Output 1

6
*/

package com.demo;

import java.util.Scanner;

public class LBP05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int result = n + 1;

		System.out.println(result);

	}
}