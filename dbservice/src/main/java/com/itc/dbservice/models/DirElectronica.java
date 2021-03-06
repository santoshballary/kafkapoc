package com.itc.dbservice.models;
// Generated 5 Jan, 2019 8:40:26 PM by Hibernate Tools 5.0.6.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DirElectronica generated by hbm2java
 */
@Entity
@Table(name = "dir_electronica", schema = "alert_schema")
public class DirElectronica implements java.io.Serializable {

	private DirElectronicaId id;
	private String direIdoritlf;
	private Character direIndpre;
	private Date direHorades;
	private Date direHorahas;
	private Date direFecaltsi;
	private String direUsultact;
	private String direEmultact;
	private String direCeultact;
	private Date direFecultac;
	private Date direHoramod;
	private Date direFecbaj;
	private String direDireleLen;
	private String direDireleText;

	public DirElectronica() {
	}

	public DirElectronica(DirElectronicaId id) {
		this.id = id;
	}

	public DirElectronica(DirElectronicaId id, String direIdoritlf, Character direIndpre, Date direHorades,
			Date direHorahas, Date direFecaltsi, String direUsultact, String direEmultact, String direCeultact,
			Date direFecultac, Date direHoramod, Date direFecbaj, String direDireleLen, String direDireleText) {
		this.id = id;
		this.direIdoritlf = direIdoritlf;
		this.direIndpre = direIndpre;
		this.direHorades = direHorades;
		this.direHorahas = direHorahas;
		this.direFecaltsi = direFecaltsi;
		this.direUsultact = direUsultact;
		this.direEmultact = direEmultact;
		this.direCeultact = direCeultact;
		this.direFecultac = direFecultac;
		this.direHoramod = direHoramod;
		this.direFecbaj = direFecbaj;
		this.direDireleLen = direDireleLen;
		this.direDireleText = direDireleText;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "direTipopers", column = @Column(name = "dire_tipopers", nullable = false, length = 1)),
			@AttributeOverride(name = "direCodpers", column = @Column(name = "dire_codpers", nullable = false, precision = 9, scale = 0)),
			@AttributeOverride(name = "direIddispo", column = @Column(name = "dire_iddispo", nullable = false, length = 3)),
			@AttributeOverride(name = "direJnrosec", column = @Column(name = "dire_jnrosec", nullable = false, precision = 3, scale = 0)) })
	public DirElectronicaId getId() {
		return this.id;
	}

	public void setId(DirElectronicaId id) {
		this.id = id;
	}

	@Column(name = "dire_idoritlf", length = 2)
	public String getDireIdoritlf() {
		return this.direIdoritlf;
	}

	public void setDireIdoritlf(String direIdoritlf) {
		this.direIdoritlf = direIdoritlf;
	}

	@Column(name = "dire_indpre", length = 1)
	public Character getDireIndpre() {
		return this.direIndpre;
	}

	public void setDireIndpre(Character direIndpre) {
		this.direIndpre = direIndpre;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dire_horades", length = 29)
	public Date getDireHorades() {
		return this.direHorades;
	}

	public void setDireHorades(Date direHorades) {
		this.direHorades = direHorades;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dire_horahas", length = 29)
	public Date getDireHorahas() {
		return this.direHorahas;
	}

	public void setDireHorahas(Date direHorahas) {
		this.direHorahas = direHorahas;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dire_fecaltsi", length = 13)
	public Date getDireFecaltsi() {
		return this.direFecaltsi;
	}

	public void setDireFecaltsi(Date direFecaltsi) {
		this.direFecaltsi = direFecaltsi;
	}

	@Column(name = "dire_usultact", length = 8)
	public String getDireUsultact() {
		return this.direUsultact;
	}

	public void setDireUsultact(String direUsultact) {
		this.direUsultact = direUsultact;
	}

	@Column(name = "dire_emultact", length = 4)
	public String getDireEmultact() {
		return this.direEmultact;
	}

	public void setDireEmultact(String direEmultact) {
		this.direEmultact = direEmultact;
	}

	@Column(name = "dire_ceultact", length = 4)
	public String getDireCeultact() {
		return this.direCeultact;
	}

	public void setDireCeultact(String direCeultact) {
		this.direCeultact = direCeultact;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dire_fecultac", length = 13)
	public Date getDireFecultac() {
		return this.direFecultac;
	}

	public void setDireFecultac(Date direFecultac) {
		this.direFecultac = direFecultac;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dire_horamod", length = 29)
	public Date getDireHoramod() {
		return this.direHoramod;
	}

	public void setDireHoramod(Date direHoramod) {
		this.direHoramod = direHoramod;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dire_fecbaj", length = 13)
	public Date getDireFecbaj() {
		return this.direFecbaj;
	}

	public void setDireFecbaj(Date direFecbaj) {
		this.direFecbaj = direFecbaj;
	}

	@Column(name = "dire_direle_len", length = 200)
	public String getDireDireleLen() {
		return this.direDireleLen;
	}

	public void setDireDireleLen(String direDireleLen) {
		this.direDireleLen = direDireleLen;
	}

	@Column(name = "dire_direle_text", length = 200)
	public String getDireDireleText() {
		return this.direDireleText;
	}

	public void setDireDireleText(String direDireleText) {
		this.direDireleText = direDireleText;
	}

}
