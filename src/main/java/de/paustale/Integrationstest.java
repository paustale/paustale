package de.paustale;

import static org.junit.Assert.*;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import de.paustale.meldeauskunft.domain.Resident;

public class Integrationstest {

	@Test
	public void test() {
		Resident resident = new Resident();
		resident.setCity("WHV");
		resident.setFamilyName("FamilienName");
		resident.setGivenName("GivenName");
		resident.setStreet("Strasse");	
		Date date = new Date(0);
		resident.setDateOfBirth(date);
		

	}

}
