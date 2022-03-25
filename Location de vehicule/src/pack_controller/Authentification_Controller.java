package pack_controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class Authentification_Controller {
	
	private Parent fxml;

    @FXML
    private AnchorPane TableAuthentification;

    @FXML
    private Button btn_authentification;

    @FXML
    private TextField id_Admin;

    @FXML
    private TextField mdp_Admin;

    @FXML
    void MDP_Admin(ActionEvent event) {

    }

    @FXML
    void affiche_PageAuthentification(MouseEvent event) {

    }

    @FXML
    void authentification(ActionEvent event) throws IOException {
    	
    	fxml= FXMLLoader.load(getClass().getResource("/pack_interfaces/BarMenu.fxml"));
    	TableAuthentification.getChildren().removeAll();
    	TableAuthentification.getChildren().setAll(fxml);

    }

    @FXML
    void identifiant_Admin(ActionEvent event) {

    }

}
