package com.zkf.dao;

import com.zkf.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zkf on 2017/3/27 
 */
@Repository("studentDao")
public class StudentDao {

    public List<Student> findAll() {
        List<Student> all = new ArrayList<Student>();
        all.add(new Student("1", "对方答复", 18, true));
        all.add(new Student("2", "充分的 ", 28, true));
        all.add(new Student("3", "zkf", 18, true));
        all.add(new Student("4", "cms", 18, true));
        return all;
    }
}  