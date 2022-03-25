package Dao;

import java.util.List;

import pack_bd.Reservation;

public interface IReservationDao {

 void saveReservation(Reservation reservation);

 void updateReservation(Reservation reservation);

 Reservation getReservationById(int id);

 List<Reservation> getAllReservations();

 void deleteReservation(int id);

}
