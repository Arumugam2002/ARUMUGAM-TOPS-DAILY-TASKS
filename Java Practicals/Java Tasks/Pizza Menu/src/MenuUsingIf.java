

import java.util.Scanner;

public class MenuUsingIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Type of pizza ");
		System.out.println("\n1 for small size (150) [Buy 5 & Get 500 ml coke]");
		System.out.println("2 for medium size (250) [Buy 4 & Get 1 lt coke]");
		System.out.println("3 for large size (500)[Buy 3 & Get 1 lt coke + ice cream]");
		System.out.println("4 for small size (700)[Buy 2 & Get 2 lt coke + ice cream]");
		int grand_total=0;
		char a;
		do {
			System.out.print("Pls enter your choice of pizza : ");
			int c = sc.nextInt();
			if(c>=1 && c<=4)
			{
				if(c==1)
				{
					System.out.println("You Selected small size pizza");
					byte q= sc.nextByte();
					if(q>=5)
					{
						int free_item = q/5;
						System.out.println("500 lt coke free : "+free_item);
					}
					int total=150*q;
				 grand_total += total;
				}
				
				else if(c==2)
				{
					System.out.println("You Selected medium size pizza");
					byte q= sc.nextByte();
					if(q>=4)
					{
						int free_item = q/4;
						System.out.println("1 lt coke free : "+free_item);
					}
					int total=250*q;
				 grand_total += total;
				}
				
				else if(c==3)
				{
					System.out.println("You Selected large size pizza");
					byte q= sc.nextByte();
					if(q>=3)
					{
						int free_item = q/3;
						System.out.println("1 lt coke free and ice cream : "+free_item+ "Iteams");
					}
					int total=500*q;
				 grand_total += total;
				}
				
				else if(c==4)
				{
					System.out.println("You Selected monster size pizza");
					byte q= sc.nextByte();
					if(q>=2)
					{
						int free_item = q/2;
						System.out.println("1 lt coke free and ice cream : "+free_item+"Iteams");
					}
					int total=700*q;
				 grand_total += total;
				}
			}
			else
			{
				System.out.println("pls enter valid choice....");
			}
			System.out.println("Do you wanna continue ");
			a = sc.next().charAt(0);
			
		} while (a == 'y');
		
			
			System.out.println("Your toatal bill is : "+grand_total+"\n Enjoy your meal....");
			
			sc.close();
	}

}