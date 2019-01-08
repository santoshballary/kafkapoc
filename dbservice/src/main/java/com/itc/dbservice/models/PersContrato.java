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
 * PersContrato generated by hbm2java
 */
@Entity
@Table(name = "pers_contrato", schema = "alert_schema")
public class PersContrato implements Serializable {

	private Serializable uuid;
	private char pscTipoPers;
	private int pscCodPers;
	private String pscIdempr;
	private String pscIdcent;
	private String pscIdprod;
	private String pscIdcontr;
	private String pscTipoInter;
	private Integer pscOrdInterv;
	private String pscIndEnvio;
	private Date pscFealtcon;
	private String pscUsuUltact;
	private String pscEmultact;
	private String pscCeultact;
	private Date pscFecUltact;
	private Date pscTimultac;
	private String pscIndNivacc;
	private Character pscSopCorres;
	private Short pscPorcRespo;
	private String pscNemocNom;
	private Character pscObligFirm;
	private Character pscSituaRela;
	private Integer pscNrodomic;
	private Character pscInddevol;
	private Date pscFebajcon;
	private String pscTformint;
	private Character pscCodidio;
	private String pscCodsprod;
	private String pscCodprod;
	private String pscIdcontrn;

	public PersContrato() {
	}

	public PersContrato(Serializable uuid, char pscTipoPers, int pscCodPers, String pscIdempr, String pscIdcent,
			String pscIdprod, String pscIdcontr) {
		this.uuid = uuid;
		this.pscTipoPers = pscTipoPers;
		this.pscCodPers = pscCodPers;
		this.pscIdempr = pscIdempr;
		this.pscIdcent = pscIdcent;
		this.pscIdprod = pscIdprod;
		this.pscIdcontr = pscIdcontr;
	}

	public PersContrato(Serializable uuid, char pscTipoPers, int pscCodPers, String pscIdempr, String pscIdcent,
			String pscIdprod, String pscIdcontr, String pscTipoInter, Integer pscOrdInterv, String pscIndEnvio,
			Date pscFealtcon, String pscUsuUltact, String pscEmultact, String pscCeultact, Date pscFecUltact,
			Date pscTimultac, String pscIndNivacc, Character pscSopCorres, Short pscPorcRespo, String pscNemocNom,
			Character pscObligFirm, Character pscSituaRela, Integer pscNrodomic, Character pscInddevol,
			Date pscFebajcon, String pscTformint, Character pscCodidio, String pscCodsprod, String pscCodprod,
			String pscIdcontrn) {
		this.uuid = uuid;
		this.pscTipoPers = pscTipoPers;
		this.pscCodPers = pscCodPers;
		this.pscIdempr = pscIdempr;
		this.pscIdcent = pscIdcent;
		this.pscIdprod = pscIdprod;
		this.pscIdcontr = pscIdcontr;
		this.pscTipoInter = pscTipoInter;
		this.pscOrdInterv = pscOrdInterv;
		this.pscIndEnvio = pscIndEnvio;
		this.pscFealtcon = pscFealtcon;
		this.pscUsuUltact = pscUsuUltact;
		this.pscEmultact = pscEmultact;
		this.pscCeultact = pscCeultact;
		this.pscFecUltact = pscFecUltact;
		this.pscTimultac = pscTimultac;
		this.pscIndNivacc = pscIndNivacc;
		this.pscSopCorres = pscSopCorres;
		this.pscPorcRespo = pscPorcRespo;
		this.pscNemocNom = pscNemocNom;
		this.pscObligFirm = pscObligFirm;
		this.pscSituaRela = pscSituaRela;
		this.pscNrodomic = pscNrodomic;
		this.pscInddevol = pscInddevol;
		this.pscFebajcon = pscFebajcon;
		this.pscTformint = pscTformint;
		this.pscCodidio = pscCodidio;
		this.pscCodsprod = pscCodsprod;
		this.pscCodprod = pscCodprod;
		this.pscIdcontrn = pscIdcontrn;
	}

	@Id

	@Column(name = "uuid_", unique = true, nullable = false)
	public Serializable getUuid() {
		return this.uuid;
	}

	public void setUuid(Serializable uuid) {
		this.uuid = uuid;
	}

	@Column(name = "psc_tipo_pers", nullable = false, length = 1)
	public char getPscTipoPers() {
		return this.pscTipoPers;
	}

	public void setPscTipoPers(char pscTipoPers) {
		this.pscTipoPers = pscTipoPers;
	}

	@Column(name = "psc_cod_pers", nullable = false)
	public int getPscCodPers() {
		return this.pscCodPers;
	}

	public void setPscCodPers(int pscCodPers) {
		this.pscCodPers = pscCodPers;
	}

	@Column(name = "psc_idempr", nullable = false, length = 4)
	public String getPscIdempr() {
		return this.pscIdempr;
	}

	public void setPscIdempr(String pscIdempr) {
		this.pscIdempr = pscIdempr;
	}

	@Column(name = "psc_idcent", nullable = false, length = 4)
	public String getPscIdcent() {
		return this.pscIdcent;
	}

	public void setPscIdcent(String pscIdcent) {
		this.pscIdcent = pscIdcent;
	}

	@Column(name = "psc_idprod", nullable = false, length = 3)
	public String getPscIdprod() {
		return this.pscIdprod;
	}

	public void setPscIdprod(String pscIdprod) {
		this.pscIdprod = pscIdprod;
	}

	@Column(name = "psc_idcontr", nullable = false, length = 7)
	public String getPscIdcontr() {
		return this.pscIdcontr;
	}

	public void setPscIdcontr(String pscIdcontr) {
		this.pscIdcontr = pscIdcontr;
	}

