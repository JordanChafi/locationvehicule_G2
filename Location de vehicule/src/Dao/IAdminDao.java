package Dao;

import java.util.List;

import pack_bd.Admin;

public interface IAdminDao {

 void saveAdmin(Admin admin);

 void updateAdmin(Admin admin);

 Admin getAdminById(int id);

 List<Admin> getAllAdmins();

 void deleteAdmin(int id);

}
