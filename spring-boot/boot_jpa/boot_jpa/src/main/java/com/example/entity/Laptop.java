package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Laptop {

	@Id
	private String lId;
	private int price;
	
	@OneToOne
	@JoinColumn(name = "s_id")
	private Student student;
}










//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Setter
//@Getter
//public class Laptop {
//
//	@Id
//	private String lId;
//	private int price;
//	private String studentId;
//}
