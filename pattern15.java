// Pattern 15
// Easy

// 1. You are given a number n.
// 2. You've to write code to print the pattern given in output format below.

// Constraints
// 1 <= n <= 10
//  Also, n is odd.

// Format
// Input
// A number n

// Output
//     1	
// 	2	3	2	
// 3	4	5	4	3	
// 	2	3	2	
// 		1	



import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int sp = n / 2;
        int st = 1;
        int val = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            int cvl = val;
            for (int j = 1; j <= st; j++) {
                System.out.print( cvl+ "\t");
                if(j <= st/2){
                    cvl++;
                }else{
                    cvl--;
                }
            }
                if (i <= n / 2) {
                    sp--;
                    st += 2;
                    val++;

                } else {
                    sp++;
                    st -= 2;
                   val--;
                }

            
            System.out.println();

        }
        
    }
}
