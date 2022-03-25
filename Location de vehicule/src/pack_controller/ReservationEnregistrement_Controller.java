package pack_controller;

import java.sql.Date;

import Dao.ClientDao;
import Dao.ConducteurDao;
import Dao.ReservationDao;
import Dao.VehiculeDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import pack_bd.Reservation;

public class ReservationEnregistrement_Controller {

    @FXML
    private AnchorPane Table_EnregistrerReser;

    @FXML
    private Button btn_annulerReservation;

    @FXML
    private Button btn_enregistrerReservation;

    @FXML
    private TextField cniClient_reserBar;

    @FXML
    private DatePicker dateDeb_reserBar;

    @FXML
    private DatePicker dateFin_reserBar;

    @FXML
    private TextField dureeReser_reserBar;

    @FXML
    private ComboBox<?> marqueVoit_reserBar;

    @FXML
    private TextField nomClient_reserBar;

    @FXML
    private TextField objetReser_reserBar;

    @FXML
    private ComboBox<?> optConduc_reserBar;

    @FXML
    private TextField prenomClient_reserBar;

    @FXML
    private TextField serieReser_reserBar;

    @FXML
    private TextField tarifVoit_reserBar;

    @FXML
    private TextField telClient_reserBar;
    
    Reservation reservation = new Reservation();
    ReservationDao reservationDao = new ReservationDao();
    ClientDao clientDao = new ClientDao();
    VehiculeDao vh = new VehiculeDao();
    ConducteurDao conduc = new ConducteurDao();
    @FXML
    void Btn_AnnulerReservation(ActionEvent event) {

    }

    @FXML
    void Btn_EnregistrerReservation(ActionEvent event) {
    	reservation.setClient(clientDao.getClientById(1));
    	reservation.setConducteur(conduc.getConducteurById(1));
    	reservation.setDateDebut(Date.valueOf(dateDeb_reserBar.getValue()));
    	reservation.setDateFin(Date.valueOf(dateFin_reserBar.getValue()));
    	reservation.setObjetReservation("sdfsfs");
    	reservation.setTarifReservation(124578);
    	reservation.setVehicule(vh.getVehiculeById(1));
    	reservationDao.saveReservation(reservation);
    }

    @FXML
    void afficherTable_EnregistrerReser(MouseEvent event) {

    }

}
