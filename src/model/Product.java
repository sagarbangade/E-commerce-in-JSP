package model;

public class Product {
	public Product(String pName) {
		super();
		this.pName = pName;
	}
	public Product(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}
	private int pId;
	private String pName;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}

}
