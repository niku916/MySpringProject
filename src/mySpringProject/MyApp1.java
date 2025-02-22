package mySpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import mySpringProject.Utility.OrderInfo;
import mySpringProject.Utility.Productinfor;

public class MyApp1 {

	public static void main(String[] args) {
		ApplicationContext container1 = new FileSystemXmlApplicationContext(
				"D:\\MySpringProject\\MySpringProject\\spring.xml");

		Productinfor p = (Productinfor) container1.getBean("pobj");
		System.out.println(p.toString());
		Productinfor p1 = (Productinfor) container1.getBean("pobj1");
		System.out.println(p1.toString());
		
		OrderInfo o = (OrderInfo) container1.getBean("oobj1");
		System.out.println(o.toString());
	}

}
