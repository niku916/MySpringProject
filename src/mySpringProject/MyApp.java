package mySpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import mySpringProject.Utility.Address;

public class MyApp {

	public static void main(String[] args) {

		/*
		 * ApplicationContext is a interface and its implementation class both are use
		 * to Read the XML file form its location and as its configuration its return
		 * the object for the given class
		 */
		ApplicationContext myContainer = new FileSystemXmlApplicationContext(
				"D:\\MySpringProject\\MySpringProject\\spring.xml");

		
		
		Object myObj = myContainer.getBean("address1");

		/* type cast myObj to our Address classs Type */

		Address a = (Address) myObj;

	}
}
