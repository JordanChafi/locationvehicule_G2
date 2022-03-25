package Dao;

import java.util.List;

import pack_bd.Conducteur;

public interface IConducteurDao {

 void saveConducteur(Conducteur conducteur);

 void updateConducteur(Conducteur conducteur);

 Conducteur getConducteurById(int id);

 List<Conducteur> getAllConducteurs();

 void deleteConducteur(int id);
 


}
