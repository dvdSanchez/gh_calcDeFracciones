package com.abstrae.calculadora.vista;

import com.abstrae.calculadora.model.Fraccion;
import com.abstrae.calculadora.model.FraccionException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class FraccionGui {

    class Desplegador {
       public void despliegaTitFraccion() {
           System.out.println("Proporciona la fracción:");      
       }
    }

    class DesplegadorConId extends Desplegador {
       private String id;

       public void setId(String pId) {
           id = pId;
       }
	   
       public void despliegaTitFraccion() {
           System.out.println("Proporciona la fracción [" + id + "]: ");      
       }
    }

    private Fraccion solicitaFraccion(Desplegador pDesplegador) {
        boolean laFraccionEsIncorrecta = true;
        Fraccion fr = null;
        while (laFraccionEsIncorrecta) {
            try {
                pDesplegador.despliegaTitFraccion();
                Scanner scan = new Scanner(System.in);        
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
        Desplegador desplegador = new Desplegador();
        Fraccion fr = solicitaFraccion(desplegador);
        return fr;
    }

    private Fraccion solicitaFraccion(String pIdFrac){
        DesplegadorConId desplegador = new DesplegadorConId();
        desplegador.setId(pIdFrac);
        Fraccion fr = solicitaFraccion(desplegador);
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
        System.out.println("\t Impropia: " + pFr.toImpropia() + " Mixta: " + pFr.toMixta());
    }

}