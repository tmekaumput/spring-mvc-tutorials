package com.iomate.spring.lab.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.iomate.spring.lab.dao.OrganisationDao;
import com.iomate.spring.lab.domain.Organisation;

public class OrganisationDaoImpl implements OrganisationDao {

	
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource ds) {
		jdbcTemplate = new JdbcTemplate(ds);
	}

	public boolean create(Organisation org) {
		// TODO Auto-generated method stub
		return false;
	}

	public Organisation getOrganisation(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Organisation> getAllOrganisation() {
		String sqlQuery = "SELECT * FROM organisation";
		List<Organisation> orgList = jdbcTemplate.query(sqlQuery,  new OrganisationRowMapper());
		
		return orgList;
	}

	public boolean delete(Organisation org) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(Organisation org) {
		// TODO Auto-generated method stub
		return false;
	}

	public void cleanup() {
		// TODO Auto-generated method stub

	}

}
