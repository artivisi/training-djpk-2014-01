package id.go.kemenkeu.djpk.usermanagement.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tprofil")
public class Tprofil {
	@Id
	@Column(name="id_tprofil")
	private Integer idTprofil; // `id_tprofil` int(11) NOT NULL AUTO_INCREMENT,
	
	@Column(name="induk_tprofil")
	private Integer indukTprofil;
	
	@Column(name="kd_profil") 
	private String kdProfil;
	
	@Column(name="nm_profil")
	private String nmProfil;
	
	@Column(name="level")
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
