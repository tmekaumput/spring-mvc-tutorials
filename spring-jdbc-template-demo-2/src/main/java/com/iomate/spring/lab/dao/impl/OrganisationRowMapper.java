package com.iomate.spring.lab.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.iomate.spring.lab.domain.Organisation;

public class OrganisationRowMapper implements RowMapper<Organisation>{
	
	/*
	 * (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 * 
	 */
	public Organisation mapRow(ResultSet rs, int rownum) throws SQLException {
		
		Organisation org = new Organisation();
		org.setId(rs.getInt("id"));
		org.setCompanyName(rs.getString("company_name"));
		org.setYearOfIncorporation(rs.getInt("year_of_incorporation"));
		org.setPostalCode(rs.getString("postal_code"));
		org.setEmployeeCount(rs.getInt("employee_count"));
		org.setSlogan(rs.getString("slogan"));
		
		return org;
	}

		
}
