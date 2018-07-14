package strategy;
import java.util.*;

public class TaskList {
	private ArrayList<Task> taskList=new ArrayList<Task>();
	private Strategy strategy=new FCFS();
	
	public void setStrategy(Strategy strategy) {
		this.strategy=strategy;
	}
	
	public Task getNext() {
		Task task=strategy.getNext(taskList);
		this.removeTask(task);
		return task;
	}
	
	public void addTask(Task task) {
		taskList.add(task);
	}
	
	public void removeTask(Task task) {
		taskList.remove(task);
	}
}
