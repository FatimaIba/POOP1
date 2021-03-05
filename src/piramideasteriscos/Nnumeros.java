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
public class Nnumeros {

    public Nnumeros() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=Integer.parseInt(sc.nextLine());
        int[] Valor = new int[N];
        System.out.print("Cuantos numeros deseas capturar: ");
        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el numero a evaluar:");
            Valor[i] = sc.nextInt();
        }
        for (int i = 0; i < N - 1; i++) {
            for (int k = 0; k < N - 1; k++) {
                if (Valor[k] > Valor[k + 1]) {
                    int A;
                    A = Valor[k];
                    Valor[k] = Valor[k + 1];
                    Valor[k + 1] = A;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(Valor[i] + " ");
        }
    }
}
