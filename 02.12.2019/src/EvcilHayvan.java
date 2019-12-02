
public class EvcilHayvan {

	EvcilHayvan(String isim)
	{
		this.isim=isim;
		
	}
	private String isim;
	
	 String oyna()
	{
		return this.isim+ "oynamaktan yoruldu";	
		}
	public String getIsim() 
	{
		return isim;
	}
	public void setIsim(String isim) 
	{
		this.isim = isim;
	}
	
}
