// Sum Of Two Arrays
// Easy

// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. The two arrays represent digits of two numbers.
// 6. You are required to add the numbers represented by two arrays and print the
// arrays.

// Constraints
// 1 <= n1, n2 <= 100
// 0 <= a1[i], a2[i] < 10

// Format
// Input
// A number n1
// n1 number of elements line separated
// A number n2
// n2 number of elements line separated

// Output
// A number representing sum of two numbers, represented by two arrays.

// Example
// Sample Input

// 5
// 3
// 1
// 0
// 7
// 5
// 6
// 1
// 1
// 1
// 1
// 1
// 1

// Sample Output
// 1
// 4
// 2
// 1
// 8
// 6

import java.io.*;
import java.util.*;

public class Main{




public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc =new Scanner(System.in);
    int n1=sc.nextInt();

int [] a1 = new  int [n1];
    for(int i =0;i<a1.length;i++){
        a1[i]=sc.nextInt();
    }


int n2=sc.nextInt();

int [] a2 = new  int [n2];
    for(int i =0;i<a2.length;i++){
        a2[i]=sc.nextInt();
    }
int[] sum = new int[n1>n2? n1: n2];

 int c=0;
 int i=a1.length-1;
 int j = a2.length-1;
int k=sum.length-1;

while(k>=0){
    int d=c;
    if(i>=0){
        d +=a1[i];
    }
    if(j>=0){
        d +=a2[j];
    }
    c =d/10;
    d=d%10;

    sum[k]=d;

    i--;j--;k--;

}
if(c !=0){
    System.out.println(c);
}
for(int val:sum){
        System.out.println(val);

}

 }
 



}
