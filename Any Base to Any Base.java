// Any Base To Any Base
// Easy

// 1. You are given a number n.
// 2. You are given a base b1. n is a number on base b.
// 3. You are given another base b2.
// 4. You are required to convert the number n of base b1 to a number in base b2.

// Constraints
// 0 <= n <= 512
// 2 <= b1 <= 10
// 2 <= b2 <= 10

// Format
// Input
// A number n
// A base b1
// A base b2

// Output
// A number of base b2 equal in value to n of base b1.

// Example
// Sample Input

// 111001
// 2
// 3

// Sample Output
// 2010


import java.util.*;

public class Main{
        public static int getvalue(int n,int b1,int b2){

           int dec =anyBasetoDecimal(n, b1);
           int base=DectoanyBase(dec, b2);
      return base;

        }
      public static int DectoanyBase(int n,int b2){
        int rv =0;
          int  p=1;
          while(n>0){
            int num =n%b2;
            n = n/b2;

            rv +=num *p;
            p =p*10;
          }


        return rv;
      }

  public static int anyBasetoDecimal(int n,int b1){
      int rv= 0;
      int p =1;

      while(n>0){
        int num =n%10;
        n =n/10;

        rv += num *p;
        p =p*b1;

      }

    return rv;
  }

  public static void main(String[] args){
           Scanner sc= new Scanner(System.in);
           int n =sc.nextInt();
           int b1=sc.nextInt();
           int b2=sc.nextInt();
         int number =getvalue(n,b1,b2);
          System.out.print(number);
  }
}
