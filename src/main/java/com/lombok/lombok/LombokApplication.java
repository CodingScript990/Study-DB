package com.lombok.lombok;

import com.lombok.lombok.dto.StudentDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LombokApplication.class, args);
		StudentDto dto = new StudentDto(1L, "test", "test@gmail.com");
		dto.getEmail();
	}
}

