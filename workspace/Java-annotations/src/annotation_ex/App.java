package annotation_ex;

import container.Container;

public class App {
	public static void main(String[] args) {
		Container container=new Container();
		container.processRequest("/login", "rushk02", "abc123");
		container.processRequest("/register", "rushk02", "abc123");
	}
}
