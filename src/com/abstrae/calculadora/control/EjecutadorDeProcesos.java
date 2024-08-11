package com.abstrae.calculadora.control;

import java.util.List;

import com.abstrae.calculadora.model.Fraccion;
import com.abstrae.calculadora.vista.FraccionGui;

public class EjecutadorDeProcesos {

    public void realizaSumaDeFracciones() {
	FraccionGui gui;
	gui = new FraccionGui();
        List<Fraccion> fracciones;
	fracciones = gui.solicitaFracciones();

        CalculadoraDeFracciones calc;
        calc = new CalculadoraDeFracciones();
        Fraccion frRes = calc.sumaFracciones(fracciones);

        gui.comunicaFraccion(frRes);
    }

}