import java.util.Arrays;
import java.util.List;

public class Pacjent implements Comparable<Pacjent> 
{
	
	private String mImie, mNazwisko, mPESEL, P�e�, Ubezpieczenie;
	public String getUbezpieczenie() {
		return Ubezpieczenie;
	}


	public void setUbezpieczenie(String ubezpieczenie) 
	{
		Ubezpieczenie = ubezpieczenie;
	}

	public Pacjent()
	{

	}
	
	public Pacjent(String mImie, String mNazwisko, String mPESEL) 
	{
		super();
		this.mImie = mImie;
		this.mNazwisko = mNazwisko;
		this.mPESEL = mPESEL;
	}

	public String getP�e�() {
		return P�e�;
	}

	public void setP�e�(String p�e�) {
		P�e� = p�e�;
	}

	public String getmImie() 
	{
		return mImie;
	}

	public void setmImie(String mImie)
	{
		this.mImie = mImie;
	}

	public String getmNazwisko() 
	{
		return mNazwisko;
	}

	public void setmNazwisko(String mNazwisko) {
		this.mNazwisko = mNazwisko;
	}

	public String getmPESEL() {
		return mPESEL;
	}

	public void setmPESEL(String mPESEL) {
		this.mPESEL = mPESEL;
	}


	public int compareTo(Pacjent other)
	{
		return (this.mPESEL.compareTo(other.mPESEL));

	}

	@Override
	public String toString() 
	{
		return "Pacjent [mImie=" + mImie + ", mNazwisko=" + mNazwisko + ", mPESEL=" + mPESEL + ", P�e�=" + P�e�
				+ ", Ubezpieczenie=" + Ubezpieczenie + "]";
	}






	
	

}
