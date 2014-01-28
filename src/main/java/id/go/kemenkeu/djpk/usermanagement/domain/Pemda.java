package id.go.kemenkeu.djpk.usermanagement.domain;

@Entity
@Table(name = "tpemda")
public class Pemda {
	@Id	//Pada hibernate setiap tabel harus ada Primary Key
	private Integer id;		//`idtpemda` int(11) NOT NULL AUTO_INCREMENT,
	@Column(name = "kdsatker", unique = true, nullable =true)
	private Integer idtprov;		//`idtprov` int(11) DEFAULT NULL,
	private String kdprov;			//`kdprov` char(2) DEFAULT NULL,
	private String kdsatker;		//`kdsatker` char(6) DEFAULT NULL,
	private String kdpemda;			//`kdpemda` char(2) DEFAULT NULL,
	private String urpemda;			//`urpemda` varchar(200) DEFAULT NULL,
	private String urpemdasingkat;	//`urpemdasingkat` varchar(50) DEFAULT NULL,

	public Integer getIdtpemda() {
		return idtpemda;
	}
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
}
