import java.util.Scanner;

public class TaskService {

	private TaskDAO taskDAO = new TaskDAO();

	private Scanner sc = new Scanner(System.in);

//	public void saveTask() {
//
//		System.out.println("Enter Task Id");
//		int taskId = sc.nextInt();
//
//		System.out.println("Enter Task Name");
//		String tasKName = sc.next();
//
//		System.out.println("Enter the Labour Amount");
//		int labourAmount = sc.nextInt();
//
//		taskDAO.addTask(taskId, tasKName, labourAmount);
//	}
	
	
	public void saveTask() {

		System.out.println("Enter Task Id");
		int taskId = sc.nextInt();

		System.out.println("Enter Task Name");
		String tasKName = sc.next();

		System.out.println("Enter the Labour Amount");
		int labourAmount = sc.nextInt();
		
		Task task = new Task(taskId, tasKName, labourAmount);

		taskDAO.addTask(task);
	}
	
	
	
//	public void deleteTask() {
//		
//		System.out.println("Enter the Task Id to delete the Task!!");
//		int deleteTaskId = sc.nextInt();
//
//		boolean deleteStatus = taskDAO.deleteTask(deleteTaskId);
//		
//		if(deleteStatus == true) {
//			System.out.println("Deleted Successfully...");
//		}
//		else {
//			System.out.println("Deleted Not Successfully...");
//		}
//	}

	public void deleteTask() {

		System.out.println("Enter the Task Id to delete the Task!!");
		int deleteTaskId = sc.nextInt();
		
		Task task = taskDAO.findTask(deleteTaskId);

		if(task != null) {
			
			if(task.getLabourAmount() > 100000  && task.getTaskId() > 101) {
				
				boolean deleteStatus = taskDAO.deleteTask(deleteTaskId);

				if (deleteStatus == true) {
					System.out.println("Deleted Successfully...");
				} 
			}
			else {
				System.out.println("Task Can not be deleted...");
			}
		}
		else {
			System.out.println("Could not find the Task by the Task Id provided...");
		}
	}

}
