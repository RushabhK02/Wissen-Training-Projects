package component;

import container.RequestMapping;

public class Component {

	@RequestMapping(url = "/login")
	public void doLogin(String username, String password) {
		System.out.println("Logging In...");
		System.out.println("User " + username + " logged in!");
	}

	@RequestMapping(url = "/register")
	public void register(String username, String password) {
		System.out.println("Logging In...");
		System.out.println("User " + username + " does not exist!");
		System.out.println("Registered " + username);
		System.out.println("User " + username + " logged in!");
	}
}
