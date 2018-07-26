package com.iomate.spring.lab;

import java.util.ArrayList;
import java.util.List;

import com.iomate.spring.lab.dao.OrganisationDao;
import com.iomate.spring.lab.domain.Organisation;

public class DaoUtils {

	public static final String createOperation = "CREATE";
	public static final String readOperation = "READ";
	public static final String updateOperation = "UPDATE";
	public static final String deleteOperation = "DELETE";
	public static final String cleanupOperation = "TRUNCATE";
	
	public static void printOrganisations(List<Organisation> orgs, String operation){
	    System.out.println("\n********* printing Organisations after " + operation + " operation *********");
	    for (Organisation org : orgs) {
	        System.out.println(org);
	    }
	}
	
	public static void printOrganisation(Organisation org, String operation) {
		System.out.println("\n********Printing organisation after invoking " + operation + " ************\n" + org);
	}
	
	public static void printSuccessFailure(String operation, boolean param){
	    if(param)
	        System.out.println("\nOperation " + operation + " successful");
	    else
	        System.out.println("\nOperation " + operation + " failed");
	}
	
	public static void createSeedData(OrganisationDao dao){
	    Organisation org1 = new Organisation("Amazon", 1994, "65656", 8765, "Work hard, have fun, make history");
	    Organisation org2 = new Organisation("BMW", 1929, "45454", 5501, "We build ultimate Driving machines");
	    Organisation org3 = new Organisation("Google", 1996, "57575", 4567, "Don't be evil");
	     
	    List<Organisation> orgs = new ArrayList<Organisation>();
	    orgs.add(0, org1); orgs.add(1, org2); orgs.add(2, org3);
	    //int orgCount = orgs.size();
	    int createCount = 0;
	    for(Organisation org : orgs){
	        boolean isCreated  = dao.create(org);
	        if(isCreated)
	            createCount += 1;
	    }
	             
	    System.out.println("Created "+ createCount + " Organisations");
	}
	
	public static void printOrganizationCount(List<Organisation> orgs, String operation){
	    System.out.println("\n*********Currently we have " + orgs.size()+ " organizations after " + operation + " operation" + "   *********");
	     
	}
}
