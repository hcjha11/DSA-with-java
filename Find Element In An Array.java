Find Element In An Array
Easy

1.You are given a number n, representing the size of array a.
2.You are given n distinct numbers, representing elements of array a.
3. You are given another number d.
4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.

Constraints
1 <= n <= 10^7
-10^9 <= n1, n2 
.. n elements <= 10^9
-10^9 <= d <= 10^9

Format
Input
A number n
n1
n2
.. n number of elements
A number d

Output
A number representing index at which d is found in array a and -1 if not found

Example
Sample Input

6
15
30
40
4
11
9
40

Sample Output
2

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();

    int [] arr =new int[n];

    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int d=sc.nextInt();
      int iindenx =-1;
    for(int i=0;i<arr.length;i++){
        if(d==arr [i])
        {
            iindenx = i;
            break;
        }
      
    

        }
                System.out.print(iindenx);

    
 }

}