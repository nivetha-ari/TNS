package day_2;

public class Employee {
	private int eId;
	private String ename;
	private String city;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", ename=" + ename + ", city=" + city + "]";
	}
	
	
	
}
