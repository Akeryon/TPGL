import java.util.*;

public class Panier
{
	private ArrayList<Orange> LesOranges = new ArrayList<Orange>();
	private int NMAX=10;
	private int N=0;

	public Panier()
	{
			
	}
	public void ajoutOrange(Orange o)
	{
		if (N+1>NMAX)
		{
		}
		else
		{
		LesOranges.add(o);
		System.out.println("L'orange à été ajouté");
		System.out.println(o.toString());
		}
	
	
	}
	public void retireOrange(Orange o)
	{
		
		}
				
}
	
	
	}
public void ToString()
{


}

public static void main (String[] args)
{
	Panier p=new Panier();
	Orange o= new Orange(4,"France");
	p.ajoutOrange(o);

}
}