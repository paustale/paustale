package de.paustale;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import de.paustale.meldeauskunft.domain.Resident;
import de.paustale.meldeauskunft.repository.ResidentRepositoryStub;
import de.paustale.meldeauskunft.service.BaseResidentService;
import de.paustale.meldeauskunft.service.ResidentServiceException;

public class TestRe {

	 List<Resident> liste = new ArrayList<Resident>();
	    List<Resident> result = new ArrayList<Resident>();
	    List<Resident> result1 = new ArrayList<Resident>();
	    List<Resident> result2 = new ArrayList<Resident>();
	    
	    public void getFilteredResidentsTest() {
	        
	        Resident r1 = new Resident();
	        r1.setGivenName("Stephan");
	        r1.setFamilyName("Mosbach");
	        r1.setStreet("Dammstrasse");
	        r1.setCity("Gosheim");
	        r1.setDateOfBirth(null);
	        
	        
	        Resident r2 = new Resident();
	        r2.setGivenName("Lilli");
	        r2.setFamilyName("Essmer");
	        r2.setStreet("Bondelstrasse");
	        r2.setCity("Brigachtal");
	        r2.setDateOfBirth(null);
	    
	        liste.add(r1);
	        liste.add(r2);
	        
	        ResidentRepositoryStub stub = new ResidentRepositoryStub(liste);
	        
	        BaseResidentService service = new BaseResidentService();
	        service.setResidentRepository(stub);
	        
	        Resident filterResident = new Resident("L*","*","*","*", null);
	        Resident filterResident2 = new Resident("*","*","B*","*", null);
	        Resident filterResident3 = new Resident("*", "E*", "*", "*", null);
	                
	        result = service.getFilteredResidentsList(filterResident);
	        result1 = service.getFilteredResidentsList(filterResident2);
	        result2 = service.getFilteredResidentsList(filterResident3);
	        
	        
	        assertEquals(r2.getGivenName(), result.get(0).getGivenName());
	        assertEquals(r2.getStreet(), result1.get(0).getStreet());
	        assertEquals(r2.getFamilyName(), result2.get(0).getFamilyName());
	    }
	    

	    public void getUniqueResidentsTest() throws ResidentServiceException {
	        
	        List<Resident> liste = new ArrayList<Resident>();
	        
	        Resident r1 = new Resident();
	        r1.setGivenName("Stephan");
	        r1.setFamilyName("Mosbach");
	        r1.setStreet("Dammstrasse");
	        r1.setCity("Gosheim");
	        r1.setDateOfBirth(null);
	        
	        
	        Resident r2 = new Resident();
	        r2.setGivenName("Lilli");
	        r2.setFamilyName("Essmer");
	        r2.setStreet("Bondelstrasse");
	        r2.setCity("Brigachtal");
	        r2.setDateOfBirth(null);
	        

	        liste.add(r1);
	        liste.add(r2);

	        
	        ResidentRepositoryStub stub = new ResidentRepositoryStub(liste);
	        
	        BaseResidentService service = new BaseResidentService();
	        service.setResidentRepository(stub);
	        
	        Resident UniqueResident = new Resident("Stephan","Mosbach","Dammstrasse","Gosheim", null);
	        Resident UniqueResident2 = new Resident("Lilli","Essmer","Bondelstrasse","Brigachtal", null);
	        Resident UniqueResident3 = new Resident("Lilli","Essmer","Bondelstrasse","Brigachtal", null);
	                
	        Resident result = service.getUniqueResident(UniqueResident);
	        Resident result1 = service.getUniqueResident(UniqueResident2);
	        Resident result2 = service.getUniqueResident(UniqueResident3);
	        
	        
	        assertEquals(r1.getGivenName(), result.getGivenName());
	        assertEquals(r2.getFamilyName(), result1.getFamilyName());
	        assertEquals(r2.getStreet(), result2.getStreet());
	    } 

}
