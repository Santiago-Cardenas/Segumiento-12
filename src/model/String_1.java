package model;

public class String_1 extends StringInstrument{
	
	private double arcLength;
	private int ropeCnt;
	
	public String_1( double width, double height, double length,String iD,State state,Provider provider,double arcLength,int ropeCnt){
		super(width,height,length,iD,state,provider);
		this.arcLength=arcLength;
		this.ropeCnt=ropeCnt;
	}

	public String toString(){
		String msg;
		msg=				   "	Rubbed string instruments\n\n" +
							   "		Dimensions\n"+
							   "Width: " + width + "\n" +
							   "Height: " + height + "\n" +
							   "Width: " + length + "\n" +
							   "Arc length: " + arcLength + "\n\n"+
							   "		ID Reference\n"+
							   "ID: " + iD + "\n\n" +
							   "		  State\n"+
							   "State: " + state + "\n\n" +
							   "		Provider\n"+
							   "Provier name: " + provider.getName() + "\n" +
							   "Provier phone number: " + provider.getPhone() + "\n" +
							   "Provier adress: " + provider.getAdress() + "\n\n" +
							   "		Characteristics\n" +
							   "Rope quantity: " + ropeCnt + "\n\n";
		return msg;
	}
}
