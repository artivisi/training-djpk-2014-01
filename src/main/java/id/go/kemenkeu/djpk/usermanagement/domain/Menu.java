package id.go.kemenkeu.djpk.usermanagement.domain;

public class Menu {
	private Integer idMenu;
	private Integer jenis;
	private String nama;
	private String skrip;
	private String ikon1;
	private String ikon2;
	private Integer urut;
	private Boolean shortcut;
	private Boolean aktif;
	private Boolean terlihat;
	private String param;

	public Integer getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(Integer idMenu) {
		this.idMenu = idMenu;
	}

	public Integer getJenis() {
		return jenis;
	}

	public void setJenis(Integer jenis) {
		this.jenis = jenis;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getSkrip() {
		return skrip;
	}

	public void setSkrip(String skrip) {
		this.skrip = skrip;
	}

	public String getIkon1() {
		return ikon1;
	}

	public void setIkon1(String ikon1) {
		this.ikon1 = ikon1;
	}

	public String getIkon2() {
		return ikon2;
	}

	public void setIkon2(String ikon2) {
		this.ikon2 = ikon2;
	}

	public Integer getUrut() {
		return urut;
	}

	public void setUrut(Integer urut) {
		this.urut = urut;
	}

	public Boolean getShortcut() {
		return shortcut;
	}

	public void setShortcut(Boolean shortcut) {
		this.shortcut = shortcut;
	}

	public Boolean getAktif() {
		return aktif;
	}

	public void setAktif(Boolean aktif) {
		this.aktif = aktif;
	}

	public Boolean getTerlihat() {
		return terlihat;
	}

	public void setTerlihat(Boolean terlihat) {
		this.terlihat = terlihat;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

}
