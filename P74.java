//P74.java
//Podeu veure un example d'ús del mètode sqrt() de Java a:
//https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html
import java.util.*;
public class P74{
	public static void main (String [] arg){
		Scanner entrada;
		double z, b, c = 2;
		entrada = new Scanner (System.in);
		System.out.println("x?");
		z = entrada.nextInt();
		b = Math.sqrt (z+4)*c;
		System.out.println(b);
	}
}
