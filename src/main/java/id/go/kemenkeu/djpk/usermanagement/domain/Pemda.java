package id.go.kemenkeu.djpk.usermanagement.domain;

public class Pemda {
<<<<<<< HEAD
	private Integer idtpemda;
=======
	private Integer idtpemda;		//`idtpemda` int(11) NOT NULL AUTO_INCREMENT,
	private Integer idtprov;		//`idtprov` int(11) DEFAULT NULL,
	private String kdprov;			//`kdprov` char(2) DEFAULT NULL,
	private String kdsatker;		//`kdsatker` char(6) DEFAULT NULL,
	private String kdpemda;			//`kdpemda` char(2) DEFAULT NULL,
	private String urpemda;			//`urpemda` varchar(200) DEFAULT NULL,
	private String urpemdasingkat;	//`urpemdasingkat` varchar(50) DEFAULT NULL,
>>>>>>> 73ffea73de2fc19973cdb10068684e61f9b7429a

	public Integer getIdtpemda() {
		return idtpemda;
	}
<<<<<<< HEAD

	public void setIdtpemda(Integer idtpemda) {
		this.idtpemda = idtpemda;
	}

	public String getKdprov() {
		return kdprov;
	}

	public void setKdprov(String kdprov) {
		this.kdprov = kdprov;
	}

	public String getKdsatker() {
		return kdsatker;
	}

	public void setKdsatker(String kdsatker) {
		this.kdsatker = kdsatker;
	}

	public String getKdpemda() {
		return kdpemda;
	}

	public void setKdpemda(String kdpemda) {
		this.kdpemda = kdpemda;
	}

	public String getUrpemda() {
		return urpemda;
	}

	public void setUrpemda(String urpemda) {
		this.urpemda = urpemda;
	}

	public String getUrpemdasingkat() {
		return urpemdasingkat;
	}

	public void setUrpemdasingkat(String urpemdasingkat) {
		this.urpemdasingkat = urpemdasingkat;
	}

	private String kdprov;
	private String kdsatker;
	private String kdpemda;
	private String urpemda;
	private String urpemdasingkat;
=======
	public void setIdtpemda(Integer idtpemda) {
		this.idtpemda = idtpemda;
	}
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
	public String getKdsatker() {
		return kdsatker;
	}
	public void setKdsatker(String kdsatker) {
		this.kdsatker = kdsatker;
	}
	public String getKdpemda() {
		return kdpemda;
	}
	public void setKdpemda(String kdpemda) {
		this.kdpemda = kdpemda;
	}
	public String getUrpemda() {
		return urpemda;
	}
	public void setUrpemda(String urpemda) {
		this.urpemda = urpemda;
	}
	public String getUrpemdasingkat() {
		return urpemdasingkat;
	}
	public void setUrpemdasingkat(String urpemdasingkat) {
		this.urpemdasingkat = urpemdasingkat;
	}
>>>>>>> 73ffea73de2fc19973cdb10068684e61f9b7429a
}
