/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author ASUS
 */
public class MathUtil {
//cc
    /**
     * @param args the command line arguments
     */
    public static long getFactorial(int n) {
        if(n<0 || n > 21) {
            throw new IllegalArgumentException("Invalid Argement. N must be between 0 and 20");
        }
        if(n==0 || n==1) {
            return 1;
        }
        long product = 1;
        for(int i = 2; i <=n; i++) {
            product *= i;
            
        }
        return product;
          
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
