import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args)
	{
		Set set = new TreeSet();
		
		set.add(6015);
		set.add(7540);
		set.add(312135);
		set.add(-178);
		set.add(0);
		set.add(-3);
		
		System.out.println(set);
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		} 
	}
	
	
}
