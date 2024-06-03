package manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	private int eid;
	
	private String name;
	@ManyToMany
	private List<Project> pro_list;
	
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Project> getPro_list() {
		return pro_list;
	}
	public void setPro_list(List<Project> pro_list) {
		this.pro_list = pro_list;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", pro_list=" + pro_list + "]";
	}
	
	
}
