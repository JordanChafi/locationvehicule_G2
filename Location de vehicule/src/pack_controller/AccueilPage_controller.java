package pack_controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class AccueilPage_controller {
	
	private Parent fxml; 

    @FXML
    private AnchorPane Table_AccueilPage;

    @FXML
    private Button btnClient_accueil;

    @FXML
    private Button btnConducteur_acuueil;

    @FXML
    private Button btnReservation_accueil;

    @FXML
    private Button btnVoiture_accueil;

    @FXML
    void affcihePag_Accueil(MouseEvent event) {

    }

    @FXML
    void afficherListeClient(ActionEvent event) throws IOException {
    	
    	fxml= FXMLLoader.load(getClass().getResource("/pack_interfaces/ClientsListe.fxml"));
    	Table_AccueilPage.getChildren().removeAll();
    	Table_AccueilPage.getChildren().setAll(fxml);

    }

    @FXML
    void afficherListeConducteur(ActionEvent event) throws IOException {
    	
    	fxml= FXMLLoader.load(getClass().getResource("/pack_interfaces/ConducteursListe.fxml"));
    	Table_AccueilPage.getChildren().removeAll();
    	Table_AccueilPage.getChildren().setAll(fxml);

    }

    @FXML
    void afficherListeReservation(ActionEvent event) throws IOException {
    	
    	fxml= FXMLLoader.load(getClass().getResource("/pack_interfaces/ReservationListe.fxml"));
    	Table_AccueilPage.getChildren().removeAll();
    	Table_AccueilPage.getChildren().setAll(fxml);

    }

    @FXML
    void afficherListeVoitures(ActionEvent event) throws IOException {
    	
    	fxml= FXMLLoader.load(getClass().getResource("/pack_interfaces/VehiculesListe.fxml"));
    	Table_AccueilPage.getChildren().removeAll();
    	Table_AccueilPage.getChildren().setAll(fxml);

    }

}
