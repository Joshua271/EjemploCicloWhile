package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int i=1;
        int result;
        System.out.println("Ingrese un numero para generar una tabla de multiplicacion: ");
        int num = n.nextInt();
        while(i!=13){
            result = num*i;
            System.out.println(num+" x "+i+" = "+result);
            i++;
        }
    }
}
