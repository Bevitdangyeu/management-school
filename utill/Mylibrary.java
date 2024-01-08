package MyLibrary.utill;
	import java.util.Scanner;

	public class Mylibrary {
		private static Scanner sc=new Scanner(System.in);
		public static int inputInteger(String messenger, String error, int x,int y) {
			int a;
			while(true){
				try {
					do {
					System.out.print(messenger);
					a=Integer.parseInt(sc.nextLine());
					if(a<x||a>y) {
						System.out.println("Giá trị vừa nhập vượt quá miền cho phép");
					}
					}while(a<x||a>y);
					return a;
				}catch(Exception e) {
					System.out.print(error);
				}
			}
		}
		public static Double inputDouble(String messenger, String error, double x, double y ) {
			double a;
			while(true) {
				
				try {
					do {
					System.out.print( messenger);
					a=Double.parseDouble(sc.nextLine());
					if(a<x||a>y) {
						System.out.println("Giá trị vừa nhập vượt quá miền cho phép ");
					}
				
					}while(a<x||a>y);
					return a;
				}catch( Exception e) {
					System.out.println(error);
				}
			
		}
	
		}	
		
	}		

	


