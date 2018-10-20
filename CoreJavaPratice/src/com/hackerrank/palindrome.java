package com.hackerrank;

import java.util.Scanner;

public class palindrome {


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        char[] arrayofchars = new char[A.length()];
        StringBuilder B = new StringBuilder();
        int n= A.length();
        
        
        for(int i=n-1;i>=0;i--)
        {
        B.append(A.charAt(i));
        
        }
        if (A.equals(B.toString()))
        {
        	System.out.println("Yes");
        }
        else
        {
        	System.out.println("No");
        }
        
        
        
    }

}
