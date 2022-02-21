// Rotate An Array
// Easy

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are given a number k.
// 4. Rotate the array a, k times to the right (for positive values of k), and to
// the left for negative values of k.

// Constraints
// 0 <= n < 10^4
// -10^9 <= a[i], k <= 10^9

// Format
// Input
// Input is managed for you

// Output
// Output is managed for you

// Example
// Sample Input

// 5
// 1
// 2
// 3
// 4
// 5
// 3

// Sample Output
// 3 4 5 1 2

import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
public static void reverse(int[] a, int li,int ri){

    // write your code here

  
    
while(li<ri){
    int temp=a[li];
    a[li]=a[ri];
   a[ri]=temp;

    li++;
    ri--;
}

  }
  public static void rotate(int[] a, int k){
k =k%a.length;
if(k<0){
k =k+a.length;
}
    // write your code here
// rotate 1
reverse(a,0,a.length-k-1);

// rotate 2

reverse(a,a.length-k,a.length-1);


// rotate 3
reverse(a,0,a.length-1);

  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}
