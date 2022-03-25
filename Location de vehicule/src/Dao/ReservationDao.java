package Dao;  

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pack_bd.Reservation;
import pack_bd.Hibernate_Util;

public class ReservationDao implements IReservationDao {

    // save Student
    // get All Students
    // get Student By Id
    // Update Student
    // Delete Student

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#saveStudent(net.javaguides.hibernate.model.Student)
     */
    @Override
    public void saveReservation(Reservation reservation) {
        Transaction transaction = null;
        try (Session session = Hibernate_Util.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.save(reservation);

            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#updateStudent(net.javaguides.hibernate.model.Student)
     */
    @Override
    public void updateReservation(Reservation reservation) {
        Transaction transaction = null;
        try (Session session = Hibernate_Util.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.saveOrUpdate(reservation);

            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#getStudentById(long)
     */
    @Override
    public Reservation getReservationById(int id) {
        Transaction transaction = null;
        Reservation reservation = null;
        try {
			Session session = Hibernate_Util.getSessionFactory().openSession();
			    // start the transaction
			    transaction = session.beginTransaction();

			    // get student object
			    reservation= session.byId(Reservation.class).getReference(id);
			     // or student = session.get(Student.class, id);
			    //or student = session.load(Student.class, id);
			   //or commit the transaction
			    transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
                transaction.rollback();
		}
			
		}
        
        
        return reservation;
    }
 
    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#getAllStudents()
     */
    @Override
    @SuppressWarnings("unchecked")
    public List < Reservation > getAllReservations() {
        Transaction transaction = null;
        List < Reservation > reservations = null;
        try (Session session = Hibernate_Util.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get students
            reservations = session.createQuery("from Reservation").list();
            //student = session.load(Student.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return reservations;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#deleteStudent(long)
     */
    @Override
    public void deleteReservation(int id) {
        Transaction transaction = null;
        Reservation reservation = null;
        try (Session session = Hibernate_Util.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            reservation = session.get(Reservation.class, id);
            // get student object
            session.delete(reservation);
            //student = session.load(Student.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}
