public class Orange
{
	double prix;
	String origine;

	public Orange(double p, String o)
	{
		
		if(p<0)
		this.prix=-p;
		else
		this.prix =p;
		this.origine = o;

	}

	public double getPrix()
	{
		return this.prix;
	}
	public String getOrigine()
	{
		return this.origine;
	}
	
	public String toString()
	{
		return "Ceci est une orange au prix de "+getPrix()+" D'origine : "+ getOrigine();	
	}
	public static void main (String[] args)
{
	Orange o= new Orange(-4,"France");
	System.out.println(o.toString());

}
}

