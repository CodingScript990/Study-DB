package com.lombok.lombok.dao;

import com.lombok.lombok.mapper.StudentMapper;
import com.lombok.lombok.mapper.StudentXmlMapper;
import com.lombok.lombok.model.Student;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

// Dao
@Repository
@RequiredArgsConstructor
public class StudentDao {
    // Member Field
    private final SqlSessionFactory sessionFactory;

    // StudentDao Constructor => SqlSessionFactory
//    public StudentDao(SqlSessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }

    // createStudent method
    public void createStudent(Student student) {
        // try 예외처리
        try (SqlSession session = sessionFactory.openSession()) {
            StudentMapper studentMapper = session.getMapper(StudentMapper.class);
            studentMapper.insertStudent(student);
        }
    }

    // readStudentsAll method
    public List<Student> readStudentsAll() {
        try(SqlSession session = sessionFactory.openSession()) {
            StudentMapper studentMapper = session.getMapper(StudentMapper.class);
            return studentMapper.selectStudentAll();
        }
    }

    // readStudent method
    public Student readStudent(Long id) {
        try (SqlSession session = sessionFactory.openSession()) {
            StudentMapper studentMapper = session.getMapper(StudentMapper.class);
            return studentMapper.selectStudent(id);
        }
    }

    // readAllXml method
    public List<Student> readAllXml() {
        try (SqlSession session = sessionFactory.openSession()) {
            StudentXmlMapper studentMapper = session.getMapper(StudentXmlMapper.class);
            return studentMapper.selectStudentAll();
        }
    }
}
