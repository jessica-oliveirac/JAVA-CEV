public class Main
{
	public static void main(String[] args) {
	    float nota = 8.5f;
		System.out.println(" Sua nota é: " + nota);
	}
}

-----------------------------------------------
public class Main
{
	public static void main(String[] args) {
	    float nota = 8.5f;
		System.out.printf(" Sua nota é %.2f", nota);
	}
}

-----------------------------------------------
 
public class Main
{
	public static void main(String[] args) {
	    String nome = "Jéssica";
	    float nota = (float) 8.5;
		System.out.format("A nota da %s é %.2f \n", nome, nota);
	}
}

†***************************************
Entrada
package tipoprimitivo;
import java.util.Scanner;
public class TipoPrimmitivo {
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    System.out.print("Nome do aluno: ");
	    String nome = teclado.nextLine();
	    System.out.print("Nota do aluno: ");
	    float nota = teclado.nextFloat();
		System.out.format("A nota da %s é %.1f \n", nome, nota);
	}
}
-----------------------------------------------Conversão------------------------------------------
package testetipos;
public TesteTipos {
	public static void main(String[] args) {
	    int idade = 30;
	    String valor = Integer.toString(idade);
		System.out.println(valor);
	}
}

	
-----------------------------------------------

package testetipos;
public TesteTipos {
	public static void main(String[] args) {
		String valor = "30";
		int idade = Integer.parseInt(valor);
		System.out.println(idade);
	}
}
-----------------------------------------------
package testetipos;
public TesteTipos {
	public static void main(String[] args) {
		String valor = "30.5";
		float idade = Float.parseFloat(valor);
		System.out.println(idade);
	}
}
