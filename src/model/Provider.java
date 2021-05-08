package model;

public class Provider {

	private String name;
	private String phone;
	private String adress;
	
	public Provider(String name,String phone,String adress){
		this.name=name;
		this.phone=phone;
		this.adress=adress;
	}	

	public String getName(){
		return name;
	}

	public String getPhone(){
		return phone;
	}

	public String getAdress(){
		return adress;
	}
		
}
