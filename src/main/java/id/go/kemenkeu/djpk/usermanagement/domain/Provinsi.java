package id.go.kemenkeu.djpk.usermanagement.domain;

public class Provinsi {
	private Integer idtprov;//`idtprov` int(11) NOT NULL AUTO_INCREMENT,
	private String kdprov;//`kdprov` char(2) DEFAULT NULL,
	private String urprov;//`urprov` varchar(200) DEFAULT NULL,
	private String urprovsingkat;//`urprovsingkat` varchar(50) DEFAULT NULL,

	public Integer getIdtprov() {
		return idtprov;
	}
	public void setIdtprov(Integer idtprov) {
		this.idtprov = idtprov;
	}
	public String getKdprov() {
		return kdprov;
	}
	public void setKdprov(String kdprov) {
		this.kdprov = kdprov;
	}
	public String getUrprov() {
		return urprov;
	}
	public void setUrprov(String urprov) {
		this.urprov = urprov;
	}
	public String getUrprovsingkat() {
		return urprovsingkat;
	}
	public void setUrprovsingkat(String urprovsingkat) {
		this.urprovsingkat = urprovsingkat;
	}
}
