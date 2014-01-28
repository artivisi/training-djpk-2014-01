package id.go.kemenkeu.djpk.usermanagement.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Table;

@Entity
@Table(name = "tuser")
public class User {
	@Id
	@Column(name="id_user")
	private Integer id;
	@Column(name="userid")
	private String name;
	private String pwd;
	private Integer idGrup;
	@Column(name="tanggalDibuat")
	@Temporal(TemporalType.TIMESTAMP)
	private Date tanggalDibuat;
	@Column(name="tanggalDiubah")
	@Temporal(TemporalType.TIMESTAMP)
	private Date tanggalDiubah;
	private Integer dibuatOleh;
	private Integer diubahOleh;

	private boolean isAktif;
	
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getIdGrup() {
		return idGrup;
	}

	public void setIdGrup(Integer idGrup) {
		this.idGrup = idGrup;
	}

	public Date getTanggalDibuat() {
		return tanggalDibuat;
	}

	public void setTanggalDibuat(Date tanggalDibuat) {
		this.tanggalDibuat = tanggalDibuat;
	}

	public Date getTanggalDiubah() {
		return tanggalDiubah;
	}

	public void setTanggalDiubah(Date tanggalDiubah) {
		this.tanggalDiubah = tanggalDiubah;
	}

	public Integer getDibuatOleh() {
		return dibuatOleh;
	}

	public void setDibuatOleh(Integer dibuatOleh) {
		this.dibuatOleh = dibuatOleh;
	}

	public Integer getDiubahOleh() {
		return diubahOleh;
	}

	public void setDiubahOleh(Integer diubahOleh) {
		this.diubahOleh = diubahOleh;
	}

	public boolean isAktif() {
		return isAktif;
	}

	public void setAktif(boolean isAktif) {
		this.isAktif = isAktif;
	}
}
