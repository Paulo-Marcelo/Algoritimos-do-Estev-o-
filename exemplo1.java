/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juniorredes;

import java.util.Random;

public class exemplo1 {
    public static void main(String[] args) {
        int matriz [][]=new int [5][4];
        Random num= new Random();
        System.out.println("Digite os numeros para a matriz");
        int valor = num.nextInt();
        System.out.println("Linha:"+matriz.length);
        System.out.println("Coluna:"+matriz[0].length);
        
        for (int L = 0; L < matriz.length; L++) {
            for (int C = 0; C < matriz[0].length; C++) {
                matriz[L][C]= valor;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println(matriz[i][j]+"\t");
            }
        }
        System.out.print(" ");
    }
}
