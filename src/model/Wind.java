package model;

public class Wind extends Instrument{
	
	private Material material;
	
	public Wind( int width, int height, int length,String iD,State state,Provider provider,Material material){
		super(width,height,length,iD,state,provider);
		this.material=material;
	}

	public String toString(){
		String msg;
		msg=				   "	Wind instruments\n\n" +
							   "		Dimensions\n"+
							   "Width: " + width + "\n" +
							   "Height: " + height + "\n" +
							   "Width: " + length + "\n" +
							   "		ID Reference\n"+
							   "ID: " + iD + "\n\n" +
							   "		  State\n"+
							   "State: " + state + "\n\n" +
							   "		Provider\n"+
							   "Provier name: " + provider.getName() + "\n" +
							   "Provier phone number: " +provider.getPhone() + "\n" +
							   "Provier adress: " + provider.getAdress() + "\n\n" +
							   "		Characteristics\n" +
							   "Material: " + material + "\n\n";
		return msg;
	}
	
}
