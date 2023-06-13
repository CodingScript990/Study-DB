package com.lombok.lombok.mapper;

import com.lombok.lombok.model.Student;

import java.util.List;

public interface StudentXmlMapper {
    // select => All
    List<Student> selectStudentAll();
    // select where id
    Student selectStudent(Long id);
}
