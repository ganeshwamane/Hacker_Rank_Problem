/*
Implement a program to calculate sum of digits present in the given number.

Input Format

A number from the user

Constraints

Number>0

Output Format

print sum of digits

Sample Input 0

123
Sample Output 0

6
Sample Input 1

1200
Sample Output 1

3
Sample Input 2

100
Sample Output 2

1
Sample Input 3

195
Sample Output 3

15
*/

package com.demo;

import java.util.Scanner;

public class LBP07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int d;

		while (num > 0) {
			d = num % 10;
			System.out.print(d + " ");
			num = num / 10;
		}

	}

}
