package strategy;

import java.util.ArrayList;

public class FCFS implements Strategy {
	@Override
	public Task getNext(ArrayList<Task> taskList) {
		return taskList.get(0);
	}
}
