package Dao;

import java.util.List;

import pack_bd.Client;

public interface IClientDao {

 void saveClient(Client client);

 void updateClient(Client client);

 Client getClientById(int id);

 List<Client> getAllClients();

 void deleteClient(int id);

}
