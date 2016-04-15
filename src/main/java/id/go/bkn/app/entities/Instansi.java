package id.go.bkn.app.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * Instansi entity.
 * 
 */
@Entity
@Table(name = "instansi")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "JENIS", discriminatorType = DiscriminatorType.STRING)
public class Instansi {

	/** The Constant INSTANSI_PUSAT. */
	public static final String INSTANSI_PUSAT = "P";

	/** The Constant INSTANSI_DAERAH. */
	public static final String INSTANSI_DAERAH = "D";

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5638967061069062119L;

	
	private String id;

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "ID", unique = true, nullable = false, length = 32)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// Fields
	/** The nama. */
	private String nama;

	/** The jenis. */
	private String jenis;

	/** The cepat kode. */
	private String cepatKode;

	// Constructors

	/**
	 * default constructor.
	 */
	public Instansi() {
		super();
	}

	/**
	 * constructor.
	 * 
	 * @param nama
	 *            the nama
	 * @param cepatKode
	 *            the cepat kode
	 * @param prosesBerkasDipusat
	 *            the proses berkas dipusat
	 */
	public Instansi(String nama, String cepatKode) {
		super();
		this.nama = nama;
		this.cepatKode = cepatKode;
	}

	/**
	 * full constructor.
	 * 
	 * @param nama
	 *            the nama
	 * @param jenis
	 *            the jenis
	 * @param cepatKode
	 *            the cepat kode
	 * @param prosesBerkasDipusat
	 *            the proses berkas dipusat
	 */
	public Instansi(String nama, String jenis, String cepatKode) {
		super();
		this.nama = nama;
		this.jenis = jenis;
		this.cepatKode = cepatKode;
	}

	// Property accessors

	/**
	 * Gets the nama.
	 * 
	 * @return nama instansi
	 */
	@Column(name = "NAMA", nullable = false, length = 100)
	public String getNama() {
		return this.nama;
	}

	/**
	 * Sets the nama.
	 * 
	 * @param nama
	 *            nama instansi to set
	 */
	public void setNama(String nama) {
		this.nama = nama;
	}

	/**
	 * Gets the jenis.
	 * 
	 * @return jenis instansi
	 */
	@Column(name = "JENIS", nullable = false, length = 1, insertable = false, updatable = false)
	public String getJenis() {
		return this.jenis;
	}

	/**
	 * Sets the jenis.
	 * 
	 * @param jenis
	 *            instansi
	 */
	public void setJenis(String jenis) {
		this.jenis = jenis;
	}

	/**
	 * Gets the cepat kode.
	 * 
	 * @return cepat kode
	 */
	@Column(name = "CEPAT_KODE", length = 5)
	public String getCepatKode() {
		return this.cepatKode;
	}

	/**
	 * Sets the cepat kode.
	 * 
	 * @param cepatKode
	 *            to set
	 */
	public void setCepatKode(String cepatKode) {
		this.cepatKode = cepatKode;
	}

}