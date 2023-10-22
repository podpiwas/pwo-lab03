/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo;

/**
 *
 * @author alexm
 */
public class LucasGenerator {
    public static void main(String[] args) {
        int n = 10;
        printLucasRzad(n);
    }

    public static void printLucasRzad(int n) {
        long a = 2;
        long b = 1;

        System.out.println("Rząd:");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }
    }
}