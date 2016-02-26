package jUnit;
import static org.junit.Assert.*;

import org.junit.Test;

import exception.DALException;
import operatørAdministration.Controller;


public class Afvejning {
	
	Controller c = new Controller(22);

	@Test
	public void afvejning() throws DALException {
		double tara = 40;
		double brutto = 60;
		double forventet = 20; //Brutto - tara
		assertEquals(forventet, c.beregnNetto(tara, brutto), 0.001);
	}
}

