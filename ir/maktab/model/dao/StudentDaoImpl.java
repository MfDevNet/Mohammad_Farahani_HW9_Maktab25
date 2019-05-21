package ir.maktab.model.dao;

import ir.maktab.model.dbconnector.DbConnector;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDAO {
    Session session = DbConnector.getSession();


    @Override
    public void insert(Student student) {
        session= DbConnector.getSession();
        session.save(student);
        session.getTransaction();
        session.close();

    }

    @Override
    public void delete(String StudentId) {
        System.out.println(session.isOpen());
        Transaction transaction = session.beginTransaction();
        if (find(StudentId) != null) {
            try {
                session.createQuery("delete from Student where id=" + StudentId).executeUpdate();
                transaction.commit();

            } catch (Throwable t) {
                transaction.rollback();
                System.out.println("Can not Delete Student");
                throw t;
            }
        }


    }

    @Override
    public void update(String id,Student student) {
        Student st = find(id);
        Transaction transaction =session.beginTransaction();
        if (st != null) {
            try {
                session.createQuery("update Student set firstName = '"+student.getFirstName() +"', lastName =  '"+student.getLastName()+"' where id = "+id).executeUpdate();
                transaction.commit();

            }catch (Throwable t){
                transaction.rollback();
                System.out.println("Can not Update Student" + st);
                throw  t;
            }

        }


    }

    @Override
    public Student find(String... args) {
        Student st = null;
        if (args.length == 1) {
            st = (Student) session.createQuery("select st from Student st where st.id=" + args[0]).getSingleResult();
            System.out.println(st);
            return st;
        } else if (args.length == 2) {
            st = (Student) session.createQuery("select st from Student st where firstName=" + args[0] + " and lastName =" + args[1]).getSingleResult();
            return st;
        }
        System.out.println("Not Found Student (return null)");
        return st;
    }

    //if arg[0] & arg[1] != "" out like first name and like last name execute
    // if arg[0] !="" and arg[1] ==""  out like first name execute
    //if arg[0] =="" and arg[1] !=""  out like last name execute
    //else out  all Student
    @Override
    public List<Student> findAll(String... args) {
        List<Student> studentList = new ArrayList<>();

        if (!args[0].equals("") && !args[1].equals("")) {
            studentList = session.createQuery("from Student st where st.firstName like '" + args[0] + "%' and st.lastName like '" + args[1] + "%'").list();
            System.out.println(studentList);
            return studentList;

        } else if (!args[0].equals("")) {
            studentList = session.createQuery("from Student where firstName like '" + args[0] + "%'").list();
            System.out.println(studentList);
            return studentList;

        } else if (!args[1].equals("")) {
            studentList = session.createQuery("from Student where lastName like '" + args[1] + "%'").list();
            System.out.println(studentList);
            return studentList;

        } else {
            studentList = session.createQuery("from Student ").list();
            System.out.println(studentList);
            return studentList;
        }
    }
}
