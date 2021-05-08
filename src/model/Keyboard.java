package model;

public class Keyboard extends Extern_Element{

	private int fretCnt;
	private String material;

	public Keyboard( double width, double height, double length, String material, int fretCnt){
		super(width,height,length);
		this.material=material;
		this.fretCnt=fretCnt;
	}
}