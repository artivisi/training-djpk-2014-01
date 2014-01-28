package id.go.kemenkeu.djpk.usermanagement.domain;

public class Pemda {
	private Integer idtpemda;

	public Integer getIdtpemda() {
		return idtpemda;
	}

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
}
