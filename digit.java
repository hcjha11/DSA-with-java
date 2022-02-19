// Digit Frequency
// Easy

// 1. You are given a number n.
// 2. You are given a digit d.
// 3. You are required to calculate the frequency of digit d in number n.

// Constraints
// 0 <= n <= 10^9
// 0 <= d <= 9
  

// Format
// Input
// A number n
// A digit d

// Output
// A number representing frequency of digit d in number n

// Example
// Sample Input

// 994543234
//  4

// Sample Output
// 3

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        // write code here
        int count = 0;
        while (n > 0) {
            int temp = n % 10;
            n = n / 10;
            if (temp == d) {
                count++;
            }

        }
        return count;
    }
    }
