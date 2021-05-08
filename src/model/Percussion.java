package model;

public abstract class Percussion extends Instrument{
	
	protected String material;
	
	public Percussion( double width, double height, double length,String iD,State state,Provider provider,String material){
		super(width,height,length,iD,state,provider);
		this.material=material;
	}
}
