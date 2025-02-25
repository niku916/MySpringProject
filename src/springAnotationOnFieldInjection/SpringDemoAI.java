package springAnotationOnFieldInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemoAI {

	public static void main(String[] args) {
		ApplicationContext container= new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Student student= (Student) container.getBean("student");
		System.out.println(student);
		System.out.println(student.address);

	}

}
