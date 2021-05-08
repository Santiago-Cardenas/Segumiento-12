package model;

public class Percussion_2 extends Percussion{

	private Extern_Element element;
	
	public Percussion_2( double width, double height, double length,String iD,State state,Provider provider,String material,Extern_Element element){
		super(width,height,length,iD,state,provider,material);
		this.element=element;
	}

	public String toString(){
		String msg;
		msg=				   "	Percussion instruments\n"+
							   "Sound produced by being rubbed or percussed" +"\n\n" +
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
							   "Provier phone number: " + provider.getPhone() + "\n" +
							   "Provier adress: " + provider.getAdress() + "\n\n" +
							   "		Characteristics\n" +
							   "Material: " + material + "\n\n" +
							   "		Extern Element\n\n" +
							   "		Dimensions\n"+
							   "Width: " + element.getWidth() + "\n" +
							   "Height: " + element.getHeight() + "\n" +
							   "Width: " + element.getLength() + "\n\n" +
							   "		Characteristics\n" +
							   "Material: " + element.getMaterial() + "\n"+
							   "Quantity: " + element.getCnt() + "\n";
		return msg;
	}
}
