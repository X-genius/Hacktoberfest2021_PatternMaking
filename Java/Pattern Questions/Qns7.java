// Question No: 7

package com.java;

public class Qns7 {
    public static void main(String[] args) {
        int n = 5;
        Answer(n);
    }

    static void Answer(int n) {
       int nstar = n; //number of stars
       int nspace = 0; //numbers of space 
       
        //this for loop for every rows
       for(int i = 1; i <= n; i++)
       {
          //this for loop for every columns for the number of spaces
          for(int j = 1; j <= nspace; j++)
          {
              System.out.print(" ");
          }
             
          //this for loop for every column for the number of stars
          for(int j = 1; j <= nstar; j++)
          {
              System.out.print("*");
          }
          
          //Space increment and star decrement.
          nspace++;
          nstar--;
          System.out.println();
      }
    }
}

// output:
// *****
//  ****
//   ***
//    **
//     *
