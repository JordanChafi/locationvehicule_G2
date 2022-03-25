package pack_controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class ReservationListe_Controller {

    @FXML
    private TableColumn<?, ?> ColAction_ReserListe;

    @FXML
    private TableColumn<?, ?> ColClient_ListeReser;

    @FXML
    private TableColumn<?, ?> ColDateDeb_ListeReser;

    @FXML
    private TableColumn<?, ?> ColDateFin_ListeReser;

    @FXML
    private TableColumn<?, ?> ColDate_ListeReser;

    @FXML
    private TableColumn<?, ?> ColNumReser_ListeReser;

    @FXML
    private TableColumn<?, ?> ColObjetReser_ListeReser;

    @FXML
    private TableColumn<?, ?> ColTarif_ListeReser;

    @FXML
    private TableColumn<?, ?> ColVehicule_ListeReser;

    @FXML
    private AnchorPane TableReservation;

    @FXML
    private TextField recherBar_ListeReser;

    @FXML
    void afficher_TableReser(MouseEvent event) {

    }

    @FXML
    void rechercher_numReser(MouseEvent event) {

    }

}
