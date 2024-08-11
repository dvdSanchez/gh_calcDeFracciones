package com.abstrae.calculadora.vista;

import com.abstrae.calculadora.model.Fraccion;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class FraccionGui {
    public Fraccion solicitaFraccion(){
        Scanner scan = new Scanner(System.in);        
        System.out.println("Dame numerador :");
        int num = scan.nextInt();
        System.out.println("Dame denominador :");
        int den = scan.nextInt();
        return new Fraccion(num, den);
    }


    public List<Fraccion> solicitaFracciones() {
        Scanner scan = new Scanner(System.in);        
        System.out.println("Cuantas fracciones vas a sumar :");
        int totalFrac = scan.nextInt();
        List<Fraccion> fracciones;
        fracciones = new ArrayList<Fraccion>();
        for (int i=0; i < totalFrac; i++) {
            Fraccion fr = solicitaFraccion();
            fracciones.add(fr);
        }
        return fracciones;
    }


    public void comunicaFraccion(Fraccion pFr){
        System.out.println("El resultado es: ");
        System.out.println("\t" + pFr);
    }
}