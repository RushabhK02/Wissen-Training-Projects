package strategy;

import java.util.ArrayList;

public class LTFS implements Strategy {

	@Override
	public Task getNext(ArrayList<Task> taskList) {
		Task task = taskList.get(0);
		int LongestDuration = task.getTaskDuration(); 
		for (int index = 1; index < taskList.size(); index++) {
			if(LongestDuration<taskList.get(index).getTaskDuration()) {
				LongestDuration=taskList.get(index).getTaskDuration();
				task=taskList.get(index);
			}
		}
		return task;
	}

}
