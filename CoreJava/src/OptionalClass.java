import java.util.Optional;

import com.awesome.dao.UserDAO;
import com.awesome.exception.UserNotFoundException;
import com.awesome.pojo.User;


public class OptionalClass {
	
	public static void main(String[] args) {
		
		UserDAO dao	= new UserDAO();
		
		Optional<User> optional = dao.findUserOptional("101");
		
		User user = optional.orElseThrow( () -> new UserNotFoundException("User Not Found"));
		
		System.out.println(user.getName());
	}
}


//public class OptionalClass {
//	
//	public static void main(String[] args) {
//		
//		UserDAO dao	= new UserDAO();
//		
//		Optional<User> optional = dao.findUserOptional("103");
//		
//		User user = optional.orElseGet(()-> new User("103", "Shuai", "sh@gmail.com"));
//	
//		System.out.println(user.getName());
//	}
//}



//public class OptionalClass {
//	
//	public static void main(String[] args) {
//		
//		UserDAO dao	= new UserDAO();
//		
//		Optional<User> optional = dao.findUserOptional("103");
//	
//		System.out.println(optional.orElseThrow());
//	}
//}



//public class OptionalClass {
//	
//	public static void main(String[] args) {
//		
//		UserDAO dao	= new UserDAO();
//		
//		Optional<User> optional = dao.findUserOptional("101");
//		
//		if( optional.isPresent() ) {
//			User user = optional.get();
//			System.out.println(user.getUserId()+", "+user.getName());
//		}
//		
//		else {
//			System.out.println("User not found");
//		}	
//	}
//}



//public class OptionalClass {
//	
//	public static void main(String[] args) {
//		
//		UserDAO dao	= new UserDAO();
//		
//		Object user = dao.findUser("102");
//		
//		if( user != null ) {
//			
//			System.out.println(((User)user).getName());
//		}
//		else {
//			System.out.println("User not Found");
//		}
//	}
//}
