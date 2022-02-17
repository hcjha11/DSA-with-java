Pattern 17
Easy

1. You are given a number n.
2. You've to write code to print the pattern given in output format below.

Constraints
1 <= n <= 10
 Also, n is odd.

Format
Input
A number n

Output
   *	
	 *	*	
*	*	*	*	*	
	 *	*	
	 *	
   import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int st = 1;
        int cen = n / 2 + 1;
        int sp = n/2;
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= sp; j++) {
                if(i == n/2+1){
                    System.out.print("*\t");

                }else{
                System.out.print("\t");
            }}

            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
                
            }
            if(i<=n/2){
                st++;
            }
            else{
                st--;
            }
            System.out.println();

        }
       
    }

}
