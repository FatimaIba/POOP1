/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramideasteriscos;

import java.util.Scanner;

/**
 *
 * @author fatii
 */
public class Piramide2 {

    public Piramide2() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Cuantas lineas quiere: ");
        numero = sc.nextInt();
        for (int i = 0; i < numero; i++) {
            for (int j =numero -1; j >i; j--){
                System.out.print(" ");
            }
            for (int f = 0; f <=(i*2); f++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
