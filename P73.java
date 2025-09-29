//P73.java
import java.util.*;
public class P73{
	public static void main (String [] args){
		Scanner entrada;
		int x, y, z = 2;
		entrada = new Scanner (System.in);
		System.out.println("Introdueix un nombre enter");
		x = entrada.nextInt();
		y = x/z;
		System.out.println("El resultat de l'operació és: "+y);
	}
}
