package id.go.kemenkeu.djpk.usermanagement.domain;

import java.util.Date;

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
	@Column(name="id_grup")
	private Integer idGrup;
	@Column(name="tanggal_dibuat")
	@Temporal(TemporalType.TIMESTAMP)
	private Date tanggalDibuat;
	@Column(name="tanggal_diubah")
	@Temporal(TemporalType.TIMESTAMP)
	private Date tanggalDiubah;
	@Column(name="dibuat_oleh")
	private Integer dibuatOleh;
	@Column(name="diubah_oleh")
	private Integer diubahOleh;
	@Column(name="isaktif")
	private boolean isAktif;
	
	/*
	 * Coba Tambahkan Foreign Key
	 * 
	 */
	
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