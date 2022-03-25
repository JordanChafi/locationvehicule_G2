package pack_controller;

import java.net.URL;
import java.util.ResourceBundle;

import Dao.ConducteurDao;
import Dao.IConducteurDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import pack_bd.Conducteur;

public class ConducteurListe_Controller implements Initializable{

    @FXML
    private TableColumn<Conducteur, ?> ColAction_ListeConduc;

    @FXML
    private TableColumn<Conducteur, ?> ColEtat_ListeClient;

    @FXML
    private TableColumn<Conducteur, String> ColNOM_ListeConducteur;

    @FXML
    private TableColumn<Conducteur, String> ColNUMTEL_ListeConducteur;

    @FXML
    private TableColumn<Conducteur, String> ColPRENOM_ListeConducteur;

    @FXML
    private TableColumn<Conducteur, Float> ColTARIF_ListeConducteur;

    @FXML
    private TableColumn<Conducteur, Integer> ColumnID_ListeConducteur;

    @FXML
    private TextField Conducteur_rechercheBar;

    @FXML
    private AnchorPane Table_ConducteurListe;

    @FXML
    private TableView<Conducteur> affichageConduc;
    
    Conducteur conduc = new Conducteur();
    IConducteurDao iconduc = new ConducteurDao();

    @FXML
    void affichePage_ConducteurListe(MouseEvent event) {

    }

    @FXML
    void recher_nomConduc(ActionEvent event) {
	

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		ColumnID_ListeConducteur.setCellValueFactory(new PropertyValueFactory<>("idConducteur"));
		ColTARIF_ListeConducteur.setCellValueFactory(new PropertyValueFactory<>("tarifConduc"));
		ColNUMTEL_ListeConducteur.setCellValueFactory(new PropertyValueFactory<>("numTel"));
		ColNOM_ListeConducteur.setCellValueFactory(new PropertyValueFactory<>("nom"));
		ColPRENOM_ListeConducteur.setCellValueFactory(new PropertyValueFactory<>("prenom"));
		affichageConduc.getItems().setAll(iconduc.getAllConducteurs());
		
		
		
	}

}
