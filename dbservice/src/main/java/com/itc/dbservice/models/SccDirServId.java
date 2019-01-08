package com.itc.dbservice.models;
// Generated 5 Jan, 2019 8:40:26 PM by Hibernate Tools 5.0.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SccDirServId generated by hbm2java
 */
@Embeddable
public class SccDirServId implements java.io.Serializable {

	private String e0575Idemp;
	private String e0575Idcent;
	private String e0575Codprod;
	private String e0575Idcontr;
	private String e0575Cdcanal;
	private char e0575Tipopers;
	private Integer e0575Codpers;
	private char e0575Iddispo;
	private Short e0575Jnrosec;
	private String e0575Defecto;
	private String e0575Usumod;
	private String e0575Fechaba1;
	private Date e0575Fechaal1;

	public SccDirServId() {
	}

	public SccDirServId(String e0575Idemp, String e0575Idcent, String e0575Codprod, String e0575Idcontr,
			String e0575Cdcanal, char e0575Tipopers, char e0575Iddispo, String e0575Defecto, String e0575Usumod) {
		this.e0575Idemp = e0575Idemp;
		this.e0575Idcent = e0575Idcent;
		this.e0575Codprod = e0575Codprod;
		this.e0575Idcontr = e0575Idcontr;
		this.e0575Cdcanal = e0575Cdcanal;
		this.e0575Tipopers = e0575Tipopers;
		this.e0575Iddispo = e0575Iddispo;
		this.e0575Defecto = e0575Defecto;
		this.e0575Usumod = e0575Usumod;
	}

	public SccDirServId(String e0575Idemp, String e0575Idcent, String e0575Codprod, String e0575Idcontr,
			String e0575Cdcanal, char e0575Tipopers, Integer e0575Codpers, char e0575Iddispo, Short e0575Jnrosec,
			String e0575Defecto, String e0575Usumod, String e0575Fechaba1, Date e0575Fechaal1) {
		this.e0575Idemp = e0575Idemp;
		this.e0575Idcent = e0575Idcent;
		this.e0575Codprod = e0575Codprod;
		this.e0575Idcontr = e0575Idcontr;
		this.e0575Cdcanal = e0575Cdcanal;
		this.e0575Tipopers = e0575Tipopers;
		this.e0575Codpers = e0575Codpers;
		this.e0575Iddispo = e0575Iddispo;
		this.e0575Jnrosec = e0575Jnrosec;
		this.e0575Defecto = e0575Defecto;
		this.e0575Usumod = e0575Usumod;
		this.e0575Fechaba1 = e0575Fechaba1;
		this.e0575Fechaal1 = e0575Fechaal1;
	}

	@Column(name = "e0575_idemp", nullable = false, length = 4)
	public String getE0575Idemp() {
		return this.e0575Idemp;
	}

	public void setE0575Idemp(String e0575Idemp) {
		this.e0575Idemp = e0575Idemp;
	}

	@Column(name = "e0575_idcent", nullable = false, length = 4)
	public String getE0575Idcent() {
		return this.e0575Idcent;
	}

	public void setE0575Idcent(String e0575Idcent) {
		this.e0575Idcent = e0575Idcent;
	}

	@Column(name = "e0575_codprod", nullable = false, length = 3)
	public String getE0575Codprod() {
		return this.e0575Codprod;
	}

	public void setE0575Codprod(String e0575Codprod) {
		this.e0575Codprod = e0575Codprod;
	}

	@Column(name = "e0575_idcontr", nullable = false, length = 7)
	public String getE0575Idcontr() {
		return this.e0575Idcontr;
	}

	public void setE0575Idcontr(String e0575Idcontr) {
		this.e0575Idcontr = e0575Idcontr;
	}

	@Column(name = "e0575_cdcanal", nullable = false, length = 3)
	public String getE0575Cdcanal() {
		return this.e0575Cdcanal;
	}

	public void setE0575Cdcanal(String e0575Cdcanal) {
		this.e0575Cdcanal = e0575Cdcanal;
	}

	@Column(name = "e0575_tipopers", nullable = false, length = 1)
	public char getE0575Tipopers() {
		return this.e0575Tipopers;
	}

	public void setE0575Tipopers(char e0575Tipopers) {
		this.e0575Tipopers = e0575Tipopers;
	}

	@Column(name = "e0575_codpers", precision = 9, scale = 0)
	public Integer getE0575Codpers() {
		return this.e0575Codpers;
	}

	public void setE0575Codpers(Integer e0575Codpers) {
		this.e0575Codpers = e0575Codpers;
	}

	@Column(name = "e0575_iddispo", nullable = false, length = 1)
	public char getE0575Iddispo() {
		return this.e0575Iddispo;
	}

	public void setE0575Iddispo(char e0575Iddispo) {
		this.e0575Iddispo = e0575Iddispo;
	}

	@Column(name = "e0575_jnrosec", precision = 3, scale = 0)
	public Short getE0575Jnrosec() {
		return this.e0575Jnrosec;
	}

	public void setE0575Jnrosec(Short e0575Jnrosec) {
		this.e0575Jnrosec = e0575Jnrosec;
	}

	@Column(name = "e0575_defecto", nullable = false, length = 10)
	public String getE0575Defecto() {
		return this.e0575Defecto;
	}

