package EjereciciosJava;

public class java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6, b=2, c=3;
		
		int rest=0 , rest2=0, rest3=0, rest4=0, rest5=0;
		
		rest= (a*c) % c; // (6*3 = 18) (18%3 = 0)
		rest2= (a*b) / c; // (6*2 = 12) (12/3 = 4)
		rest3= (c % b) + c * b; // (3 % 2 = 1) (3 * 2 = 6) (1 + 6 = 7)
		rest4= a % (a * b *c / (b+c)); // ( 6 * 2 = 12) (12 * 3= 36) (2 + 3=5) (36/5=7) (7%6=0)
		rest5= b * b + c - b*(a % b); // 
		System.out.println(rest);
		System.out.println(rest2);
		System.out.println(rest3);
		System.out.println(rest4);
		System.out.println(rest5);
		
	}

}
