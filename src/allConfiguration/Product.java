package allConfiguration;

import java.util.List;

public class Product {

	private int id;
	private List<String> itemName;

	private Customer customer;

	private Cart cart;
	

	
	public Product(int id, List<String> itemName, Customer customer, Cart cart) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.customer = customer;
		this.cart = cart;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getItemName() {
		return itemName;
	}

	public void setItemName(List<String> itemName) {
		this.itemName = itemName;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", itemName=" + itemName + ", customer=" + customer + ", cart=" + cart + "]";
	}

	

	

}
