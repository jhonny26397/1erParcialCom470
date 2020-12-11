/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primerparcialcom470;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jhon
 */
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.Assert;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class NumComplejoTestTest {
	
	@Parameters
    public static Iterable data(){
        return Arrays.asList(new Object[][]{
            {4, 2},{6, 2},{5, 1},{10, 2},{1, 2},
            {1, 2},{6, 2},{5, 1},{10, 2},{1, 2}
        });
    }
	
	private int parteEntera;
    private int parteImaginaria;
 
    public NumComplejoTestTest(int a, int b) {
        this.parteEntera = a;
        this.parteImaginaria = b;
    }

	@Test
	public void testSumar() {
		NumComplejo instancia = new NumComplejo(1, 1);
		
		NumComplejo resultado = instancia.sumar(new NumComplejo(parteEntera, parteImaginaria));
		NumComplejo esperado = new NumComplejo(parteEntera + 1, parteImaginaria + 1);
		
		assertEquals(resultado.getParteReal(), esperado.getParteReal());
		assertEquals(resultado.getParteImaginaria(), esperado.getParteImaginaria());
	}

	@Test
	public void testRestar() {
		NumComplejo instancia = new NumComplejo(1, 1);
		
		NumComplejo resultado = instancia.restar(new NumComplejo(parteEntera, parteImaginaria));
		NumComplejo esperado = new NumComplejo(1 - parteEntera, 1 - parteImaginaria);
		
		assertEquals(resultado.getParteReal(), esperado.getParteReal());
		assertEquals(resultado.getParteImaginaria(), esperado.getParteImaginaria());
	}
}