package Dao;

import java.util.List;

import pack_bd.TypeVehicule;

public interface ITypeVehiculeDao {

 void saveTypeVehicule(TypeVehicule typeVehicule);

 void updateTypeVehicule(TypeVehicule typeVehicule);

 TypeVehicule getTypeVehiculeById(int id);

 List<TypeVehicule> getAllTypeVehicules();

 void deleteTypeVehicule(int id);

}
