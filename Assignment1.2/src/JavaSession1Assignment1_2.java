
public class JavaSession1Assignment1_2 {

	public static void main(String [] args)
	{
		Expressions e1 = new Expressions();
		e1.show();
		
	}
	
}

class Expressions
{
	    int a,b,c,d,e;
	 
	
	Expressions()
	{
		
	    a = 20;
        b = 10;
		
	}
	
	
	void show()
	{
		

	     b = (a--) - (--a);
	     c = a--;
	     d = a >> 2;
	     e = a & b;
		
	     System.out.println("A: " + a +"\n"+ "B: " + b +"\n"+ "C: " + c+"\n" + "D: " + d+" \n"+"E:"+" "+e);
		
		
		
	}
}