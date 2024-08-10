package com.abstrae.calculadora.model;

public class Fraccion {
    private Integer numerador;
    private Integer denominador;


    public Fraccion() {
        numerador = null;
        denominador = null;
    }


    public Fraccion(Integer pNum, Integer pDen) {
        this.numerador = pNum;
        this.denominador = pDen;
    }

    
    public void setNumerador(Integer pNum) {
        this.numerador = pNum;
    }


    public Integer getNumerador() {
        return numerador;
    }


    public void setDenominador(Integer pDen) {
        this.denominador = pDen;
    }


    public Integer getDenominador() {
        return denominador;
    }


    public String toString() {
        return numerador + "/" + denominador;
    }

}