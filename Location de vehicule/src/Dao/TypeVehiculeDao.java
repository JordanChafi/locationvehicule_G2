

package Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pack_bd.TypeVehicule;
import pack_bd.Hibernate_Util;

public class TypeVehiculeDao implements ITypeVehiculeDao {

    // save Student
    // get All Students
    // get Student By Id
    // Update Student
    // Delete Student

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#saveStudent(net.javaguides.hibernate.model.Student)
     */
    @Override
    public void saveTypeVehicule(TypeVehicule typeVehicule) {
        Transaction transaction = null;
        try (Session session = Hibernate_Util.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.save(typeVehicule);

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
    public void updateTypeVehicule(TypeVehicule TypeVehicule) {
        Transaction transaction = null;
        try (Session session = Hibernate_Util.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.saveOrUpdate(TypeVehicule);

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
    public TypeVehicule getTypeVehiculeById(int id) {
        Transaction transaction = null;
        TypeVehicule typeVehicule = null;
        try {
			Session session = Hibernate_Util.getSessionFactory().openSession();
			    // start the transaction
			    transaction = session.beginTransaction();

			    // get student object
			    typeVehicule= session.byId(TypeVehicule.class).getReference(id);
			     // or student = session.get(Student.class, id);
			    //or student = session.load(Student.class, id);
			   //or commit the transaction
			    transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
                transaction.rollback();
		}
			
		}
        
        
        return typeVehicule;
    }
 
    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#getAllStudents()
     */
    @Override
    @SuppressWarnings("unchecked")
    public List < TypeVehicule > getAllTypeVehicules() {
        Transaction transaction = null;
        List < TypeVehicule > typeVehicules = null;
        try (Session session = Hibernate_Util.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get students
            typeVehicules = session.createQuery("from Admin").list();
            //student = session.load(Student.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return typeVehicules;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#deleteStudent(long)
     */
    @Override
    public void deleteTypeVehicule(int id) {
        Transaction transaction = null;
        TypeVehicule typeVehicule = null;
        try (Session session = Hibernate_Util.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            typeVehicule = session.get(TypeVehicule.class, id);
            // get student object
            session.delete(typeVehicule);
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
