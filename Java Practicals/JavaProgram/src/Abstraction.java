
abstract class RBI {
		abstract public void interest();
		
		abstract public void HL();
		public static void repoRate()
		{
			System.out.println("Repo Rate:- +-4%");
		}
		
		public void call()
		{
			
		}
	}
	
	class SBI extends RBI{
		public void interest()
		{
			System.out.println("SBI interest : 7%");
		}
		
		public void HL()
		{
			System.out.println("SBI HL: 9%");
		}
	}
	
	class PNB extends RBI{
		public void interest()
		{
			System.out.println("PNB interest : 6%");
		}
		
		public void HL()
		{
			System.out.println("PNB HL: 8%");
		}
	}
	
	class JAVA extends RBI{
		public void interest()
		{
			System.out.println("JAVA interest : 9%");
		}
		
		public void HL()
		{
			System.out.println("JAVA HL: 10%");
		}
	}




public class Abstraction {

	
	
	public static void main(String[] args)
	{
		SBI s = new SBI();
		s.interest();
		s.HL();
		
		SBI.repoRate();
		
		PNB p1 = new PNB();
		p1.interest();
		p1.HL();
		
		PNB.repoRate();
		
		
		JAVA j1 = new JAVA();
		j1.interest();
		j1.HL();
		
		JAVA.repoRate();
		
		
		
	}
	
}
