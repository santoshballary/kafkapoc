package com.itc.dbservice.models;
// Generated 5 Jan, 2019 8:40:26 PM by Hibernate Tools 5.0.6.Final

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SccGestAlert generated by hbm2java
 */
@Entity
@Table(name = "scc_gest_alert", schema = "alert_schema")
public class SccGestAlert implements Serializable {

	private Serializable uuid;
	private String g0323Idempre;
	private String g0323Idcent;
	private String g0323Idprod;
	private String g0323Idcontr;
	private String g0323Tipcomu1;
	private String g0323Idempscc;
	private String g0323Idcenscc;
	private String g0323Idprdscc;
	private String g0323Idconscc;
	private Date g0323Faltaser;
	private Date g0323Fbajaser;
	private String g0323Codsus;
	private Character g0323Tipopers;
	private String g0323Numperso;
	private Date g0323Fivigsus;
	private Date g0323Ffvigsus;
	private String g0323Usumod;

	public SccGestAlert() {
	}

	public SccGestAlert(Serializable uuid, String g0323Idempre, String g0323Idcent, String g0323Idprod,
			String g0323Idcontr, String g0323Tipcomu1) {
		this.uuid = uuid;
		this.g0323Idempre = g0323Idempre;
		this.g0323Idcent = g0323Idcent;
		this.g0323Idprod = g0323Idprod;
		this.g0323Idcontr = g0323Idcontr;
		this.g0323Tipcomu1 = g0323Tipcomu1;
	}

	public SccGestAlert(Serializable uuid, String g0323Idempre, String g0323Idcent, String g0323Idprod,
			String g0323Idcontr, String g0323Tipcomu1, String g0323Idempscc, String g0323Idcenscc, String g0323Idprdscc,
			String g0323Idconscc, Date g0323Faltaser, Date g0323Fbajaser, String g0323Codsus, Character g0323Tipopers,
			String g0323Numperso, Date g0323Fivigsus, Date g0323Ffvigsus, String g0323Usumod) {
		this.uuid = uuid;
		this.g0323Idempre = g0323Idempre;
		this.g0323Idcent = g0323Idcent;
		this.g0323Idprod = g0323Idprod;
		this.g0323Idcontr = g0323Idcontr;
		this.g0323Tipcomu1 = g0323Tipcomu1;
		this.g0323Idempscc = g0323Idempscc;
		this.g0323Idcenscc = g0323Idcenscc;
		this.g0323Idprdscc = g0323Idprdscc;
		this.g0323Idconscc = g0323Idconscc;
		this.g0323Faltaser = g0323Faltaser;
		this.g0323Fbajaser = g0323Fbajaser;
		this.g0323Codsus = g0323Codsus;
		this.g0323Tipopers = g0323Tipopers;
		this.g0323Numperso = g0323Numperso;
		this.g0323Fivigsus = g0323Fivigsus;
		this.g0323Ffvigsus = g0323Ffvigsus;
		this.g0323Usumod = g0323Usumod;
	}

	@Id

	@Column(name = "uuid_", unique = true, nullable = false)
	public Serializable getUuid() {
		return this.uuid;
	}

	public void setUuid(Serializable uuid) {
		this.uuid = uuid;
	}

	@Column(name = "g0323_idempre", nullable = false, length = 4)
	public String getG0323Idempre() {
		return this.g0323Idempre;
	}

	public void setG0323Idempre(String g0323Idempre) {
		this.g0323Idempre = g0323Idempre;
	}

	@Column(name = "g0323_idcent", nullable = false, length = 4)
	public String getG0323Idcent() {
		return this.g0323Idcent;
	}

	public void setG0323Idcent(String g0323Idcent) {
		this.g0323Idcent = g0323Idcent;
	}

	@Column(name = "g0323_idprod", nullable = false, length = 3)
	public String getG0323Idprod() {
		return this.g0323Idprod;
	}

