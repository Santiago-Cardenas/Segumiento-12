package model;

public class Extern_Element{

	private int cnt;
	private double width;
	private double height;
	private double length;
	private String material;

	public Extern_Element( double width, double height, double length,String material,int cnt){
		this.width=width;
		this.height=height;
		this.length=length;
		this.material=material;
		this.cnt=cnt;
	}

	public Extern_Element( double width, double height, double length){
		this.width=width;
		this.height=height;
		this.length=length;
	}

	public double getWidth(){
		return width;
	}

	public double getHeight(){
		return height;
	}

	public double getLength(){
		return length;
	}

	public String getMaterial(){
		return material;
	}

	public int getCnt(){
		return cnt;
	}


}