	public void setE0575Defecto(String e0575Defecto) {
		this.e0575Defecto = e0575Defecto;
	}

	@Column(name = "e0575_usumod", nullable = false, length = 8)
	public String getE0575Usumod() {
		return this.e0575Usumod;
	}

	public void setE0575Usumod(String e0575Usumod) {
		this.e0575Usumod = e0575Usumod;
	}

	@Column(name = "e0575_fechaba1", length = 100)
	public String getE0575Fechaba1() {
		return this.e0575Fechaba1;
	}

	public void setE0575Fechaba1(String e0575Fechaba1) {
		this.e0575Fechaba1 = e0575Fechaba1;
	}

	@Column(name = "e0575_fechaal1", length = 13)
	public Date getE0575Fechaal1() {
		return this.e0575Fechaal1;
	}

	public void setE0575Fechaal1(Date e0575Fechaal1) {
		this.e0575Fechaal1 = e0575Fechaal1;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SccDirServId))
			return false;
		SccDirServId castOther = (SccDirServId) other;

		return ((this.getE0575Idemp() == castOther.getE0575Idemp()) || (this.getE0575Idemp() != null
				&& castOther.getE0575Idemp() != null && this.getE0575Idemp().equals(castOther.getE0575Idemp())))
				&& ((this.getE0575Idcent() == castOther.getE0575Idcent())
						|| (this.getE0575Idcent() != null && castOther.getE0575Idcent() != null
								&& this.getE0575Idcent().equals(castOther.getE0575Idcent())))
				&& ((this.getE0575Codprod() == castOther.getE0575Codprod())
						|| (this.getE0575Codprod() != null && castOther.getE0575Codprod() != null
								&& this.getE0575Codprod().equals(castOther.getE0575Codprod())))
				&& ((this.getE0575Idcontr() == castOther.getE0575Idcontr())
						|| (this.getE0575Idcontr() != null && castOther.getE0575Idcontr() != null
								&& this.getE0575Idcontr().equals(castOther.getE0575Idcontr())))
				&& ((this.getE0575Cdcanal() == castOther.getE0575Cdcanal())
						|| (this.getE0575Cdcanal() != null && castOther.getE0575Cdcanal() != null
								&& this.getE0575Cdcanal().equals(castOther.getE0575Cdcanal())))
				&& (this.getE0575Tipopers() == castOther.getE0575Tipopers())
				&& ((this.getE0575Codpers() == castOther.getE0575Codpers())
						|| (this.getE0575Codpers() != null && castOther.getE0575Codpers() != null
								&& this.getE0575Codpers().equals(castOther.getE0575Codpers())))
				&& (this.getE0575Iddispo() == castOther.getE0575Iddispo())
				&& ((this.getE0575Jnrosec() == castOther.getE0575Jnrosec())
						|| (this.getE0575Jnrosec() != null && castOther.getE0575Jnrosec() != null
								&& this.getE0575Jnrosec().equals(castOther.getE0575Jnrosec())))
				&& ((this.getE0575Defecto() == castOther.getE0575Defecto())
						|| (this.getE0575Defecto() != null && castOther.getE0575Defecto() != null
								&& this.getE0575Defecto().equals(castOther.getE0575Defecto())))
				&& ((this.getE0575Usumod() == castOther.getE0575Usumod())
						|| (this.getE0575Usumod() != null && castOther.getE0575Usumod() != null
								&& this.getE0575Usumod().equals(castOther.getE0575Usumod())))
				&& ((this.getE0575Fechaba1() == castOther.getE0575Fechaba1())
						|| (this.getE0575Fechaba1() != null && castOther.getE0575Fechaba1() != null
								&& this.getE0575Fechaba1().equals(castOther.getE0575Fechaba1())))
				&& ((this.getE0575Fechaal1() == castOther.getE0575Fechaal1())
						|| (this.getE0575Fechaal1() != null && castOther.getE0575Fechaal1() != null
								&& this.getE0575Fechaal1().equals(castOther.getE0575Fechaal1())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getE0575Idemp() == null ? 0 : this.getE0575Idemp().hashCode());
		result = 37 * result + (getE0575Idcent() == null ? 0 : this.getE0575Idcent().hashCode());
		result = 37 * result + (getE0575Codprod() == null ? 0 : this.getE0575Codprod().hashCode());
		result = 37 * result + (getE0575Idcontr() == null ? 0 : this.getE0575Idcontr().hashCode());
		result = 37 * result + (getE0575Cdcanal() == null ? 0 : this.getE0575Cdcanal().hashCode());
		result = 37 * result + this.getE0575Tipopers();
		result = 37 * result + (getE0575Codpers() == null ? 0 : this.getE0575Codpers().hashCode());
		result = 37 * result + this.getE0575Iddispo();
		result = 37 * result + (getE0575Jnrosec() == null ? 0 : this.getE0575Jnrosec().hashCode());
		result = 37 * result + (getE0575Defecto() == null ? 0 : this.getE0575Defecto().hashCode());
		result = 37 * result + (getE0575Usumod() == null ? 0 : this.getE0575Usumod().hashCode());
		result = 37 * result + (getE0575Fechaba1() == null ? 0 : this.getE0575Fechaba1().hashCode());
		result = 37 * result + (getE0575Fechaal1() == null ? 0 : this.getE0575Fechaal1().hashCode());
		return result;
	}

}