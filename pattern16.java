// Pattern 16
// Easy

//      1. You are given a number n.
//       2. You've to write code to print the pattern given in output format below
                                  
                                 
                                
                               
                               

// Constraints
// 1 <= n <= 10

// Format
// Input
// A number n

// Output
// 1												1	
// 1	2										2	1	
// 1	2	3								3	2	1	
// 1	2	3	4						4	3	2	1	
// 1	2	3	4	5				5	4	3	2	1	
// 1	2	3	4	5	6		6	5	4	3	2	1	
// 1	2	3	4	5	6	7	6	5	4	3	2	1



import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n=scn.nextInt();
    int sp=2*n-3;
    int st=1;
   

    for(int i=1;i<=n;i++){
        int val =1;
        for(int j=1;j<=st;j++){
            System.out.print(val+"\t");
        val++;

        }

        for(int j=1;j<=sp;j++){
            System.out.print("\t");
        }
        if(i == n){
                st--;
                val--;}

        for(int j=1;j<=st;j++){
            val--;
            System.out.print(val+"\t");
            
        }
        
        
          st++;
          sp -=2;
          System.out.println();
    }

 }
}
