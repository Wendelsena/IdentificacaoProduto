import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int id1, id2, quantidade;
        double valor1, valor2;

        System.out.println("calculo de valor");
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nquantidade: ");
        quantidade = sc.nextInt();
        
        if (quantidade == 1) {
        	
        	System.out.println("Qual a id do produto?: ");
        	id1 = sc.nextInt();
        	
        	System.out.printf("Qual o valor do produto %d:", id1);
        	valor1 = sc.nextDouble();
        	
        	System.out.println("\nO total a pagar será: R$ " + (quantidade * valor1));
        	
        	System.out.println("\nObrigado por me usar! :D");
        	
        } 
        
        if (quantidade == 2) {
        	
        	System.out.println("Qual a id do produto 1?: ");
        	id1 = sc.nextInt();
        	
        	System.out.println("Qual a id do produto 2?: ");
        	id2 = sc.nextInt();
        	
        	System.out.printf("Qual o valor do produto %d:", id1);
        	valor1 = sc.nextDouble();
        	
        	System.out.printf("Qual o valor do produto %d:", id2);
        	valor2 = sc.nextDouble();
        	
        	System.out.println("\nO total a pagar será: R$ " + (valor1 + valor2));
        	
        	System.out.println("\nObrigado por me usar! :D");
        	
        } else {
        	
        	System.out.println("Digite entre 1 e 2, por favor :(");
        }
        	
        	sc.close();
        	
        }
        
    }


