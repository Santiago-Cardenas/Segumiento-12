package model;

public class String_2 extends StringInstrument{

	private int ropeCnt;
	private int fretCnt;
	private String hasCase;

	public String_2( double width, double height, double length,String iD,State state,Provider provider,int ropeCnt,int fretCnt,String hasCase){
		super(width,height,length,iD,state,provider);
		this.ropeCnt=ropeCnt;
		this.fretCnt=fretCnt;
		this.hasCase=hasCase;
	}

	public String toString(){
		String msg;
		msg=			   	   "	Plucked string instruments\n\n" +
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
							   "Rope quantity: " + ropeCnt + "\n" +
							   "Fret quantity: " + fretCnt + "\n" +
							   "Case included: " + hasCase + "\n\n";
		return msg;
	}
}
