/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author ADMIN
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       long result = MathUtil.getFactorial(5);
        System.out.println("expected: 5! = 120; actual: "  + result);
        
        System.out.println("expected: 6! = 720; actual: " +MathUtil.getFactorial(6));
     // thêm code sau khi up len server 8:04 10/5/2024
        System.out.println("expected: 1! = 1; actual: " +MathUtil.getFactorial(1));
        System.out.println("expected: 3! = 6; actual: " +MathUtil.getFactorial(3));
    }  
}
