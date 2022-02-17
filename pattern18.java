 1. You are given a number n.
      2. You've to write code to print the pattern given in output format below
   
Constraints
1 <= n <= 10
 Also, n is odd.

Format
Input
A number n

Output
*	*	*	*	*	*	*	
	*				*	
		*		*	
			*	
		*	*	*	
	*	*	*	*	*	
*	*	*	*	*	*	*	
   import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int st = n;

        int sp = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {

                System.out.print("\t");

            }

            for (int j = 1; j <= st; j++) {
                if (i > 1 && i <=n / 2 && j > 1 && j < st) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }

            }

            if (i <= n / 2) {
                sp++;
                st -= 2;
                
               
            } else {
                sp--;
                st += 2;
            }
            System.out.println();

        }

    }

}
