package com.lombok.lombok.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
// @AllArgsConstructor
// 클래스에 모든 필드에 대한 매개변수를 갖는 생성자를 생성함을 말합니다
// 필드에 대한 값을 지정하여 인스턴스를 생성하는 데 사용할 수 있습니다
@Getter
@Setter
public class StudentDto { // 일반적으로 Data 를 담기 위한 Object
    // Member Field
    private Long id;
    private String name;
    private String email;

    // Constructor
    // Getter, Setter
    // toString
    // equals

}
