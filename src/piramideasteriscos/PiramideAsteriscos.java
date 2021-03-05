/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramideasteriscos;

import java.util.Scanner;

public class PiramideAsteriscos {

    public PiramideAsteriscos() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila;
        System.out.print("Ingresa cuantas filas quieres: ");
        fila = sc.nextInt();
        for (int i = 0; i <= fila; i++) {
            for (int j = 1; j <= fila - i; j++) {
                System.out.print("");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
