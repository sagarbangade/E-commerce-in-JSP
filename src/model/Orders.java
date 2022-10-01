package model;

public class Orders {
	public Orders(String oName) {
		super();
		this.oName = oName;
	}

	public Orders(int oId, String oName) {
		super();
		this.oId = oId;
		this.oName = oName;
	}
	
	
	private int oId;
	private String oName;
	
	
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	

}
