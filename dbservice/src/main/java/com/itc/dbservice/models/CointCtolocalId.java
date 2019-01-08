package com.itc.dbservice.models;
// Generated 5 Jan, 2019 8:40:26 PM by Hibernate Tools 5.0.6.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CointCtolocalId generated by hbm2java
 */
@Embeddable
public class CointCtolocalId implements java.io.Serializable {

	private String e1243Idempr;
	private String e1243Idcent;
	private String e1243Idprod;
	private String e1243Idcontr;

	public CointCtolocalId() {
	}

	public CointCtolocalId(String e1243Idempr, String e1243Idcent, String e1243Idprod, String e1243Idcontr) {
		this.e1243Idempr = e1243Idempr;
		this.e1243Idcent = e1243Idcent;
		this.e1243Idprod = e1243Idprod;
		this.e1243Idcontr = e1243Idcontr;
	}

	@Column(name = "e1243_idempr", nullable = false, length = 4)
	public String getE1243Idempr() {
		return this.e1243Idempr;
	}

	public void setE1243Idempr(String e1243Idempr) {
		this.e1243Idempr = e1243Idempr;
	}

	@Column(name = "e1243_idcent", nullable = false, length = 4)
	public String getE1243Idcent() {
		return this.e1243Idcent;
	}

	public void setE1243Idcent(String e1243Idcent) {
		this.e1243Idcent = e1243Idcent;
	}

	@Column(name = "e1243_idprod", nullable = false, length = 3)
	public String getE1243Idprod() {
		return this.e1243Idprod;
	}

	public void setE1243Idprod(String e1243Idprod) {
		this.e1243Idprod = e1243Idprod;
	}

	@Column(name = "e1243_idcontr", nullable = false, length = 7)
	public String getE1243Idcontr() {
		return this.e1243Idcontr;
	}

	public void setE1243Idcontr(String e1243Idcontr) {
		this.e1243Idcontr = e1243Idcontr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CointCtolocalId))
			return false;
		CointCtolocalId castOther = (CointCtolocalId) other;

		return ((this.getE1243Idempr() == castOther.getE1243Idempr()) || (this.getE1243Idempr() != null
				&& castOther.getE1243Idempr() != null && this.getE1243Idempr().equals(castOther.getE1243Idempr())))
				&& ((this.getE1243Idcent() == castOther.getE1243Idcent())
						|| (this.getE1243Idcent() != null && castOther.getE1243Idcent() != null
								&& this.getE1243Idcent().equals(castOther.getE1243Idcent())))
				&& ((this.getE1243Idprod() == castOther.getE1243Idprod())
						|| (this.getE1243Idprod() != null && castOther.getE1243Idprod() != null
								&& this.getE1243Idprod().equals(castOther.getE1243Idprod())))
				&& ((this.getE1243Idcontr() == castOther.getE1243Idcontr())
						|| (this.getE1243Idcontr() != null && castOther.getE1243Idcontr() != null
								&& this.getE1243Idcontr().equals(castOther.getE1243Idcontr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getE1243Idempr() == null ? 0 : this.getE1243Idempr().hashCode());
		result = 37 * result + (getE1243Idcent() == null ? 0 : this.getE1243Idcent().hashCode());
		result = 37 * result + (getE1243Idprod() == null ? 0 : this.getE1243Idprod().hashCode());
		result = 37 * result + (getE1243Idcontr() == null ? 0 : this.getE1243Idcontr().hashCode());
		return result;
	}

}