/* Implement a program to calculate sum of even digits present in the given number.

Input Format

A number from the user

Constraints

Number>0

Output Format

Print sum of even digits

Sample Input 0

123
Sample Output 0

2
Sample Input 1

555
Sample Output 1

0
Sample Input 2

888
Sample Output 2

24
Sample Input 3

910
Sample Output 3

0
Sample Input 4

6
Sample Output 4

6 */


package com.demo;

import java.util.Scanner;

public class LBP09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum  =0;
		int d;
		while(num!=0) {
			d = num%10;
			if(num%2==0) {
				sum = sum+d;
			}
			num = num/10;
		}
		System.out.println(sum);
		
	}

}
