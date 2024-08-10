package com.abstrae.calculadora.control;

import com.abstrae.calculadora.model.Fraccion;
import com.abstrae.calculadora.vista.FraccionGui;

public class EjecutadorDeProcesos {

    public void realizaSumaDeFracciones() {
	FraccionGui gui;
	gui = new FraccionGui();
        Fraccion fr1, fr2;
        fr1 = gui.solicitaFraccion();
        fr2 = gui.solicitaFraccion();

        CalculadoraDeFracciones calc;
        calc = new CalculadoraDeFracciones();
        Fraccion frRes;
        frRes = calc.sumaFracciones(fr1, fr2);

        gui.comunicaFraccion(frRes);
    }

}