package ui;
import java.util.Scanner;
import model.Shop;

public class Main{

	private Scanner sc;

	private Shop shop;

		public Main(){
			sc= new Scanner(System.in);
		}
	
		public static void main (String [] args) {
			Main main=new Main();
			main.showMenu();
		}

		public void showMenu(){
			shop= new Shop();
			int menu=0;	// Variable that helps selecting a certain option from the menu
			
			do {
				System.out.println("		Menu\n"+
								   "1) Select from what type of instrument you wish to get its information\n" +
								   "0) Exit\n");
			
			
				menu=sc.nextInt();
				sc.nextLine();
			
				switch (menu){

					case 1:
					showMenuInstruments();
					break;

					default:
					System.out.println("\n");
					break;


				}

			} while(menu!=0);
		}
		
		public void showMenuInstruments(){
			int menu=0;	// Variable that helps selecting a certain option from the menu
			
			do {
				System.out.println("		Menu\n"+
								   "1) Percussion Instruments\n" +
								   "2) Wind Instruments\n" +
								   "3) String Instruments\n" +
								   "0) Return");
			
			
				menu=sc.nextInt();
				sc.nextLine();
			
				switch (menu){

					case 1:
					showMenuPercussion();
					break;
					
					case 2:
					shop.wind();
					break;

					case 3:
					showMenuString();
					break;
					default:
					System.out.println("\n");
					break;
				}

			} while(menu!=0);
		}

		public void showMenuPercussion() {
			int menu=0;	// Variable that helps selecting a certain option from the menu
			
			do {
				System.out.println("		Menu\n"+
								   "1) Sound produced by being shaken, rubbed or struck\n" +
								   "2) Sound produced by being rubbed or percussed\n" +
								   "0) Return\n");
			
			
				menu=sc.nextInt();
				sc.nextLine();
			
				switch (menu){

					case 1:
					shop.percussion_1();
					break;

					case 2:
					shop.percussion_2();
					break;

					default:
					System.out.println("\n");
					break;
				}

			} while(menu!=0);
		}

		public void showMenuString() {
			int menu=0;	// Variable that helps selecting a certain option from the menu
			
			do {
				System.out.println("		Menu\n"+
								   "1) Rubbed string instruments\n" +
								   "2) Plucked string instruments\n" +
								   "3) Percussed string instruments\n" +
								   "0) Return\n");
			
			
				menu=sc.nextInt();
				sc.nextLine();
			
				switch (menu){

					case 1:
					shop.string_1();
					break;

					case 2:
					shop.string_2();
					break;

					case 3:
					shop.string_3();
					break;

					default:
					System.out.println("\n");
					break;
				}

			} while(menu!=0);
		}		
}
