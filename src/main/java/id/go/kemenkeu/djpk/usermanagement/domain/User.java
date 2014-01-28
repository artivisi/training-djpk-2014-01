package id.go.kemenkeu.djpk.usermanagement.domain;

import java.sql.Date;


public class User {
	private Integer idUser;
	private String userId;
	private String pwd;
	private Integer idGrup;
	private Date tanggalDibuat;
	private Date tanggalDiubah;
	private Integer dibuatOleh;
	private Integer diubahOleh;
	private Integer idTprofil;
	private Integer idTwilkerja;
	private boolean isAktif;
	
	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

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

	public Integer getIdTprofil() {
		return idTprofil;
	}

	public void setIdTprofil(Integer idTprofil) {
		this.idTprofil = idTprofil;
	}

	public Integer getIdTwilkerja() {
		return idTwilkerja;
	}

	public void setIdTwilkerja(Integer idTwilkerja) {
		this.idTwilkerja = idTwilkerja;
	}

	public boolean isAktif() {
		return isAktif;
	}

	public void setAktif(boolean isAktif) {
		this.isAktif = isAktif;
	}
}
