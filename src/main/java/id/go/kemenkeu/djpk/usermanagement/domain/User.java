package id.go.kemenkeu.djpk.usermanagement.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	
	@Column(name="isaktif")
	private boolean isAktif;
	
	/*
	 * Coba Tambahkan Foreign Key
	 * 
	 */

    @ManyToOne
    @JoinColumn(name = "iduser", nullable = false, foreignKey = @ForeignKey(name = "tpemda_ibfk_1"))
    @Column(name="dibuat_oleh")
	private Integer dibuatOleh;
    
    @ManyToOne
    @JoinColumn(name = "iduser", nullable = false, foreignKey = @ForeignKey(name = "tpemda_ibfk_2"))
    @Column(name="diubah_oleh")
	private Integer diubahOleh;
	
	// relasi foreign key ke tprofil
    @ManyToOne
    @JoinColumn(name = "id_tprofil", nullable = false, foreignKey = @ForeignKey(name = "tuser_ibfk_3"))
    @Column(name="idt_tprofil")
    private Integer idProfil;
    
    // relasi foreign key ke twilkerja
    @ManyToOne
    @JoinColumn(name = "id_twilkerja", nullable = false, foreignKey = @ForeignKey(name = "tuser_ibfk_3"))
    @Column(name="idt_twilkerja")
    private Integer idWilayahKerja;
    
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