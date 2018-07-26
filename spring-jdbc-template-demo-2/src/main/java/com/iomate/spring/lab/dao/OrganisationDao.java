package com.iomate.spring.lab.dao;

import java.util.List;

import javax.sql.DataSource;

import com.iomate.spring.lab.domain.Organisation;

public interface OrganisationDao {

	// Set the data-source that will be required to create a connection to the database
	public void setDataSource(DataSource ds);
	
	// Create a record in the organisation table
	public boolean create(Organisation org);
	
	// Retrieve a single organisation
	public Organisation getOrganisation(Integer id);
	
	// Retrieve all organisation from the table.
	public List<Organisation> getAllOrganisation();
	
	// Delete a specific organisation from the table
	public boolean delete(Organisation org);
	
	// Update an existing organisation
	public boolean update(Organisation org);
	
	public void cleanup();
}
