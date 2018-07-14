package strategy;

import java.util.ArrayList;

interface Strategy {
	Task getNext(ArrayList<Task> taskList);
}
