package com.itc.dbservice.models;
// Generated 5 Jan, 2019 8:40:26 PM by Hibernate Tools 5.0.6.Final

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SccVariables generated by hbm2java
 */
@Entity
@Table(name = "scc_variables", schema = "alert_schema")
public class SccVariables implements Serializable {

	private String uuidGener;
	private String g0319Empnovar;
	private String g0319Cennovar;
	private String g0319Tipcovar;
	private String g0319Nombrvar;
	private String g0319Ncampvar;
	private Integer g0319Nordevar;

	public SccVariables() {
	}

	public SccVariables(String uuidGener, String g0319Empnovar, String g0319Cennovar, String g0319Tipcovar,
			String g0319Nombrvar, String g0319Ncampvar) {
		this.uuidGener = uuidGener;
		this.g0319Empnovar = g0319Empnovar;
		this.g0319Cennovar = g0319Cennovar;
		this.g0319Tipcovar = g0319Tipcovar;
		this.g0319Nombrvar = g0319Nombrvar;
		this.g0319Ncampvar = g0319Ncampvar;
	}

	public SccVariables(String uuidGener, String g0319Empnovar, String g0319Cennovar, String g0319Tipcovar,
			String g0319Nombrvar, String g0319Ncampvar, Integer g0319Nordevar) {
		this.uuidGener = uuidGener;
		this.g0319Empnovar = g0319Empnovar;
		this.g0319Cennovar = g0319Cennovar;
		this.g0319Tipcovar = g0319Tipcovar;
		this.g0319Nombrvar = g0319Nombrvar;
		this.g0319Ncampvar = g0319Ncampvar;
		this.g0319Nordevar = g0319Nordevar;
	}

	@Id

	@Column(name = "uuid_gener", unique = true, nullable = false)
	public String getUuidGener() {
		return this.uuidGener;
	}

	public void setUuidGener(String uuidGener) {
		this.uuidGener = uuidGener;
	}

	@Column(name = "g0319_empnovar", nullable = false, length = 4)
	public String getG0319Empnovar() {
		return this.g0319Empnovar;
	}

	public void setG0319Empnovar(String g0319Empnovar) {
		this.g0319Empnovar = g0319Empnovar;
	}

	@Column(name = "g0319_cennovar", nullable = false, length = 4)
	public String getG0319Cennovar() {
		return this.g0319Cennovar;
	}

	public void setG0319Cennovar(String g0319Cennovar) {
		this.g0319Cennovar = g0319Cennovar;
	}

	@Column(name = "g0319_tipcovar", nullable = false, length = 9)
	public String getG0319Tipcovar() {
		return this.g0319Tipcovar;
	}

	public void setG0319Tipcovar(String g0319Tipcovar) {
		this.g0319Tipcovar = g0319Tipcovar;
	}

	@Column(name = "g0319_nombrvar", nullable = false, length = 50)
	public String getG0319Nombrvar() {
		return this.g0319Nombrvar;
	}

	public void setG0319Nombrvar(String g0319Nombrvar) {
		this.g0319Nombrvar = g0319Nombrvar;
	}

	@Column(name = "g0319_ncampvar", nullable = false, length = 200)
	public String getG0319Ncampvar() {
		return this.g0319Ncampvar;
	}

	public void setG0319Ncampvar(String g0319Ncampvar) {
		this.g0319Ncampvar = g0319Ncampvar;
	}

	@Column(name = "g0319_nordevar")
	public Integer getG0319Nordevar() {
		return this.g0319Nordevar;
	}

	public void setG0319Nordevar(Integer g0319Nordevar) {
		this.g0319Nordevar = g0319Nordevar;
	}

}
