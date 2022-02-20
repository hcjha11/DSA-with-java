// Span Of Array
// Easy

// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.

// Constraints
// 1 <= n <= 10^4
// 0 <= n1, n2
//  .. n elements <= 10 ^9

// Format
// Input
// A number n
// n1
// n2
// .. n number of elements

// Output
// A number representing max - min

// Example
// Sample Input

// 6
// 15
// 30
// 40
// 4
// 11
// 9

// Sample Output
// 36

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int n=sc.nextInt();

int [] arr=new int[n];

for(int i=0;i<arr.length;i++){
   arr[i]=sc.nextInt();

     }
    int max=arr[0];
    int min =arr[0];

    for(int i=1;i<arr.length;i++){
        if(arr[i]>max){
            max =arr[i];
        }
        if(arr[i]<min){
            min= arr[i];
        }
    }

    int spam =max-min;
    System.out.print(spam);

   }
}
