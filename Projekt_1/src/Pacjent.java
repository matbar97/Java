import java.util.Arrays;
import java.util.List;

public class Pacjent implements Comparable<Pacjent> 
{
	
	private String mImie, mNazwisko, mPESEL, P³eæ, Ubezpieczenie;
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

	public String getP³eæ() {
		return P³eæ;
	}

	public void setP³eæ(String p³eæ) {
		P³eæ = p³eæ;
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
		return "Pacjent [mImie=" + mImie + ", mNazwisko=" + mNazwisko + ", mPESEL=" + mPESEL + ", P³eæ=" + P³eæ
				+ ", Ubezpieczenie=" + Ubezpieczenie + "]";
	}






	
	

}
