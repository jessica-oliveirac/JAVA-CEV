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

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    System.out.print("Nome do aluno: ");
	    String nome = teclado.nextLine();
	    System.out.print("Nota do aluno: ");
	    float nota = teclado.nextFloat();
		System.out.format("A nota da %s é %.1f \n", nome, nota);
	}
}
-----------------------------------------------

-----------------------------------------------


-----------------------------------------------

