package Dao;  

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pack_bd.Admin;
import pack_bd.Hibernate_Util;

public class AdminDao implements IAdminDao {

    // save Student
    // get All Students
    // get Student By Id
    // Update Student
    // Delete Student

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#saveStudent(net.javaguides.hibernate.model.Student)
     */
    @Override
    public void saveAdmin(Admin admin) {
        Transaction transaction = null;
        try (Session session = Hibernate_Util.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.save(admin);

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
    public void updateAdmin(Admin admin) {
        Transaction transaction = null;
        try (Session session = Hibernate_Util.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.saveOrUpdate(admin);

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
    public Admin getAdminById(int id) {
        Transaction transaction = null;
        Admin admin = null;
        try {
			Session session = Hibernate_Util.getSessionFactory().openSession();
			    // start the transaction
			    transaction = session.beginTransaction();

			    // get student object
			    admin= session.byId(Admin.class).getReference(id);
			     // or student = session.get(Student.class, id);
			    //or student = session.load(Student.class, id);
			   //or commit the transaction
			    transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
                transaction.rollback();
		}
			
		}
        
        
        return admin;
    }
 
    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#getAllStudents()
     */
    @Override
    @SuppressWarnings("unchecked")
    public List < Admin > getAllAdmins() {
        Transaction transaction = null;
        List < Admin > admins = null;
        try (Session session = Hibernate_Util.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get students
            admins = session.createQuery("from Admin").list();
            //student = session.load(Student.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return admins;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#deleteStudent(long)
     */
    @Override
    public void deleteAdmin(int id) {
        Transaction transaction = null;
        Admin admin = null;
        try (Session session = Hibernate_Util.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            admin = session.get(Admin.class, id);
            // get student object
            session.delete(admin);
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
