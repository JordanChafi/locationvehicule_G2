package pack_bd;
// Generated 25 mars 2022, 16:47:26 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Reservation generated by hbm2java
 */
@Entity
@Table(name = "reservation", catalog = "bd_locationvehicule")
public class Reservation implements java.io.Serializable {

	private Integer NReservation;
	private Admin admin;
	private Client client;
	private Conducteur conducteur;
	private Vehicule vehicule;
	private Date dateDebut;
	private Date dateFin;
	private String objetReservation;
	private int tarifReservation;

	public Reservation() {
	}

	public Reservation(Admin admin, Client client, Conducteur conducteur, Vehicule vehicule, Date dateDebut,
			Date dateFin, String objetReservation, int tarifReservation) {
		this.admin = admin;
		this.client = client;
		this.conducteur = conducteur;
		this.vehicule = vehicule;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.objetReservation = objetReservation;
		this.tarifReservation = tarifReservation;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "n_reservation", unique = true, nullable = false)
	public Integer getNReservation() {
		return this.NReservation;
	}

	public void setNReservation(Integer NReservation) {
		this.NReservation = NReservation;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_admin", nullable = false)
	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "n_client", nullable = false)
	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_conducteur", nullable = false)
	public Conducteur getConducteur() {
		return this.conducteur;
	}

	public void setConducteur(Conducteur conducteur) {
		this.conducteur = conducteur;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "n_serie", nullable = false)
	public Vehicule getVehicule() {
		return this.vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_debut", nullable = false, length = 10)
	public Date getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_fin", nullable = false, length = 10)
	public Date getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	@Column(name = "objet_reservation", nullable = false, length = 100)
	public String getObjetReservation() {
		return this.objetReservation;
	}

	public void setObjetReservation(String objetReservation) {
		this.objetReservation = objetReservation;
	}

	@Column(name = "tarif_reservation", nullable = false)
	public int getTarifReservation() {
		return this.tarifReservation;
	}

	public void setTarifReservation(int tarifReservation) {
		this.tarifReservation = tarifReservation;
	}

}
