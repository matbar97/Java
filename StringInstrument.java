
public class StringInstrument extends MusicInstrument {

	protected int stringnum = 0;
	
	public StringInstrument(int volume, String name, float value, String type, int stringnum) {
		super(volume, name, value, type);
		this.stringnum = stringnum;
	}
	

}
