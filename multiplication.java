// Any Base Multiplication
// Easy

// 1. You are given a base b.
// 2. You are given two numbers n1 and n2 of base b.
// 3. You are required to multiply n1 and n2 and print the value.

// Constraints
// 2 <= b <= 10
// 0 <= n1 <= 10000
// 0 <= n2 <= 10000

// Format
// Input
// A base b
// A number n1
// A number n2

// Output
// A number of base b equal in value to n2 * n1.

// Example
// Sample Input

// 5
// 1220
// 31

// Sample Output
// 43320


import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
    

 }

 public static int getProduct(int b, int n1, int n2){
    //  write your code here
int rv= 0;
int p=1;
int c=0;
while(n2>0){

  int d2=n2%10;
  n2=n2/10;

  int digitproduct=sdproduct(b, n1, d2);

  rv =getsum(b, rv, digitproduct*p);
  p =p*10;
}


return  rv;

 }
public static int sdproduct(int b,int n1,int d2){
  int rv= 0;
  int c=0;
int p =1;
while(n1>0 || c>0){
  int d1 =n1%10;
  n1=n1/10;

  int d=d1*d2+c;
  c =d/b;
  d=d%b;

  rv +=d*p;
  p =p*10;

}

  return rv;
}


 public static int getsum(int b,int n1,int n2){
   int rv=0;
int c=0;
int p=1;
while(n1>0 ||n2>0 ||c>0){
  int num1=n1%10;
  int num2=n2%10;
  n1=n1/10;
  n2=n2/10;

  int d=num1+num2+c;
  d=d%b;
 c =d/b;
  rv +=d*p;
  p=p*10;
}

   return rv;
 }
}
