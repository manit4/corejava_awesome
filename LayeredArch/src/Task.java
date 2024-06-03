
public class Task {
	
	private int taskId;
	private String taskName;
	private int labourAmount;
	
	public Task() {
		
	}
	
	public Task(int taskId, String taskName) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
	}
	
	public Task(int taskId, String taskName, int labourAmount) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.labourAmount = labourAmount;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public int getLabourAmount() {
		return labourAmount;
	}
	public void setLabourAmount(int labourAmount) {
		this.labourAmount = labourAmount;
	}
}
