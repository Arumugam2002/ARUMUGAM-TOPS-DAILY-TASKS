import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashTableExample {

	public static void main(String[] args)
	{
		Map map = new Hashtable();
		
		
		map.put(1, "c");
		
		map.put(2, "c++");
		map.put("java", 3);
		map.put(1.4, "php");
		map.put(true, "python");
		map.put(15, "java");
		
		System.out.println(map);
		
		
		/* Conversion of map to set */
		Set set = map.entrySet();
		
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry = (Entry)itr.next();
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
	
}
