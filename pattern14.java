// 1. You are given a number n.
// 2. You've to write code to print it's multiplication table up to 10 in format given below.

// Constraints
// 1 <= n <= 10

// Format
// Input
// A number x

// Output
// 3 * 1 = 3
// 3 * 2 = 6
// 3 * 3 = 9
// 3 * 4 = 12
// 3 * 5 = 15
// 3 * 6 = 18
// 3 * 7 = 21
// 3 * 8 = 24
// 3 * 9 = 27
// 3 * 10 = 30






import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
       int n=scn.nextInt();
           for(int j=1;j<=10;j++){
                          int result=n*j;

               System.out.println(n +" * "+j+ " = "+result);
           }
    
    }
}
