package com.abstrae.calculadora.vista;

import com.abstrae.calculadora.model.Fraccion;
import com.abstrae.calculadora.model.FraccionException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class FraccionGui {

    public Fraccion solicitaFraccion(String pIdFrac){
        boolean laFraccionEsIncorrecta = true;
        Fraccion fr = null;
        while (laFraccionEsIncorrecta) {
            try {
                Scanner scan = new Scanner(System.in);        
                System.out.println("Proporciona la fracción [" + pIdFrac+ "]:");
                System.out.print("\tNumerador :");
                int num = scan.nextInt();
                System.out.print("\tDenominador :");
                int den = scan.nextInt();
                fr = new Fraccion(num, den);
                laFraccionEsIncorrecta = false;
            } catch  (FraccionException e) {
                System.out.println("Error: " + e.getMessage() + "\n\tPor favor introduzca una fracción correcta.");
            }
        }
        return fr;
    }


    public Fraccion solicitaFraccion(){
        boolean laFraccionEsIncorrecta = true;
        Fraccion fr = null;
        while (laFraccionEsIncorrecta) {
            try {
                Scanner scan = new Scanner(System.in);        
                System.out.println("Proporciona la fracción:");
                System.out.print("Numerador :");
                int num = scan.nextInt();
                System.out.print("Denominador :");
                int den = scan.nextInt();
                fr = new Fraccion(num, den);
                laFraccionEsIncorrecta = false;
            } catch  (FraccionException e) {
                System.out.println("Error: " + e.getMessage() + "\n\tPor favor introduzca una fracción correcta.");
            }
        }
        return fr;
    }


    public List<Fraccion> solicitaFracciones() {
        Scanner scan = new Scanner(System.in);        
        System.out.println("Cuantas fracciones vas a sumar :");
        int totalFrac = scan.nextInt();
        List<Fraccion> fracciones;
        fracciones = new ArrayList<Fraccion>();
        for (int i=0; i < totalFrac; i++) {
            Fraccion fr = solicitaFraccion(Integer.toString(i+1));
            fracciones.add(fr);
        }
        return fracciones;
    }


    public void comunicaFraccion(Fraccion pFr){
        System.out.println("El resultado es: ");
        System.out.println("\t" + pFr);
    }
}