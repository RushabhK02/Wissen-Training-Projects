package container;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Container {
	public void processRequest(String url, String username, String password) {

		Class<?> classname;
		try {
			classname = Class.forName("component.Component");
			Object comp = classname.newInstance();

			Method[] methods = classname.getMethods();
			for (Method method : methods) {
				RequestMapping rm = null;
				rm = method.getAnnotation(RequestMapping.class);
				if (rm != null) {
					String givenUrl = rm.url();
					if (givenUrl.equals(url)) {
						method.invoke(comp, username, password);

					}
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
