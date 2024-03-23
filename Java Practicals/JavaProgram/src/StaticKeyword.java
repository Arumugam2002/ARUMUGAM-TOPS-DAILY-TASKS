
class StuData{
	int id;
	String name;
	static String cname = "TOPS";
	
	public StuData(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public void setID(int id)
	{
		this.id = id;
		System.out.println("id: " + id);
	}
	
	public int getID()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
		System.out.println("name: " + name);
	}
	
	public String getName()
	{
			return name;
	}
	
	public void getData()
	{
		System.out.println("id: " + id+ " name:" + name + " cname: " + cname);
	}
	
	public static void call()
	{
		System.out.println("call static function");
	}
}



public class StaticKeyword {
	public static void main(String[] args)
	{
		StuData s1 = new StuData(1, "JAVA");
		s1.getData();
		
		StuData s2 = new StuData(2, "Python");
		s2.getData();
		
		StuData.call();
		//s1.call();
		
		
	}
}
