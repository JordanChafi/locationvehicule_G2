package Dao;

import java.util.List;

import pack_bd.Vehicule;

public interface IVehiculeDao {

 void saveVehicule(Vehicule vehicule);

 void updateVehicule(Vehicule vehicule);

 Vehicule getVehiculeById(int id);

 List<Vehicule> getAllVehicules();

 void deleteVehicule(String id);

}
