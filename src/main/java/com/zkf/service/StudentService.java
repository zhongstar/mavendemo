package com.zkf.service;

import com.zkf.dao.StudentDao;
import com.zkf.model.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zkf on 2017/3/27
 */
@Service("studentService")
public class StudentService {

    @Resource(name = "studentDao")
    private StudentDao dao;

    public List<Student> getAllStudent() {
        return dao.findAll();
    }
}