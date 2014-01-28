package id.go.kemenkeu.djpk.usermanagement.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tprov")
public class Tprov {
	@Id
	@Column(name="idtprov")
	private Integer id;//`idtprov` int(11) NOT NULL AUTO_INCREMENT,
	@Column(name="kdprov")
	private String kodeProvinsi;//`kdprov` char(2) DEFAULT NULL,
	@Column(name="urprov")
	private String uraianProvinsi;//`urprov` varchar(200) DEFAULT NULL,
	@Column(name="urprovsingkat")
	private String uraianProvinsiSingkat;//`urprovsingkat` varchar(50) DEFAULT NULL,
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getKodeProvinsi() {
		return kodeProvinsi;
	}
	public void setKodeProvinsi(String kodeProvinsi) {
		this.kodeProvinsi = kodeProvinsi;
	}
	public String getUraianProvinsi() {
		return uraianProvinsi;
	}
	public void setUraianProvinsi(String uraianProvinsi) {
		this.uraianProvinsi = uraianProvinsi;
	}
	public String getUraianProvinsiSingkat() {
		return uraianProvinsiSingkat;
	}
	public void setUraianProvinsiSingkat(String uraianProvinsiSingkat) {
		this.uraianProvinsiSingkat = uraianProvinsiSingkat;
	}
}
