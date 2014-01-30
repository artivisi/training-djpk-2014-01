package id.go.kemenkeu.djpk.usermanagement.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tprofil")
public class Tprofil {
	@Id
	@Column(name="id_tprofil")
	private Integer idTprofil; // `id_tprofil` int(11) NOT NULL AUTO_INCREMENT,
	
	@Column(name="kd_profil") 
	private String kdProfil;
	
	@Column(name="nm_profil")
	private String nmProfil;
	
	@Column(name="level")
	private Integer level;
        
        @ManyToOne
        @JoinColumn(name = "induk_tprofil", nullable = false, foreignKey = @ForeignKey(name = "tprofil_ibfk_1"))
        private Tprofil induk;
        
        @ManyToMany
        @JoinTable(name = "tprofil_has_tmenu", 
                joinColumns = @JoinColumn(name = "id_tprofil", nullable = false),
                foreignKey = @ForeignKey(name = "tprofil_has_tmenu_ibfk_2"),
                inverseJoinColumns = @JoinColumn(name = "id_menu", nullable = false), 
                inverseForeignKey = @ForeignKey(name = "tprofil_has_tmenu_ibfk_1"))
        private Set<Menu> daftarMenu = new HashSet<Menu>();

	public Integer getIdTprofil() {
		return idTprofil;
	}

	public void setIdTprofil(Integer idTprofil) {
		this.idTprofil = idTprofil;
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
