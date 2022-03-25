package pack_controller;

import java.io.IOException;

import Dao.ConducteurDao;
import Dao.IConducteurDao;
import Dao.IVehiculeDao;
import Dao.VehiculeDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import pack_bd.Conducteur;
import pack_bd.Vehicule;

public class ConducteurEnrg_Controller {
	
	private Parent fxml;

    @FXML
    private Button Btn_annulerConducteur;

    @FXML
    private AnchorPane TableConducEnreg;

    @FXML
    private TextField Tarif_ConducteurBar;

    @FXML
    private TextField Tel_ConducteurBar;

    @FXML
    private Button btn_enregistrerConducteur;

    @FXML
    private TextField nom_ConducteurBar;

    @FXML
    private TextField prenom_ConducteurBar;
    
    
    Conducteur conduc = new Conducteur();
    IConducteurDao iconduc = new ConducteurDao();

    @FXML
    void Affiche_TableConducEnreg(MouseEvent event) { 

    }

    @FXML
    void Btn_AnnulerConducteur(ActionEvent event) throws IOException {
        	
        	fxml= FXMLLoader.load(getClass().getResource("/pack_interfaces/ConducteurEnregistrement.fxml"));
        	TableConducEnreg.getChildren().removeAll();
        	TableConducEnreg.getChildren().setAll(fxml);

    }

    @FXML
    void Btn_EnregistrerConducteur(ActionEvent event) throws IOException {
    	//conduc.setIdConducteur(Integer.parseInt(Tel_ConducteurBar.getText()));
    	conduc.setPrenom(prenom_ConducteurBar.getText());
    	conduc.setNom(nom_ConducteurBar.getText());
    	conduc.setTarifConduc(Float.parseFloat(Tarif_ConducteurBar.getText()));
    	conduc.setNumTel(Tel_ConducteurBar.getText());
    	iconduc.saveConducteur(conduc);
    	
    	
    	fxml= FXMLLoader.load(getClass().getResource("/pack_interfaces/ConducteursListe.fxml"));
    	TableConducEnreg.getChildren().removeAll();
    	TableConducEnreg.getChildren().setAll(fxml);
    	
    	
    	

    }

}
