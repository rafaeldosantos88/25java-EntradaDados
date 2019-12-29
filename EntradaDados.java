package EntradaDados;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in); //Declaramos variavel scanner

String x; // variavel string x
int y;
double z;
x= sc.next();  //Comando de Entrada de dados,vai recebe sc.next  ,vai permitir que digite uma palavraque vai ser armaznado dentro da variavel x
y= sc.nextInt();
z= sc.nextDouble();
System.out.println("Dados digitados: ");

System.out.println(x);
System.out.println(y);
System.out.println(z);




sc.close(); //Encerra o recurso o qual criamos
	}

}
