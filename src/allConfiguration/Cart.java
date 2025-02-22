package allConfiguration;

import java.util.Map;
import java.util.Set;

public class Cart {

	private Set<String> itemselect;
	
	private Map<String, Double> itemPrice;
	
	

	public Set<String> getItemselect() {
		return itemselect;
	}

	public void setItemselect(Set<String> itemselect) {
		this.itemselect = itemselect;
	}

	public Map<String, Double> getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Map<String, Double> itemPrice) {
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return "Cart [itemselect=" + itemselect + ", itemPrice=" + itemPrice + "]";
	}
	
	
	
	
	
}
