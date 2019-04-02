
public class MusicInstrument {
	protected int volume = 0;
	protected String name = "Instrument muzyczny";
	protected float value = 0;
	protected String type = "Typowy";
	protected int[] bands = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	
	public MusicInstrument() {
		
	}
	
	public MusicInstrument(int volume, String name, float value, String type) {
		super();
		this.volume = volume;
		this.name = name;
		this.value = value;
		this.type = type;
	}
	
	public MusicInstrument(MusicInstrument mInstrument) {		
		this(mInstrument.volume, mInstrument.name, mInstrument.value, mInstrument.type);
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + Float.floatToIntBits(value);
		result = prime * result + volume;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MusicInstrument other = (MusicInstrument) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (Float.floatToIntBits(value) != Float.floatToIntBits(other.value))
			return false;
		if (volume != other.volume)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MusicInstrument [volume=" + volume + ", name=" + name + ", value=" + value + ", type=" + type + "]";
	}
	

	
}
