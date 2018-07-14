package strategy;

import java.util.ArrayList;

class RandomStrategy implements Strategy {

	@Override
	public Task getNext(ArrayList<Task> taskList) {
		return taskList.get((int)(Math.random() * ((taskList.size()-1))));
	}

}
