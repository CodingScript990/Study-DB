package com.lombok.lombok.mapper;

import com.lombok.lombok.model.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

// Interface
@Mapper // MyBatis 가 Mapper 가 붙은 클래스를 DB 통신에 사용할 준비를 의미한다
public interface StudentMapper {
    // Insert into students (name, age, phone, email)
    // values(?, ?, ?, ?);
    // insert method
    @Insert("insert into students (name, age, phone, email) values(#{name}, #{age}, #{phone}, #{email})")
    void insertStudent(Student student);

    // select * from students; 를 실행할 Method 를 만드는데
    // 복수개의 Students 를 반환하게 하는 return type -> List<Student>
    @Select("select * from students")
    List<Student> selectStudentAll();

    // select where => id
    // select method
    @Select("select * from students where id = #{id}")
    Student selectStudent(Long id);

    // Update method
    @Update("update students set name = #{name}, age = #{age}, phone = #{phone}, email = #{email} where id = #{id}")
    void updateStudent(Student student);

    // Delete method
    @Delete("delete from students where id = #{id}")
    void deleteStudent(Long id);

    // dml select, insert, update, delete
    //@Insert()
    //@Update()
    //@Delete()
}
