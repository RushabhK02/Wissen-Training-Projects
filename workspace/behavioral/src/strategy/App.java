package strategy;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task task1 = new Task("A", 5);
		Task task2 = new Task("B", 2);
		Task task3 = new Task("C", 10);
		TaskList taskList=new TaskList();
		taskList.addTask(task1);
		taskList.addTask(task2);
		taskList.addTask(task3);
		taskList.setStrategy(new RandomStrategy());
		System.out.println("1: "+taskList.getNext().getTaskName());
		System.out.println("2: "+taskList.getNext().getTaskName());
		System.out.println("3: "+taskList.getNext().getTaskName());
	}

}
