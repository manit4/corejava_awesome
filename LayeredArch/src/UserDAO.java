
public class UserDAO {
	
	User[] users = new User[2];
	
	public User findUser(String username, String password) {
		
		User user = null;
	
		for(User value : users) {
			
			if(value.getUsername().equals(username) && value.getPassword().equals(password)) {
				
				user = value;
				break;
			}
		}
		return user;
	}
	
	public boolean addUser(User user) {
		
		int counter = 0;
		boolean status = false;
		
		for(User value : users) {
			
			if(value == null) {
				
				users[counter] = user;
				status = true;
				break;
			}
			counter++;
		}
		
		for(User value : users) {
			
			System.out.println(value);
		}
		return status;
	}
}
