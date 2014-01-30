package id.go.kemenkeu.djpk.usermanagement.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tpemda")
public class Pemda {
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "idtpemda")
	private Integer id;		//`idtpemda` int(11) NOT NULL AUTO_INCREMENT,
        
        @Column(name = "kdsatker", unique = true, nullable = true)
	private String kodeSatuanKerja;		//`kdsatker` char(6) DEFAULT NULL,
        @Column(name = "kdpemda")
	private String kode;			//`kdpemda` char(2) DEFAULT NULL,
        @Column(name = "urpemda")
	private String uraian;			//`urpemda` varchar(200) DEFAULT NULL,
        @Column(name = "urpemdasingkat")
	private String uraianSingkat;	//`urpemdasingkat` varchar(50) DEFAULT NULL,
        
        // relasi foreign key ke Tprov
        @ManyToOne
        @JoinColumn(name = "idtprov", nullable = false, foreignKey = @ForeignKey(name = "tpemda_ibfk_1"))
        private Tprov provinsi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKodeSatuanKerja() {
        return kodeSatuanKerja;
    }

    public void setKodeSatuanKerja(String kodeSatuanKerja) {
        this.kodeSatuanKerja = kodeSatuanKerja;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getUraian() {
        return uraian;
    }

    public void setUraian(String uraian) {
        this.uraian = uraian;
    }

    public String getUraianSingkat() {
        return uraianSingkat;
    }

    public void setUraianSingkat(String uraianSingkat) {
        this.uraianSingkat = uraianSingkat;
    }

    public Tprov getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(Tprov provinsi) {
        this.provinsi = provinsi;
    }

	
}
