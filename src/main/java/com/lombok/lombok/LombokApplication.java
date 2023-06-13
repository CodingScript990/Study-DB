package com.lombok.lombok;

import com.lombok.lombok.dao.StudentDao;
import com.lombok.lombok.dto.StudentDto;
import com.lombok.lombok.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LombokApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(LombokApplication.class, args);

		StudentDao dao = applicationContext.getBean(StudentDao.class);
//		System.out.println(dao.readStudentsAll());

		// student 인스턴스화
		Student student = new Student();

		// student set add
		student.setName("dave");
		student.setAge(40);
		student.setPhone("010-1111-2222");
		student.setEmail("dave@gmail.com");

		// student add
		dao.createStudent(student);

//		System.out.println(dao.readStudentsAll()); // student add

		// student list
//		System.out.println(dao.readStudent(1L));
//		System.out.println(dao.readStudent(2L));
//		System.out.println(dao.readStudent(3L));
//		System.out.println(dao.readStudent(4L));

		// student xml
		System.out.println(dao.readAllXml());

		// 명명 규칙
		//String someVariable = "camelCase";
		//String some_variable = "snake_case";
	}
}