	public void setG0323Idprod(String g0323Idprod) {
		this.g0323Idprod = g0323Idprod;
	}

	@Column(name = "g0323_idcontr", nullable = false, length = 7)
	public String getG0323Idcontr() {
		return this.g0323Idcontr;
	}

	public void setG0323Idcontr(String g0323Idcontr) {
		this.g0323Idcontr = g0323Idcontr;
	}

	@Column(name = "g0323_tipcomu1", nullable = false, length = 9)
	public String getG0323Tipcomu1() {
		return this.g0323Tipcomu1;
	}

	public void setG0323Tipcomu1(String g0323Tipcomu1) {
		this.g0323Tipcomu1 = g0323Tipcomu1;
	}

	@Column(name = "g0323_idempscc", length = 4)
	public String getG0323Idempscc() {
		return this.g0323Idempscc;
	}

	public void setG0323Idempscc(String g0323Idempscc) {
		this.g0323Idempscc = g0323Idempscc;
	}

	@Column(name = "g0323_idcenscc", length = 4)
	public String getG0323Idcenscc() {
		return this.g0323Idcenscc;
	}

	public void setG0323Idcenscc(String g0323Idcenscc) {
		this.g0323Idcenscc = g0323Idcenscc;
	}

	@Column(name = "g0323_idprdscc", length = 3)
	public String getG0323Idprdscc() {
		return this.g0323Idprdscc;
	}

	public void setG0323Idprdscc(String g0323Idprdscc) {
		this.g0323Idprdscc = g0323Idprdscc;
	}

	@Column(name = "g0323_idconscc", length = 7)
	public String getG0323Idconscc() {
		return this.g0323Idconscc;
	}

	public void setG0323Idconscc(String g0323Idconscc) {
		this.g0323Idconscc = g0323Idconscc;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "g0323_faltaser", length = 13)
	public Date getG0323Faltaser() {
		return this.g0323Faltaser;
	}

	public void setG0323Faltaser(Date g0323Faltaser) {
		this.g0323Faltaser = g0323Faltaser;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "g0323_fbajaser", length = 13)
	public Date getG0323Fbajaser() {
		return this.g0323Fbajaser;
	}

	public void setG0323Fbajaser(Date g0323Fbajaser) {
		this.g0323Fbajaser = g0323Fbajaser;
	}

	@Column(name = "g0323_codsus", length = 15)
	public String getG0323Codsus() {
		return this.g0323Codsus;
	}

	public void setG0323Codsus(String g0323Codsus) {
		this.g0323Codsus = g0323Codsus;
	}

	@Column(name = "g0323_tipopers", length = 1)
	public Character getG0323Tipopers() {
		return this.g0323Tipopers;
	}

	public void setG0323Tipopers(Character g0323Tipopers) {
		this.g0323Tipopers = g0323Tipopers;
	}

	@Column(name = "g0323_numperso", length = 9)
	public String getG0323Numperso() {
		return this.g0323Numperso;
	}

	public void setG0323Numperso(String g0323Numperso) {
		this.g0323Numperso = g0323Numperso;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "g0323_fivigsus", length = 13)
	public Date getG0323Fivigsus() {
		return this.g0323Fivigsus;
	}

	public void setG0323Fivigsus(Date g0323Fivigsus) {
		this.g0323Fivigsus = g0323Fivigsus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "g0323_ffvigsus", length = 13)
	public Date getG0323Ffvigsus() {
		return this.g0323Ffvigsus;
	}

	public void setG0323Ffvigsus(Date g0323Ffvigsus) {
		this.g0323Ffvigsus = g0323Ffvigsus;
	}

	@Column(name = "g0323_usumod", length = 8)
	public String getG0323Usumod() {
		return this.g0323Usumod;
	}

	public void setG0323Usumod(String g0323Usumod) {
		this.g0323Usumod = g0323Usumod;
	}

}
