package collectionType;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {

	private int id;
	
	private String name;
	
	private Set<String> address;
	
	private List<Long> contact;
	
	private Map<Integer, String> data;	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int id, String name, Set<String> address, List<Long> contact, Map<Integer, String> data) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.data = data;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public List<Long> getContact() {
		return contact;
	}

	public void setContact(List<Long> contact) {
		this.contact = contact;
	}

	public Map<Integer, String> getData() {
		return data;
	}

	public void setData(Map<Integer, String> data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact + ", data=" + data
				+ "]";
	}

}
