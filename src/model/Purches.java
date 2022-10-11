package model;

public class Purches {

	public Purches(int pId, String pName, String uName, String status, String date) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.uName = uName;
		this.status = status;
		this.date = date;
	}
	public Purches() {
		// TODO Auto-generated constructor stub
	}
	private int pId;
	private String pName;
	
	private String uName;
	private String	status;
	private String	date;
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
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
