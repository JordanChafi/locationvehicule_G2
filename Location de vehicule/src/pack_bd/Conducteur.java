package pack_bd;
// Generated 25 mars 2022, 16:47:26 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Conducteur generated by hbm2java
 */
@Entity
@Table(name = "conducteur", catalog = "bd_locationvehicule")
public class Conducteur implements java.io.Serializable {

	private Integer idConducteur;
	private String nom;
	private String prenom;
	private String numTel;
	private float tarifConduc;
	private Set<Reservation> reservations = new HashSet<Reservation>(0);

	public Conducteur() {
	}

	public Conducteur(String nom, String prenom, String numTel, float tarifConduc) {
		this.nom = nom;
		this.prenom = prenom;
		this.numTel = numTel;
		this.tarifConduc = tarifConduc;
	}

	public Conducteur(String nom, String prenom, String numTel, float tarifConduc, Set<Reservation> reservations) {
		this.nom = nom;
		this.prenom = prenom;
		this.numTel = numTel;
		this.tarifConduc = tarifConduc;
		this.reservations = reservations;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_conducteur", unique = true, nullable = false)
	public Integer getIdConducteur() {
		return this.idConducteur;
	}

	public void setIdConducteur(Integer idConducteur) {
		this.idConducteur = idConducteur;
	}

	@Column(name = "nom", nullable = false, length = 5)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "prenom", nullable = false, length = 50)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "numTel", nullable = false, length = 25)
	public String getNumTel() {
		return this.numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	@Column(name = "tarif_conduc", nullable = false, precision = 12, scale = 0)
	public float getTarifConduc() {
		return this.tarifConduc;
	}

	public void setTarifConduc(float tarifConduc) {
		this.tarifConduc = tarifConduc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "conducteur")
	public Set<Reservation> getReservations() {
		return this.reservations;
	}

	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}

}
