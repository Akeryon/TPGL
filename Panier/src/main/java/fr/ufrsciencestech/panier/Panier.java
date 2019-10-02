import java.util.*;

public class Panier
{
	private ArrayList<Orange> LesOranges = new ArrayList<Orange>();
	private int NMAX;
	private int N=0;

	public Panier(int nm)
	{
			this.NMAX = nm;
	}
	
	public boolean ajoute(Orange o)
	{
		if (N+1>NMAX)
		{
			System.out.println("Le panier est plein déso");
			return false;
		}
		else
		{
		LesOranges.add(o);
		this.N++;
		System.out.println("L'orange à été ajouté");
		return true;
		}
	
	}
	
	public void setNMAX(int n)
	{
		this.NMAX=n;
	
	}
	
	public int GetNbOrange()
	{
			return this.N;
	}
	
	
	public boolean IsEmpty()
	{
		if (N==0)return true;
		else return false;	
	}
	public boolean IsFull()
	{
		if(N==NMAX)return true;
		else return false;	
	
	}
	public boolean retire()
	{
			if(N>0)
			{
			LesOranges.remove(--N);
			return true;
			}
			else 
			return false;
	}
	public double GetPrix()
	{
		double s =0;
		for (int i = 0; i < this.N; i++)
		{
			s+=LesOranges.get(i).getPrix(); 		
		
		}
		return s;
	}
        
        public boolean equals(Panier p)
        {
            if (p.GetPrix()==GetPrix()&&p.GetNbOrange()==GetNbOrange())
            {
              // Collections.sort(LesOranges);
               for (int i =0; i < N ; i++)
               {
                   if(LesOranges.get(i)!=p.LesOranges.get(i))
                   {
                       return false;
                   }
                   
               }
               return true;
            }
            return false;
        }
        
	public String ToString()
	{
		String s =" Le panier contient " + GetNbOrange() +" Orange(s) \n";
		for(int i =0; i<N; i++)
		{
			s += LesOranges.get(i).toString();
			s+=("\n");	
		}
		s+= "Le prix du panier total est de : " +GetPrix();
		return s;
	}
        public void boycotteOrigine(String s)
        {
            for(int i =0; i<N; i++)
		{
			if (LesOranges.get(i).getOrigine().equals(s))
                        {
                            LesOranges.remove(i--);
                            N--;
                        }
		}
            
            
        }

public static void main (String[] args)
{
	Panier p = new Panier(5);
        Panier p2 = new Panier(5);
        Panier p3 = new Panier(5);
	Orange o = new Orange(4,"France");
	Orange o1 = new Orange(3.75,"Espagne");
        Orange o3 = new Orange(4,"France");
	Orange o2 = new Orange(0.49,"Maroc");
        Orange o4 = new Orange(4,"France");
	p.ajoute(o);
	p.ajoute(o1);
	p.ajoute(o2);
        p.ajoute(o3);
        p.ajoute(o4);
        p2.ajoute(o);
	p2.ajoute(o1);
	p2.ajoute(o2);
        p2.ajoute(o3);
        p2.ajoute(o4);
        p3.ajoute(o);
	p3.ajoute(o1);
	p3.ajoute(o2);
        p3.ajoute(o3);
        p3.ajoute(o4);
	System.out.println(p.ToString());
	
	p.retire();
	System.out.println(p.ToString());
	p.ajoute(o2);
        System.out.println(p.ToString());
        p.boycotteOrigine("France");
        System.out.println(p.ToString());
        if (p.equals(p2))
        {
            System.out.println("Les deux paniers sont équivalents");
            
        }
         if (p3.equals(p2))
        {
            System.out.println("Les deux paniers sont équivalents");
            
        }
}
}