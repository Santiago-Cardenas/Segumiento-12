package model;

public class String_3 extends StringInstrument{

	private Orientation orientation;
	private Box box;
	private Keyboard keyboard;

	public String_3(double width, double height, double length,String iD,State state,Provider provider,Orientation orientation){
		super(width,height,length,iD,state,provider);
		this.orientation=orientation;
	}

	public String toString(){
		String msg;
		msg="	Percussed string instruments\n\n" +
							   "		Dimensions\n"+
							   "Width: " + width + "\n" +
							   "Height: " + height + "\n" +
							   "Width: " + length + "\n\n" +
							   "		ID Reference\n"+
							   "ID: " + iD + "\n\n" +
							   "		  State\n"+
							   "State: " + state + "\n\n" +
							   "		Provider\n"+
							   "Provier name: " + provider.getName() + "\n" +
							   "Provier phone number: " + provider.getPhone() + "\n" +
							   "Provier adress: " + provider.getAdress() + "\n\n" +
							   "		Characteristics\n" +
							   "Orientation: " + orientation + "\n\n";
		return msg;
	}
}
