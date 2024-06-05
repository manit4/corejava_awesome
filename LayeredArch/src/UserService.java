import java.util.Scanner;

public class UserService {
	
	Scanner sc = new Scanner(System.in);
	
	UserDAO userDAO = new UserDAO();
	
	public void register() {
		
		System.out.println("Enter the Username");
		String username = sc.next();
		
		System.out.println("Enter the Password");
		String password = sc.next();
		
		System.out.println("enter the name");
		String name = sc.next();
		
		System.out.println("enter the role");
		String role = sc.next();
		
		User user = new User(username, password, name, role);
		boolean status = userDAO.addUser(user);
		
		if(status == true) {
			
			System.out.println("User Regsiter Successfully");
		}
		else {
			
			System.out.println("Not Added Successfully");
		}
	}
	
	public void login() {
		
		System.out.println("Enter the username"); 
		String username = sc.next();
		
		System.out.println("enter the password");
		String password = sc.next();
		
		User user = userDAO.findUser(username, password);
		
		if(user != null) {
			
			if(user.getRole().equals("Client")) {
				
				System.out.println("You can display the complete Menu");
			}
			else {
				System.out.println("You can display the options to the visitor");
			}
		}
		else {
			
			System.out.println("User not Found...");
		}
	}

}
