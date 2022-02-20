Bar Chart
Easy

1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print a bar chart representing value of arr a.

Constraints
1 <= n <= 30
0 <= n1, n2, .. n elements <= 10

Format
Input
A number n
n1
n2
.. n number of elements

Output
A bar chart of asteriks representing value of array a

Example
Sample Input

5
3
1
0
7
5

Sample Output
			*		
			*		
			*	*	
			*	*	
*			*	*	
*			*	*	
*	*		*	*	
  
  
  
  
  
  import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();

    int [] arr = new  int [n];
    for(int i =0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
      int max =arr[0];
      for(int i=1;i<arr.length;i++){
          if(arr[i]>max){
              max=arr[i];
          }
      }

      for(int floor=max;floor>=1;floor--){
          for(int i=0;i<arr.length;i++){
              if(arr[i]>=floor){
                  System.out.print("*\t");
              }else{
                                    System.out.print("\t");

              }
          }
          System.out.println();
      }
 }

}
