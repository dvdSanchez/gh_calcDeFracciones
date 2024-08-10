package com.abstrae.calculadora;

import com.abstrae.calculadora.control.EjecutadorDeProcesos;

public class Calculadora {
    public static void main(String[] args) {
        EjecutadorDeProcesos ejecutador;
        ejecutador = new EjecutadorDeProcesos();

        ejecutador.realizaSumaDeFracciones();
    }
}