package id.go.kemenkeu.djpk.usermanagement.domain;

public class Tprofil {
	private Integer idTprofil; // `id_tprofil` int(11) NOT NULL AUTO_INCREMENT,
	private Integer indukTprofil;
	private String kdProfil;
	private String nmProfil;
	private Integer level;

	public Integer getIdTprofil() {
		return idTprofil;
	}

	public void setIdTprofil(Integer idTprofil) {
		this.idTprofil = idTprofil;
	}

	public Integer getIndukTprofil() {
		return indukTprofil;
	}

	public void setIndukTprofil(Integer indukTprofil) {
		this.indukTprofil = indukTprofil;
	}

	public String getKdProfil() {
		return kdProfil;
	}

	public void setKdProfil(String kdProfil) {
		this.kdProfil = kdProfil;
	}

	public String getNmProfil() {
		return nmProfil;
	}

	public void setNmProfil(String nmProfil) {
		this.nmProfil = nmProfil;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}
}
