package id.go.kemenkeu.djpk.usermanagement.domain;

public class TprofilHasTmenu {
	
	private Integer idtprofilHasTmenu;// `idtprofil_has_tmenu` int(11) NOT NULL AUTO_INCREMENT,
	private Integer idTprofil; // `id_tprofil` int(11) DEFAULT NULL,
	private Integer idMenu; // `id_menu` int(11) DEFAULT NULL,
	public Integer getIdtprofilHasTmenu() {
		return idtprofilHasTmenu;
	}
	public void setIdtprofilHasTmenu(Integer idtprofilHasTmenu) {
		this.idtprofilHasTmenu = idtprofilHasTmenu;
	}
	public Integer getIdTprofil() {
		return idTprofil;
	}
	public void setIdTprofil(Integer idTprofil) {
		this.idTprofil = idTprofil;
	}
	public Integer getIdMenu() {
		return idMenu;
	}
	public void setIdMenu(Integer idMenu) {
		this.idMenu = idMenu;
	}

}
