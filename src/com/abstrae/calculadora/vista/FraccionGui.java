package com.abstrae.calculadora.vista;

import com.abstrae.calculadora.model.Fraccion;
import java.util.Scanner;

public class FraccionGui {

    public Fraccion solicitaFraccion(){
        Scanner scan = new Scanner(System.in);        
        System.out.println("Dame numerador :");
        int num = scan.nextInt();
        System.out.println("Dame denominador :");
        int den = scan.nextInt();
        return new Fraccion(num, den);
    }


    public void comunicaFraccion(Fraccion pFr){
        System.out.println("El resultado es: ");
        System.out.println("\t" + pFr);
    }

}