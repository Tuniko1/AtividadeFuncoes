package principal;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Menu();
	}
	
	static void Menu() {
		
		int opcao;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a opção desejada:");
		System.out.println("1 - Programa - Cambio de moedas");
		System.out.println("2 - Programa - Soma de argumentos");
		System.out.println("3 - Programa - Produto ");
		opcao = sc.nextInt();
		
		switch (opcao){
		
		case 1:
			cotacaoDolarReal();
			
			break;
		case 2:
			System.out.println("A soma dos argumentos 10+10+10 é: "+argumentosSoma(10,10,10));
		
			break;
		case 3:
			
			
			System.out.println("O preço final do produto é: "+produtoFinal(0,0));
			
			break;
		default: System.out.println("Opção inválida!");
		sc.close();
		}
	}
	// Programa 1 
	static void cotacaoDolarReal() {
		
	    double cotacaoDolar = 5.042;
	    double valor, valorConvertido;
	    int opcao;
	   	  
	    Scanner sc = new Scanner(System.in);
	     
	    System.out.println("Programa - Conversão de Dólar e Real\n");
	    System.out.println("Escolha 1 ou 2:");
	    System.out.println("\n1. Converter de Real para Dólar  R$ --> US$");
	    System.out.println("2. Converter de Dólar para Real US$ --> R$ ");
	    opcao = sc.nextInt();
	    
	    switch(opcao) {
	    case 1:
	    	
	    	System.out.print("Valor a ser convertido: R$");
	    	valor = sc.nextDouble();
	    	valorConvertido = valor / cotacaoDolar; 
	    	System.out.println("\n1. Conversão de Real para Dólar: "+valorConvertido+"\n");
	    	
	    	break;
	    case 2:
	    	System.out.print("Valor a ser convertido: US$");
	    	valor = sc.nextDouble();
	    	valorConvertido = valor * cotacaoDolar;
	    	System.out.println ("2. Conversão de Dólar para Real: "+valorConvertido+"\n");
	    	
	    	break;
		default: System.out.println("Opção invalida");
	    sc.close();	
	
	    }
	}
	static int argumentosSoma(int arg1,int arg2,int arg3) {
		return (arg1 + arg2 + arg3);
		
	}
	static double produtoFinal(double valorDoProduto, double lucroProduto) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor do produto: ");
		valorDoProduto = sc.nextDouble();
		
		System.out.println("Insira o valor da taxa de lucro a ser aplicada: %");
		lucroProduto = sc.nextDouble();
		
		lucroProduto /=  100;
		lucroProduto *= valorDoProduto;
		lucroProduto += valorDoProduto ;
		return lucroProduto;
		
		
	}
	

}
