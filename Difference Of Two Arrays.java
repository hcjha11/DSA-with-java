// Difference Of Two Arrays
// Easy

// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. The two arrays represent digits of two numbers.
// 6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1

// Assumption - number represented by a2 is greater.

// Constraints
// 1 <= n1, n2 <= 100
// 0 <= a1[i], a2[i] < 10
// number reresented by a1 is smaller than number represented by a2

// Format
// Input
// A number n1
// n1 number of elements line separated
// A number n2
// n2 number of elements line separated

// Output
// A number representing difference of two numbers (a2 - a1), represented by two arrays.

// Example
// Sample Input

// 3
// 2
// 6
// 7
// 4
// 1
// 0
// 0
// 0

// // Sample Output
// 7
// 3
// 3



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
int[] diff = new int[n2];

int i=a1.length-1;
int j=a2.length-1;
int k=diff.length-1;
int c=0;
while(k>=0){
     int d=0;
   int a1v =  i >= 0?a1[i]:0;

   if(a2[j]+c>=a1v){
       d =a2[j]+c - a1v;
       c=0;

   }else{
       d =a2[j]+c+10 - a1v;
       c=-1;

   }



diff[k]=d;
i--;
j--;
k--;
    
}
int idx =0;
while(idx <diff.length){
    if(diff[idx]==0){
        idx++;
    }else{
        break;

    }


}
while(idx <diff.length){
    System.out.println(diff[idx]);
    idx++;
}

 }

}
