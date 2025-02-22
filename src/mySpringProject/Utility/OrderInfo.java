package mySpringProject.Utility;

import java.util.List;

public class OrderInfo {

	private int OId;
	private List<String> oList;

	public OrderInfo() {
		System.out.println("Oder LIst Created");
	}

	public int getOId() {
		return OId;
	}

	public void setOId(int oId) {
		OId = oId;
	}

	public List<String> getoList() {
		return oList;
	}

	public void setoList(List<String> oList) {
		this.oList = oList;
	}

	@Override
	public String toString() {
		return "OrderInfo [OId=" + OId + ", oList=" + oList + "]";
	}

}
