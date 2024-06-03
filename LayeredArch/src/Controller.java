import java.util.Scanner;

public class Controller {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		TaskService taskService = new TaskService();
		
		while(flag) {
			
			System.out.println("Enter input \nEnter 1 for Add Task \nEnter 2 for delete Task \nEnter 0 for Exit");
			
			int mainMenuInput = sc.nextInt();
			
			switch (mainMenuInput) {
			case 1: 
				
				taskService.saveTask();
				
				break;
				
			case 2:
				
				taskService.deleteTask();
				
				break;
				
			case 0:
				
				flag = false;
				break;
			}
		}
	}
}


//public class Controller {
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		boolean flag = true;
//		
//		TaskDAO taskDAO = new TaskDAO();
//		
//		while(flag) {
//			
//			System.out.println("Enter input \nEnter 1 for Add Task \nEnter 2 for delete Task \nEnter 0 for Exit");
//			
//			int mainMenuInput = sc.nextInt();
//			
//			switch (mainMenuInput) {
//			case 1: 
//				
//				System.out.println("Enter Task Id");
//				int taskId = sc.nextInt();
//				
//				System.out.println("Enter Task Name");
//				String tasKName = sc.next();
//				
//				taskDAO.addTask(taskId, tasKName);	
//				break;
//				
//			case 2:
//				
//				System.out.println("Enter the Task Id to delete the Task!!");
//				int deleteTaskId = sc.nextInt();
//		
//				boolean deleteStatus = taskDAO.deleteTask(deleteTaskId);
//				
//				if(deleteStatus == true) {
//					System.out.println("Deleted Successfully...");
//				}
//				else {
//					System.out.println("Deleted Not Successfully...");
//				}
//				break;
//				
//			case 0:
//				flag = false;
//				break;
//			}
//		}
//		
//		
//	}
//
//}


//public class Controller {
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		boolean flag = true;
//		
//		TaskDAO taskDAO = new TaskDAO();
//		
//		while(flag) {
//			
//			System.out.println("Enter input \nEnter 1 for Add Task \nEnter 2 for delete Task \nEnter 0 for Exit");
//			
//			int mainMenuInput = sc.nextInt();
//			
//			switch (mainMenuInput) {
//			case 1: 
//				
//				System.out.println("Enter Task Id");
//				int taskId = sc.nextInt();
//				
//				System.out.println("Enter Task Name");
//				String tasKName = sc.next();
//				
//				taskDAO.addTask(taskId, tasKName);	
//				break;
//				
//			case 2:
//				
//				System.out.println("Enter the Task Id to delete the Task!!");
//				int deleteTaskId = sc.nextInt();
//		
//				String deleteStatus = taskDAO.deleteTask(deleteTaskId);
//				
//				if(deleteStatus.equals("Deleted")) {
//					System.out.println("Deleted Successfully...");
//				}
//				else {
//					System.out.println("Deleted Not Successfully...");
//				}
//				break;
//				
//			case 0:
//				flag = false;
//				break;
//			}
//		}
//		
//		
//	}
//
//}

