package com.example.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {

	@Id
	private String sId;
	private String name;
	
	@OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
	private Laptop laptop;
}










//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//public class Student {
//
//	@Id
//	private String sId;
//	private String name;
//}
