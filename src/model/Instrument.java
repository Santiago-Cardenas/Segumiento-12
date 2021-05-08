package model;

public abstract class Instrument{

	protected double width;
	protected double height;
	protected double length;
	protected String iD;

	protected State state;
	protected Provider provider;

	public Instrument( double width, double height, double length,String iD,State state,Provider provider){
		this.width=width;
		this.height=height;
		this.length=length;
		this.iD=iD;
		this.state=state;
		this.provider=provider;
	}

}
