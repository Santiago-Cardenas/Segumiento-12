package model;

public class Shop {

	private Percussion_1 percussion1;
	private Percussion_2 percussion2;
	private Wind wind;
	private String_1 string1;
	private String_2 string2;
	private String_3 string3;

	private Provider provider1=new Provider("La 14","5542610","Calle 8L 19-54");
	private Provider provider2=new Provider("La 15","666488","Calle 7A 19-34");
	private Provider provider3=new Provider("La 16","420155","Calle 40B 61-10");

	public Shop (){

	}

		public void percussion_1(){
			Percussion_1 percussion1= new Percussion_1(70,14,32,"A003689",State.ON_DISPLAY,provider2,"Marmol");
			System.out.println(percussion1.toString());
		}

		public void percussion_2(){
			Extern_Element element= new Extern_Element(1,2,1,"Metal",2);
			
			Percussion_2 percussion2= new Percussion_2(41,10,30,"A00366221",State.STORED,provider3,"Metal",element);
			System.out.println(percussion2.toString());
		}

		public void wind(){
			Wind wind= new Wind(70,14,32,"A00335460",State.ON_DISPLAY,provider1,Material.WOOD);
			System.out.println(wind.toString());
		}

		public void string_1(){
			string1= new String_1(50,25,15,"A00372312",State.ON_DISPLAY,provider1,2,1);
			System.out.println(string1.toString());
		}

		public void string_2(){
			string2= new String_2(69,24,1,"A00372933",State.STORED,provider2,4,6,"Yes");
			System.out.println(string2.toString());
		}

		public void string_3(){
			Box box= new Box(2,3,5);
			Keyboard keyboard= new Keyboard(9,6,2,"Acero inoxidable",5);

			double addWidth= box.getWidth() + keyboard.getWidth();
			double addHeight= box.getHeight() + keyboard.getHeight();
			double addLength= box.getLength() + keyboard.getLength();

			string3= new String_3(addWidth,addHeight,addLength,"A00372897",State.STORED,provider3,Orientation.VERTICAL);
			System.out.println(string3.toString());
		}
}
