/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shellsort;

import java.util.Scanner;

/**
 *
 * @author guada
 */
public class ShellSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese el numero de elementos:");
        int p = valor.nextInt();
        int [] a = new int [p];
        System.out.println("Ingrese Los valores del arreglo");
        for (int i = 0; i < p; i++) {
            a[i] = valor.nextInt();
        }
        System.out.println("--------------Salida de los Datos---------------");
        //llamadita del metodo
        shellSort (a);
        for (int i = 0; i < p; i++) {
            System.out.println(+a[1]);
            
        }
           
        }
    public static void shellSort(int [] matrix){
        for(int increment = matrix.length/2; increment >0; increment=
                (increment ==2 ) ? 1 : (int) Math.round(increment / 2.2)){
            for(int i = increment; i<matrix.length;i++){
                for(int j = i; j>=increment && matrix[j-increment]
                        >matrix[j];j-=increment){
                    int temp = matrix[j];
                    matrix[j]=matrix[j - increment];
                    matrix[j - increment]=temp;
                }
            }
        }
    }
    }