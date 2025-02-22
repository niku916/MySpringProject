package mySpringProject.Utility;

public class Productinfor {
	
	private String pName;
	private int pId;
	private double price;
	
	
	
	public Productinfor() {
		System.out.println("Prduct info created");
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {
		return "Productinfor [pName=" + pName + ", pId=" + pId + ", price=" + price + "]";
	}
	
	
	

}
