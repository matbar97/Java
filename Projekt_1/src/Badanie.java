
public class Badanie 
{
	private int mLDL, mHDL, mTG;
	private boolean mBadanie;
	public Badanie()
	{
		this(0,0,0);
	}
	public Badanie(int mLDL, int mHDL, int mTG) {
		super();
		this.mLDL = mLDL;
		this.mHDL = mHDL;
		this.mTG = mTG;
	}
	public int getmLDL() {
		return mLDL;
	}
	public void setmLDL(int mLDL) {
		this.mLDL = mLDL;
	}
	public int getmHDL() {
		return mHDL;
	}
	public void setmHDL(int mHDL) {
		this.mHDL = mHDL;
	}
	public int getmTG() {
		return mTG;
	}
	public void setmTG(int mTG) {
		this.mTG = mTG;
	}
	@Override
	public String toString() {
		return "Badanie [mLDL=" + mLDL + ", mHDL=" + mHDL + ", mTG=" + mTG + "]";
	}
	
	
}
