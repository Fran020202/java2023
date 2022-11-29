package Practica2;

public class Java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5, b=19, c=24, d=24, f=30, g=5;
		
		if (a > 2) {
			System.out.println("A es mayor que 2 y es " +a);
		}
		
		if(b <= 25 && b > 5 ) {
			System.out.println("b es menor que 25 y mayor que 5 es " +b);
		}
		
		if(c > 6 && c == d) {
			System.out.println("c es mayor que 6 y igual que d y es " +c);
			
		}
		
		if (f > a && f > b && f > c) {
			System.out.println("f es mayor que a,b y c y es " +f);
			
		}
		
		if (g == 3 || g == 4 || g == 5) {
			System.out.println("g es igual a 3 o 4 o 5 y es " +g);
		}
	}

}
