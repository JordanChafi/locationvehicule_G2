package pack_controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class BarMenu_Controller {
	
	private Parent fxml;

    @FXML
    private Button btnClient_accueil;

    @FXML
    private Button btnConducteur_acuueil;

    @FXML
    private Button btnReservation_accueil;

    @FXML
    private Button btnVoiture_accueil;

    @FXML
    private Button btn_Accueil;

    @FXML
    private Button btn_ListeClient;

    @FXML
    private MenuItem btn_ListeConducteurs;

    @FXML
    private MenuItem btn_ListeReservation;

    @FXML
    private MenuItem btn_ListeVehicule;

    @FXML
    private MenuItem btn_enregistrerConducteurs;

    @FXML
    private MenuItem btn_enregistrerReservations;

    @FXML
    private MenuItem btn_enregistrerVehicule;

    @FXML
    private ImageView btn_home;

    @FXML
    private AnchorPane page;

    @FXML
    void AfficherEnrg_Reservation(ActionEvent event) throws IOException {
    	
    	fxml= FXMLLoader.load(getClass().getResource("/pack_interfaces/ReservationEnregistrement.fxml"));
    	page.getChildren().removeAll();
    	page.getChildren().setAll(fxml);

    }
    
    

    @FXML
    void AfficherListe_Reservation(ActionEvent event) throws IOException {
    	
    	fxml= FXMLLoader.load(getClass().getResource("/pack_interfaces/ReservationListe.fxml"));
    	page.getChildren().removeAll();
    	page.getChildren().setAll(fxml);

    }

    @FXML
    void afficherListeClient(ActionEvent event) throws IOException {
    	
    	fxml= FXMLLoader.load(getClass().getResource("/pack_interfaces/ClientsListe.fxml"));
    	page.getChildren().removeAll();
    	page.getChildren().setAll(fxml);

    }

    @FXML
    void afficherListeConducteur(ActionEvent event) throws IOException {
    	
    	fxml= FXMLLoader.load(getClass().getResource("/pack_interfaces/ConducteurListe.fxml"));
    	page.getChildren().removeAll();
    	page.getChildren().setAll(fxml);

    }

    @FXML
    void afficherListeReservation(ActionEvent event) throws IOException {
    	
    	fxml= FXMLLoader.load(getClass().getResource("/pack_interfaces/ReservationListe.fxml"));
    	page.getChildren().removeAll();
    	page.getChildren().setAll(fxml);

    }

    @FXML
    void afficherListeVoitures(ActionEvent event) throws IOException {
    	
    	fxml= FXMLLoader.load(getClass().getResource("/pack_interfaces/VehiculesListe.fxml"));
    	page.getChildren().removeAll();
    	page.getChildren().setAll(fxml);

    }

    @FXML
    void afficher_ListeClient(ActionEvent event) throws IOException {
    	
    	fxml= FXMLLoader.load(getClass().getResource("/pack_interfaces/ClientsListe.fxml"));
    	page.getChildren().removeAll();
    	page.getChildren().setAll(fxml);

    }

    @FXML
    void afficher_ListeConducteurs(ActionEvent event) throws IOException {
    	
    	fxml= FXMLLoader.load(getClass().getResource("/pack_interfaces/ConducteursListe.fxml"));
    	page.getChildren().removeAll();
    	page.getChildren().setAll(fxml);

    }

    @FXML
    void afficher_ListeVehicule(ActionEvent event) throws IOException {
    	
    	fxml= FXMLLoader.load(getClass().getResource("/pack_interfaces/VehiculesListe.fxml"));
    	page.getChildren().removeAll();
    	page.getChildren().setAll(fxml);

    }

    @FXML
    void enregistrerVehicule(ActionEvent event) throws IOException {
    	
    	fxml= FXMLLoader.load(getClass().getResource("/pack_interfaces/VehiculeEnregistrement.fxml"));
    	page.getChildren().removeAll();
    	page.getChildren().setAll(fxml);

    }

    @FXML
    void enregistrer_conducteurs(ActionEvent event) throws IOException {
    	
    	fxml= FXMLLoader.load(getClass().getResource("/pack_interfaces/ConducteurEnregistrement.fxml"));
    	page.getChildren().removeAll();
    	page.getChildren().setAll(fxml);

    }

    @FXML
    void revenir_Authentification(MouseEvent event) {

    }

    @FXML
    void revenir_pageAccueil(ActionEvent event) throws IOException {
    	
    	fxml= FXMLLoader.load(getClass().getResource("/pack_interfaces/accueil_page.fxml"));
    	page.getChildren().removeAll();
    	page.getChildren().setAll(fxml);

    }

    @FXML
    void venir_accueil(MouseEvent event) {

    }

}
