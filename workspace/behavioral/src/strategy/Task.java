package strategy;

public class Task {
	private String taskName;
	private int taskDuration;
	
	public Task(String taskName, int taskDuration) {
		this.taskName=taskName;
		this.taskDuration=taskDuration;
	}
	
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public int getTaskDuration() {
		return taskDuration;
	}
	public void setTaskDuration(int taskDuration) {
		this.taskDuration = taskDuration;
	}
	
}
