package allConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Order {

	public static void main(String[] args) {

		ApplicationContext containerOrder = new FileSystemXmlApplicationContext(
				"D:\\MySpringProject\\MySpringProject\\order.xml");
//			Customer customer1= (Customer) containerOrder.getBean("customer");
//			System.out.println(customer1.toString());
			
			Product product1= (Product) containerOrder.getBean("product");
			System.out.println(product1.getId());
			System.out.println(product1.getItemName());
			System.out.println(product1.getCustomer());
			System.out.println(product1.getCart());
//			Cart cart1= (Cart) containerOrder.getBean("cart");
//			System.out.println(cart1);
	}
}
