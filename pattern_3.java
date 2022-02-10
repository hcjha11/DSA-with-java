// 1. You are given a number n.
// 2. You've to create a pattern of * and separated by tab as shown in output format.

// Constraints
// 1 <= n <= 10

// Format
// Input
// A number n

// Output
//              *	
// 			*	*	
// 		*	*	*	
// 	*	*	*	*	
// *	*	*	*	*	


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nsp = n - 1;
        int nst = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nsp; j++) {
                System.out.print("\t");
            }

            for (int j = 0; j < nst; j++) {
                System.out.print("*\t");
            }

            nsp--;
            nst++;
            System.out.println();
        }

    }
}
