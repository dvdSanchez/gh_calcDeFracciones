package com.abstrae.calculadora.model;

public class Fraccion {
    private Integer numerador;
    private Integer denominador;


    public Fraccion() {
        numerador = null;
        denominador = null;
    }


    public Fraccion(Integer pNum, Integer pDen) {
        this.setNumerador(pNum);
        this.setDenominador(pDen);
    }

    
    public void setNumerador(Integer pNum) {
        this.numerador = pNum;
    }


    public Integer getNumerador() {
        return numerador;
    }


    public void setDenominador(Integer pDen) {
        if (pDen == 0) {
           throw new FraccionException("No debe ser cero el denominador.");
        }
        this.denominador = pDen;
    }


    public Integer getDenominador() {
        return denominador;
    }


    public String toString() {
        return numerador + "/" + denominador;
    }

}