package id.go.kemenkeu.djpk.usermanagement.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "twilkerja")
public class TwilayahKerja {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idtwilkerja")
	private Integer id;

}
