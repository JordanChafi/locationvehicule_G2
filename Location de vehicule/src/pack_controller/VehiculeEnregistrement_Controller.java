package pack_controller;

import java.io.IOException;

import Dao.IReservationDao;
import Dao.ITypeVehiculeDao;
import Dao.IVehiculeDao;
import Dao.ReservationDao;
import Dao.TypeVehiculeDao;
import Dao.VehiculeDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import pack_bd.Reservation;
import pack_bd.TypeVehicule;
import pack_bd.Vehicule;

public class VehiculeEnregistrement_Controller {
	
	private Parent fxml;

    @FXML
    private AnchorPane Table_EnregistrerVehicule;

    @FXML
    private TextField TarifTypeBar_EnregVoit;

    @FXML
    private Button btn_annulerVoit;

    @FXML
    private Button btn_enregistrerVoit;

    @FXML
    private TextField couleurBar_EnregVoit;

    @FXML
    private TextField descripBar_EnregVoit;

   @FXML
    private TextField idTypeBar_EnregVoit;

    @FXML
    private TextField immatBar_EnregVoit;
    
    @FXML
    private TextField marqueBar_EnregVoit;

    @FXML
    private TextField nomTypeBar_EnregVoit;

    @FXML
    private TextField numSerieBar_EnregVoit;

    @FXML
    private TextField serieBar_EnregVoit;
    
    Vehicule voiture = new Vehicule();
    IVehiculeDao ivoiture = new VehiculeDao();
    
    TypeVehicule typeVoiture = new TypeVehicule();
    ITypeVehiculeDao itypevoiture = new TypeVehiculeDao();
    
    Reservation reser = new Reservation();
    IReservationDao ireser = new ReservationDao();
    		
    		
    		
    		
    @FXML
    void Btn_AnnulerVoit(ActionEvent event) {

    }

    @FXML
    void Btn_EnregistrerVoit(ActionEvent event) throws IOException {
    	

    	typeVoiture.setNom(nomTypeBar_EnregVoit.getText());
    	typeVoiture.setTarifType(Float.parseFloat(TarifTypeBar_EnregVoit.getText()));
    	typeVoiture.setIdType(Integer.parseInt(idTypeBar_EnregVoit.getText()));
    	itypevoiture.saveTypeVehicule(typeVoiture);
    	
    	voiture.setNSerie(Integer.parseInt(numSerieBar_EnregVoit.getText()));
    	voiture.setImmat(immatBar_EnregVoit.getText());
    	voiture.setCouleur(couleurBar_EnregVoit.getText());
    	voiture.setMarque(marqueBar_EnregVoit.getText());
    	voiture.setSerieVehicule(serieBar_EnregVoit.getText());
    	voiture.setDescripVehicule(descripBar_EnregVoit.getText());
    	//typeVoiture = itypevoiture.getTypeVehiculeById(Integer.parseInt(idTypeBar_EnregVoit.getText()));
    	voiture.setTypeVehicule(typeVoiture);
    	ivoiture.saveVehicule(voiture);
    	
    	fxml= FXMLLoader.load(getClass().getResource("/pack_interfaces/VehiculesListe.fxml"));
    	Table_EnregistrerVehicule.getChildren().removeAll();
    	Table_EnregistrerVehicule.getChildren().setAll(fxml);

      	
        
    }

    @FXML
    void afficherTable_EnregVoit(MouseEvent event) {

    }

}
