package pack_controller;

import java.net.URL;
import java.util.ResourceBundle;

import Dao.ConducteurDao;
import Dao.IConducteurDao;
import Dao.IVehiculeDao;
import Dao.VehiculeDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import pack_bd.Conducteur;
import pack_bd.Vehicule;

public class VehiculeListe_Controller implements Initializable{

    @FXML
    private TableColumn<Vehicule, String> ColCouleur_ListeVoit;

    @FXML
    private TableColumn<Vehicule, ?> ColEtat_ListeVoit;

    @FXML
    private TableColumn<Vehicule, String> ColImmat_ListeVoit;

    @FXML
    private TableColumn<Vehicule, String> ColMarque_ListeVoit;

    @FXML
    private TableColumn<Vehicule, String> ColSerie_ListeVoit;

    @FXML
    private TableColumn<Vehicule, Float> ColTarif_ListeVoit;

    @FXML
    private TableColumn<Vehicule, ?> ColTypeVoit_ListeVoit;

    @FXML
    private AnchorPane TableListeVoit;

    @FXML
    private TextField recherBar_ListeVoit;
    
    Vehicule voit = new Vehicule();
    IVehiculeDao ivoit = new VehiculeDao();

    @FXML
    void Afficher_TableListeVoit(MouseEvent event) {

    }

    @FXML
    void rechercherBar_listeVoit(ActionEvent event) {

    }

    @FXML
    void rechercher_immat(MouseEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		ColSerie_ListeVoit.setCellValueFactory(new PropertyValueFactory<>("serieVehicule"));
		ColCouleur_ListeVoit.setCellValueFactory(new PropertyValueFactory<>("couleur"));
		ColMarque_ListeVoit.setCellValueFactory(new PropertyValueFactory<>("marque"));
		ColImmat_ListeVoit.setCellValueFactory(new PropertyValueFactory<>("immat"));
          

		
	}

}
