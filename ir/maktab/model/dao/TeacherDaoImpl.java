package ir.maktab.model.dao;

import ir.maktab.model.dbconnector.DbConnector;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TeacherDaoImpl implements TeacherDAO {
    static Session session = DbConnector.getSession();

    @Override
    public void insert(Teacher teacher) {
        session = DbConnector.getSession();
        session.save(teacher);
        session.getTransaction();
        session.close();
    }

    @Override
    public void delete(String teacheCode) {
        System.out.println(session.isOpen());
        Transaction transaction = session.beginTransaction();
        if (find(teacheCode) != null) {
            try {
                session.createQuery("delete from Teacher where teacherCode=" + teacheCode).executeUpdate();
                transaction.commit();

            } catch (Throwable t) {
                transaction.rollback();
                System.out.println("Can not Delete Teacher ");
                throw t;
            }
        }


    }

    @Override
    public void update(String teacherCode, Teacher teacher) {
        Teacher th = find(teacherCode);
        Transaction transaction = session.beginTransaction();
        if (th != null) {
            try {
                session.createQuery("update Teacher set firstName = '" + teacher.getFirstName() + "', lastName =  '" + teacher.getLastName() + "' , salary =" + teacher.getSalary() + " , birthDay= '" + teacher.getBirthDay() + "'  where teacherCode= " + teacherCode).executeUpdate();
                transaction.commit();

            } catch (Throwable t) {
                transaction.rollback();
                System.out.println("Can not Update Teacher " + th);
                throw t;
            }

        }

    }

    @Override
    public Teacher find(String... args) {
        Teacher th = null;
        if (args.length == 1) {
            th = (Teacher) session.createQuery("select th from Teacher th where th.teacherCode=" + args[0]).getSingleResult();
            System.out.println(th);
            return th;
        } else if (args.length == 2) {
            th = (Teacher) session.createQuery("select th from Teacher th where firstName='" + args[0] + "' and lastName = '" + args[1] + "'").getSingleResult();
            return th;
        }
        System.out.println("Not Found Teacher (return null)");
        return th;
    }


    //if arg[0] & arg[1] != "" out like first name and like last name execute
    // if arg[0] !="" and arg[1] ==""  out like first name execute
    //if arg[0] =="" and arg[1] !=""  out like last name execute
    //else out  all Teacher

    @Override
    public List<Teacher> findAll(String... args) {
        List<Teacher> teacherList = new ArrayList<>();

        if (!args[0].equals("") && !args[1].equals("")) {
            teacherList = session.createQuery("from Teacher th where th.firstName like '" + args[0] + "%' and th.lastName like '" + args[1] + "%'").list();
            System.out.println(teacherList);
            return teacherList;

        } else if (!args[0].equals("")) {
            teacherList = session.createQuery("from Teacher where firstName like '" + args[0] + "%'").list();
            System.out.println(teacherList);
            return teacherList;

        } else if (!args[1].equals("")) {
            teacherList = session.createQuery("from Teacher where lastName like '" + args[1] + "%'").list();
            System.out.println(teacherList);
            return teacherList;

        } else {
            teacherList = session.createQuery("from Teacher ").list();
            System.out.println(teacherList);
            return teacherList;
        }
    }

    public void getSalaryMaxMin(){
        findAll();

    }
}

