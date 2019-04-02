
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MusicInstrument m = new MusicInstrument();
		m.setName("Muzyczny");
		System.out.println(m.getName());
		
		StringInstrument guitar = new StringInstrument(15, "Guitar", 20000, "String", 6);
		
		System.out.println(guitar.getName());
		System.out.println(guitar.getValue());
		System.out.println(guitar.getVolume());
	
	}

}
