package ir.maktab.model.dao;

import java.util.List;

public interface StudentDAO {

    public void insert(Teacher teacher);
    public void delete(String teacheCode);
    public void update(Teacher teacher);
    public Teacher find(String... args);
    public List<Teacher> findAll(String... args);

}
