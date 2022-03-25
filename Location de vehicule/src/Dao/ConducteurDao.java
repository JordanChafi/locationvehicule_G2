package Dao;  

import java.util.List;

import org.hibernate.Session;

import org.hibernate.Transaction;

import pack_bd.Conducteur;

import pack_bd.Hibernate_Util;

public class ConducteurDao implements IConducteurDao {

    // save Student
    // get All Students
    // get Student By Id
    // Update Student
    // Delete Student

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#saveStudent(net.javaguides.hibernate.model.Student)
     */
    @Override
    public void saveConducteur(Conducteur conducteur) {
        Transaction transaction = null;
        try (Session session = Hibernate_Util.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.save(conducteur);

            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#updateStudent(net.javaguides.hibernate.model.Student)
     */
    @Override
    public void updateConducteur(Conducteur conducteur) {
        Transaction transaction = null;
        try (Session session = Hibernate_Util.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.saveOrUpdate(conducteur);

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
    public Conducteur getConducteurById(int id) {
        Transaction transaction = null;
        Conducteur conducteur = null;
        try {
			Session session = Hibernate_Util.getSessionFactory().openSession();
			    // start the transaction
			    transaction = session.beginTransaction();

			    // get student object
			    conducteur= session.byId(Conducteur.class).getReference(id);
			     // or student = session.get(Student.class, id);
			    //or student = session.load(Student.class, id);
			   //or commit the transaction
			    transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
                transaction.rollback();
		}
			
		}
        
        
        return conducteur;
    }
 
    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#getAllStudents()
     */
    @Override
    @SuppressWarnings("unchecked")
    public List < Conducteur > getAllConducteurs() {
        Transaction transaction = null;
        List < Conducteur > Conducteurs = null;
        try (Session session = Hibernate_Util.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get students
            Conducteurs = session.createQuery("from Conducteur").list();
            //student = session.load(Student.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return Conducteurs;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#deleteStudent(long)
     */
    @Override
    public void deleteConducteur(int id) {
        Transaction transaction = null;
        Conducteur conducteur = null;
        try (Session session = Hibernate_Util.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            conducteur = session.get(Conducteur.class, id);
            // get student object
            session.delete(conducteur);
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
