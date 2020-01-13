//copy right by Shubham (codes have 210 line, my first largest program in java)

import java.util.*;
import java.io.*;

class MyRules
{	
	static boolean valueset;

	public static void main(String args[])throws IOException
	{
		Logic l = new Logic();
		boolean flag = false;
		
		String ch;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("------------------------------------------------------");
		System.out.println("------------- King have following island--------------");
		System.out.println("------------------------------------------------------");
		System.out.println(" Name of Island  " + "   " + " Code NO(USE CODE NO FOR CHOOSING ISLAND)  ");
		System.out.println("------------------------------------------------------------");
		for(int s = 65,m=1;s<=74;m++,s++)
		{
			System.out.println("        " + (char)s + "                     " + m);
		}

		System.out.println("King, whom you want to give first chance to choose Island");
		System.out.println("Type 'P1' for Prince1 and 'P2' for Prince2");
	
 		ch = br.readLine();
		if(ch.equalsIgnoreCase("P1"))
		{
			valueset = false;
			new Prince1(l);
			new Prince2(l);
			flag = true;
		}
		else if(ch.equalsIgnoreCase("P2") )
		{
			valueset = true;
			new Prince2(l);
			new Prince1(l);
			flag = true;
		}
		else
		{
			System.out.println("Wrong prince name choosen");	
		}
	}	
}


class Logic
{	
	int a[];
	int j, p1ISLand= 0, p2ISLand =0, totalIslan=0;
	static int p1[], p2[];
	Logic()
	{
		 a = new int[10];
		 p1 = new int[5];
		 p2 = new int[5];
		 j = 0;
	}
	Scanner sc = new Scanner(System.in);

	synchronized void choosePrince1() throws IOException
	{
		if(MyRules.valueset)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println("Exception caught in get");
			}
		}
		if(j<10)
		{
			System.out.println("			Prince1 Choose island No: ");
			this.logic2();	
			MyRules.valueset = true;
			notify();			
		}
	}

	synchronized void choosePrince2() throws IOException
	{
		if(!MyRules.valueset)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println("Exception caught in get");
			}
		}	
		if(j<10)
		{
			System.out.println("			Prince2 Choose island No: ");
			this.logic2();
			MyRules.valueset = false;
			notify();
			
		}
	}	
	
	synchronized void logic2()
	{
		int z = 0;
		
		outerloop: while(true)
		{
			while(!sc.hasNextInt())
			{
				System.out.println("			This is not a Island Code");
				sc.next();
			}
			z = sc.nextInt();
			
			int i = 0,flag = 0;
			
			if(z==1|| z==2|| z==3|| z==4|| z==5 || z==6|| z==7 || z==8 || z==9 || z==10)
			{
				a[j] = z;
				while(i < a.length)
				{
					if(z == a[i])
					{
						flag++;
					}	
					i++;
				}
				if(flag == 1)
				{
					Thread t = Thread.currentThread();
					String name = t.getName();
					if(name.equals("Prince1")) {
						p1[p1ISLand] = z;
						p1ISLand++;
					} else if(name.equals("Prince2")) {
						p2[p2ISLand] = z;
						p2ISLand++;
					} else {
						// nothing
					}
					System.out.println("			Choosed Island IS yours");
					System.out.println("");
					totalIslan = p2ISLand + p1ISLand;
					System.out.println("totalIslan" +totalIslan);
					if(totalIslan == 10)
					{
						Logic.printSelectedIsland();
					}
					j++;
					break;
				}
				else
				{
					System.out.println("			Island already choosen, Choose another one");
					System.out.println("");
					continue outerloop;	
				}
			}
			else
			{
				System.out.println("			Choose only those island present in the list");
				System.out.println("");
				continue outerloop;
			}	
		}		
	}		
	
	public static void printSelectedIsland() {
		int s = 0;
		System.out.println("Prince1 Selected Island");
		while(s < p1.length) {
			System.out.print(p1[s]);
			System.out.print("\t");
			s++;
		}
		
		s= 0;
		System.out.println("Prince2 Selected Island");
		while(s < p2.length) {
			System.out.print(p2[s]);
			System.out.print("\t");
			s++;
		}
	}
}
		


class Prince1 implements Runnable
{
	Logic l;

	Prince1(Logic l)
	{
		this.l = l;
		new Thread(this,"Prince1").start();
	}
	
	public void run()
	{
		while(l.j<10)
		{	
			try
			{
				//System.out.println("value of j in Prince1 : " + l.j );
				l.choosePrince1();
			}
			catch(Exception e)
			{
				System.out.println("Please enter the COde NO of Island as given above");
			}
		}
	}
}	

class Prince2 implements Runnable
{
	Logic l;
	
	Prince2()
	{	
	
	}
	Prince2(Logic l)
	{
		this.l = l;
		new Thread(this,"Prince2").start();
	}
		
	public void run()
	{
		while(l.j<10)
		{
			try
			{
				//System.out.println("value of j in Prince2 : " + l.j );
				l.choosePrince2();
			}
			catch(Exception e)
			{
				System.out.println("Please enter the COde NO of Island as given above");
			}
		}
	}
}