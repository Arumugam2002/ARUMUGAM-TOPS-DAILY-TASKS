import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args)
	{
		Map map = new HashMap();
		
		map.put(1, "c");
		
		map.put(2, "c++");
		map.put("java", 3);
		map.put(1.4, "php");
		map.put(true, "python");
		map.put(null, "java");
		
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
