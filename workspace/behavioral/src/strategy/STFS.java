package strategy;

import java.util.ArrayList;

public class STFS implements Strategy {
	@Override
	public Task getNext(ArrayList<Task> taskList) {
		Task task = taskList.get(0);
		int ShortestDuration = task.getTaskDuration(); 
		for (int index = 1; index < taskList.size(); index++) {
			if(ShortestDuration>taskList.get(index).getTaskDuration()) {
				ShortestDuration=taskList.get(index).getTaskDuration();
				task=taskList.get(index);
			}
		}
		return task;
	}

}
