package com.iomate.spring.lab;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iomate.spring.lab.dao.OrganisationDao;
import com.iomate.spring.lab.domain.Organisation;

public class JdbcTemplateClassicApp2 {

	public static void main(String[] args) {
		
		// creating the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// Create the bean
		OrganisationDao dao = (OrganisationDao) ctx.getBean("orgDao");
		
		// Create seed data
		DaoUtils.createSeedData(dao);
		
		// List organisations
		List<Organisation> orgs = dao.getAllOrganisation();
		DaoUtils.printOrganisations(orgs, DaoUtils.readOperation);
		
		// Create new organisation record
		Organisation org = new Organisation("General Electric", 1978, "98889", 5776, "Imagination at work");
		boolean isCreated = dao.create(org);
		DaoUtils.printSuccessFailure(DaoUtils.createOperation, isCreated);
		DaoUtils.printOrganisations(dao.getAllOrganisation(), DaoUtils.createOperation);
		
		// get a single organisation
		Organisation org2 = dao.getOrganisation(1);
		DaoUtils.printOrganisation(org2, "getOrganisation");
		
		// Updating a slogan for an organisation
		Organisation org3 = dao.getOrganisation(2);
		org3.setSlogan("We build ** awesome ** driving machines!");
		boolean isUpdated = dao.update(org3);
		DaoUtils.printSuccessFailure(DaoUtils.updateOperation,  isUpdated);;
		DaoUtils.printOrganisation(org3, DaoUtils.updateOperation);
				
		// Delete an organisation
		boolean isDeleted = dao.delete(dao.getOrganisation(3));
		DaoUtils.printSuccessFailure(DaoUtils.deleteOperation, isDeleted);
		DaoUtils.printOrganisations(dao.getAllOrganisation(), DaoUtils.deleteOperation);
		
		// Cleanup
		dao.cleanup();
		DaoUtils.printOrganizationCount(orgs, DaoUtils.cleanupOperation);
				
		// close the application context
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
