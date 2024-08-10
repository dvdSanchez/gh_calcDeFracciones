package com.abstrae.calculadora.control;

import com.abstrae.calculadora.model.Fraccion;

public class CalculadoraDeFracciones {

    public Fraccion sumaFracciones(Fraccion pFr1, Fraccion pFr2) {
        Fraccion frRes;
        frRes = new Fraccion();
        int denRes = pFr1.getDenominador() * pFr2.getDenominador();
        int res = denRes / pFr1.getDenominador(); 
        int prod1 = res * pFr1.getNumerador(); 
        res = denRes / pFr2.getDenominador(); 
        int prod2 = res * pFr2.getNumerador(); 
	int numRes = prod1 + prod2;
        frRes.setDenominador(denRes);
        frRes.setNumerador(numRes);
        return frRes;
    }

}