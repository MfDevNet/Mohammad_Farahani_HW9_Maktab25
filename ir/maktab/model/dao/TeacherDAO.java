package ir.maktab.model.dao;

import java.util.List;

public interface TeacherDAO {
    public void insert(Teacher teacher);
    public void delete(String teacheCode);
    public void update(String teacherCode,Teacher teacher);
    public Teacher find(String... args);
    public List<Teacher> findAll(String... args);

}
