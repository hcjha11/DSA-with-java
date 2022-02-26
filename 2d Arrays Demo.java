2d Arrays Demo
Easy

1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to display the contents of 2d array as suggested by output format below.

Constraints
1 <= n <= 10^2
1 <= m <= 10^2
-10^9 <= e1, e2, .. n * m elements <= 10^9

Format
Input
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements

Output
e11 e12 e13 ..
e21 e22 e23 ..

Example
Sample Input

2
4
11
12
13
14
21
22
23
24

Sample Output
11 12 13 14
21 22 23 24

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();

    int [][] arr=new int[n][m];

    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        arr[i][j]=sc.nextInt();
      }
    }

    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
   }
  }
  }
