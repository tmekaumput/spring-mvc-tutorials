package com.iomate.spring.lab.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.iomate.spring.lab.dao.OrganisationDao;
import com.iomate.spring.lab.domain.Organisation;

@Repository("orgDao")
public class OrganisationDaoImpl implements OrganisationDao {

	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource ds) {
		jdbcTemplate = new JdbcTemplate(ds);
	}

	public boolean create(Organisation org) {
		String sqlQuery= "INSERT INTO organisation (company_name, year_of_incorporation, postal_code, employee_count, slogan) " + 
				"VALUES(?, ?, ?, ?, ?)";
		Object[] args = new Object[] { org.getCompanyName(), org.getYearOfIncorporation(), org.getPostalCode(), org.getEmployeeCount(), org.getSlogan() };
		
		return jdbcTemplate.update(sqlQuery, args) == 1;
	}

	public Organisation getOrganisation(Integer id) {
		String sqlQuery = "SELECT id, company_name, year_of_incorporation, postal_code, employee_count, slogan " + 
					" FROM organisation WHERE id = ?";
		Object[] args = new Object[] {id};
		Organisation org = jdbcTemplate.queryForObject(sqlQuery, args, new OrganisationRowMapper());
		return org;
	}
	
	public List<Organisation> getAllOrganisation() {
		String sqlQuery = "SELECT * FROM organisation";
		List<Organisation> orgList = jdbcTemplate.query(sqlQuery,  new OrganisationRowMapper());
		
		return orgList;
	}

	public boolean delete(Organisation org) {
		String sqlQuery = "DELETE FROM organisation WHERE id = ?";
		Object[] args = new Object[] { org.getId() };
		return jdbcTemplate.update(sqlQuery, args) == 1;
	}

	public boolean update(Organisation org) {
		String sqlQuery = "UPDATE organisation SET slogan = ? WHERE id = ?";
		Object[] args = new Object[] { org.getSlogan(), org.getId() };
		return jdbcTemplate.update(sqlQuery, args) == 1;
	}

	public void cleanup() {
		String sqlQuery = "TRUNCATE TABLE organisation ";
		jdbcTemplate.execute(sqlQuery);

	}

}
