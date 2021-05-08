package model;

public class Percussion_1 extends Percussion{
	
	public Percussion_1( double width, double height, double length,String iD,State state,Provider provider,String material){
		super(width,height,length,iD,state,provider,material);
	}

	public String toString(){
		String msg;
		msg=				   "	Percussion instruments\n"+
							   "Sound produced by being shaken, rubbed or struck" +"\n\n" +
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
							   "Material: " + material + "\n\n";
		return msg;
	}
}
