package referenceType;

public class Address {

	private int hno;
	private String street;
	
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", street=" + street + "]";
	}
	
	
	
}