	@Column(name = "psc_tipo_inter", length = 2)
	public String getPscTipoInter() {
		return this.pscTipoInter;
	}

	public void setPscTipoInter(String pscTipoInter) {
		this.pscTipoInter = pscTipoInter;
	}

	@Column(name = "psc_ord_interv")
	public Integer getPscOrdInterv() {
		return this.pscOrdInterv;
	}

	public void setPscOrdInterv(Integer pscOrdInterv) {
		this.pscOrdInterv = pscOrdInterv;
	}

	@Column(name = "psc_ind_envio", length = 2)
	public String getPscIndEnvio() {
		return this.pscIndEnvio;
	}

	public void setPscIndEnvio(String pscIndEnvio) {
		this.pscIndEnvio = pscIndEnvio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "psc_fealtcon", length = 13)
	public Date getPscFealtcon() {
		return this.pscFealtcon;
	}

	public void setPscFealtcon(Date pscFealtcon) {
		this.pscFealtcon = pscFealtcon;
	}

	@Column(name = "psc_usu_ultact", length = 8)
	public String getPscUsuUltact() {
		return this.pscUsuUltact;
	}

	public void setPscUsuUltact(String pscUsuUltact) {
		this.pscUsuUltact = pscUsuUltact;
	}

	@Column(name = "psc_emultact", length = 4)
	public String getPscEmultact() {
		return this.pscEmultact;
	}

	public void setPscEmultact(String pscEmultact) {
		this.pscEmultact = pscEmultact;
	}

	@Column(name = "psc_ceultact", length = 4)
	public String getPscCeultact() {
		return this.pscCeultact;
	}

	public void setPscCeultact(String pscCeultact) {
		this.pscCeultact = pscCeultact;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "psc_fec_ultact", length = 29)
	public Date getPscFecUltact() {
		return this.pscFecUltact;
	}

	public void setPscFecUltact(Date pscFecUltact) {
		this.pscFecUltact = pscFecUltact;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "psc_timultac", length = 29)
	public Date getPscTimultac() {
		return this.pscTimultac;
	}

	public void setPscTimultac(Date pscTimultac) {
		this.pscTimultac = pscTimultac;
	}

	@Column(name = "psc_ind_nivacc", length = 2)
	public String getPscIndNivacc() {
		return this.pscIndNivacc;
	}

	public void setPscIndNivacc(String pscIndNivacc) {
		this.pscIndNivacc = pscIndNivacc;
	}

	@Column(name = "psc_sop_corres", length = 1)
	public Character getPscSopCorres() {
		return this.pscSopCorres;
	}

	public void setPscSopCorres(Character pscSopCorres) {
		this.pscSopCorres = pscSopCorres;
	}

	@Column(name = "psc_porc_respo", precision = 3, scale = 0)
	public Short getPscPorcRespo() {
		return this.pscPorcRespo;
	}

	public void setPscPorcRespo(Short pscPorcRespo) {
		this.pscPorcRespo = pscPorcRespo;
	}

	@Column(name = "psc_nemoc_nom", length = 5)
	public String getPscNemocNom() {
		return this.pscNemocNom;
	}

	public void setPscNemocNom(String pscNemocNom) {
		this.pscNemocNom = pscNemocNom;
	}

	@Column(name = "psc_oblig_firm", length = 1)
	public Character getPscObligFirm() {
		return this.pscObligFirm;
	}

	public void setPscObligFirm(Character pscObligFirm) {
		this.pscObligFirm = pscObligFirm;
	}

	@Column(name = "psc_situa_rela", length = 1)
	public Character getPscSituaRela() {
		return this.pscSituaRela;
	}

	public void setPscSituaRela(Character pscSituaRela) {
		this.pscSituaRela = pscSituaRela;
	}

	@Column(name = "psc_nrodomic")
	public Integer getPscNrodomic() {
		return this.pscNrodomic;
	}

	public void setPscNrodomic(Integer pscNrodomic) {
		this.pscNrodomic = pscNrodomic;
	}

	@Column(name = "psc_inddevol", length = 1)
	public Character getPscInddevol() {
		return this.pscInddevol;
	}

	public void setPscInddevol(Character pscInddevol) {
		this.pscInddevol = pscInddevol;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "psc_febajcon", length = 29)
	public Date getPscFebajcon() {
		return this.pscFebajcon;
	}

	public void setPscFebajcon(Date pscFebajcon) {
		this.pscFebajcon = pscFebajcon;
	}

	@Column(name = "psc_tformint", length = 2)
	public String getPscTformint() {
		return this.pscTformint;
	}

	public void setPscTformint(String pscTformint) {
		this.pscTformint = pscTformint;
	}

	@Column(name = "psc_codidio", length = 1)
	public Character getPscCodidio() {
		return this.pscCodidio;
	}

	public void setPscCodidio(Character pscCodidio) {
		this.pscCodidio = pscCodidio;
	}

	@Column(name = "psc_codsprod", length = 3)
	public String getPscCodsprod() {
		return this.pscCodsprod;
	}

	public void setPscCodsprod(String pscCodsprod) {
		this.pscCodsprod = pscCodsprod;
	}

	@Column(name = "psc_codprod", length = 3)
	public String getPscCodprod() {
		return this.pscCodprod;
	}

	public void setPscCodprod(String pscCodprod) {
		this.pscCodprod = pscCodprod;
	}

	@Column(name = "psc_idcontrn", length = 7)
	public String getPscIdcontrn() {
		return this.pscIdcontrn;
	}

	public void setPscIdcontrn(String pscIdcontrn) {
		this.pscIdcontrn = pscIdcontrn;
	}

}
