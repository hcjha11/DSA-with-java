// 1. You are given a number n.
// 2. You've to create a pattern of * and separated by tab as shown in output format.

// Constraints
// 1 <= n <= 100
//  Also, n is odd.

// Format
// Input
// A number n

// Output
//     *	
// 	*	*	*	
// *	*	*	*	*	
// 	*	*	*	
// 		*	


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int sp=n/2;
        int st=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                sp--;
                st+=2;
            }
            else{
              sp++;
              st -=2;
            }
            System.out.println();
        }

    }
}
