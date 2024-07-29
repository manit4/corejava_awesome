package com.example;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Laptop;
import com.example.entity.Student;
import com.example.entity.User;
import com.example.repository.LaptopRepository;
import com.example.repository.StudentRepository;
import com.example.repository.UserRepository;

@SpringBootApplication
public class BootJpaApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	LaptopRepository laptopRepository;

	public static void main(String[] args) {
		SpringApplication.run(BootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		User user = new User("eileen@1234", "1234", "eileen2@gmail.com");
//		
//		userRepository.save(user);

//		List<User> users = userRepository.findAll();
//		
//		users.forEach(user -> System.out.println(user.getUsername()+", "+user.getName()));
//		
//		System.out.println("No of users are "+userRepository.count());

		// User user = new User("eileen@1", "12345", "eileen21@gmail.com");
//		
//		userRepository.save(user);

		// userRepository.deleteById("eileen@123");

		// userRepository.delete(user);

//		User user1 = new User("lau@123", "123", "Laurene");
//		User user2 = new User("Xi@123", "234", "Xi Wang");
//		
//		List<User> users = new ArrayList<>();   users.add(user1);  users.add(user2);
//		
//		userRepository.saveAll(users);

//		Sort sort = Sort.by(Sort.Direction.DESC, "name");
//		
//		userRepository.findAll(sort).forEach(user -> System.out.println(user.getName()));;

//		Pageable pageable = Pageable.ofSize(1);
//		
//		Page<User> page = userRepository.findAll(pageable);
//		
//		System.out.println(page.getTotalPages());

//		page.forEach(user -> System.out.println(user.getName()+", "+user.getUsername()));

//		List<User> users = userRepository.findAll();
//		
//		
//		users.stream().filter( user -> {
//			
//			if( user.getName().equals("Xi") && user.getPassword().equals("123")) {
//				return true;
//			}
//			else {
//				return false;
//				
//			}
//		}).forEach(val -> System.out.println(val));

//		List<User> users = userRepository.findByUsernameAndPassword("lau@123", "123");
//		
//		users.forEach(user -> System.out.println(user.getName()+", "+user.getPassword()));

//		List<User> users = userRepository.findByPasswordLessThan("12345");
//		users.forEach(user -> System.out.println(user.getName()+", "+user.getPassword()));

//		List<User> users = userRepository.findByPasswordLessThanEqual("12345");
//		users.forEach(user -> System.out.println(user.getName()+", "+user.getPassword()));

//		User user = new User("eileen@1234", "1234", "Eileen");
//		User user = new User("laurene@1234", null, "Laurene Dai");

//		User user = new User("1", "laurene@1234", "123", "Laurene Dai");
//		User user = new User(null, "234", "Jingjing Bai");
//		
//		userRepository.save(user);

		// userRepository.fetchAllUsers().forEach(user ->
		// System.out.println(user.getUsername()+", "+user.getName()));

		// System.out.println(userRepository.getUser(2).getName());
		
		

		//Optional<User> optional = userRepository.fetchUser(2);
		
		

//		if(optional.isPresent()) {
//			
//			System.out.println(optional.get().getName());
//		}
//		else {
//			System.out.println("No Record Found");
//		}

		// System.out.println(optional.orElseThrow( () -> new
		// UserPrincipalNotFoundException(null) ).getName());

		// --------------------mapping-----------------------------

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter Student Id");
//		String studentId = sc.next();
//		
//		System.out.println("Enter your Name");
//		String name = sc.next();
//		
//		Student student = new Student(studentId, name);
//		
//		//---------------Laptop Details------------
//		
//		System.out.println("Enter Laptop Id");
//		String laptopId = sc.next();
//		
//		System.out.println("Enter Price");
//		int price = sc.nextInt();
//		
//		Laptop laptop = new Laptop(laptopId, price, studentId);
//		
//		studentRepository.save(student);
//		
//		laptopRepository.save(laptop);
		
		

//		Optional<Student> optional2 = studentRepository.findById("100");
//		
//		System.out.println(optional2.get().getName());
//		
//		
//		Optional<Laptop> optional3 = laptopRepository.findById("l_1");
//		
//		System.out.println(optional3.get().getPrice());
		
		
		
		
		
		

//		Optional<Student> optional2 = studentRepository.findById("100");
//
//		System.out.println(optional2.get().getName());
//
//		Optional<Laptop> optional3 = laptopRepository.findByStudentId("100");
//
//		System.out.println(optional3.get().getPrice());
		
		
		
		
		
		
		
		
		
		
		
		//-----fetching and manipulating table' data with JPA Mappings...
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter Student Id");
//		String studentId = sc.next();
//		
//		System.out.println("Enter your Name");
//		String name = sc.next();
//		
//		//---------------Laptop Details------------
//		
//		System.out.println("Enter Laptop Id");
//		String laptopId = sc.next();
//		
//		System.out.println("Enter Price");
//		int price = sc.nextInt();
//		
//		Laptop laptop = new Laptop(laptopId, price, null);
//		
//		Student student = new Student(studentId, name, laptop);
//		laptop.setStudent(student);		
//		
//		
//		studentRepository.save(student);		

		
		
		
		
		
//		Optional<Student> optional = studentRepository.findById("101");
//		
//		if( optional.isPresent() ) {
//			
//			System.out.println("Here is  the Student' details "+optional.get().getName());
//			
//			System.out.println("Here is the Laptop' details "+optional.get().getLaptop().getPrice());
//		}
		
		
		
		
//		
//		Optional<Laptop> optional = laptopRepository.findById("l_1");
//		
//		if( optional.isPresent() ) {
//			
//			System.out.println(optional.get().getPrice());
//			
//			System.out.println(optional.get().getStudent().getName());
//		}
//		
		
		
		
		
		
		
		studentRepository.deleteById("100");
		
		
		
		
	}

}
