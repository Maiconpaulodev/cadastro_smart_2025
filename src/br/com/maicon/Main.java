package br.com.maicon;


import java.util.ArrayList;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;




public class Main {

    public static void main(String[] args) {
    	
    	Locale.setDefault(Locale.US);
    	
    	Scanner scanner = new Scanner(System.in);
    	ArrayList<Pessoas> list = new ArrayList<Pessoas>();
    	
    	int opcao;
    	
    	do {
			
    		System.out.println("===== SISTEMA DE CADASTRO =====");
    		System.out.println("1 - Cadastro de usuario: ");
    		System.out.println("2 - Listar usuario: ");
    		System.out.println("3 - Excluir usuario: ");
    		System.out.println("4 - Editar usuario: ");
    		System.out.println("0 - Sair do sistema: ");
    		
opcao = scanner.nextInt();
scanner.nextLine();

switch (opcao) {
case 1: 
	System.out.print("Qual seu nome completo? ");
	String nome = scanner.nextLine();
	
	System.out.print("Qual seu email de contato? ");
	String email = scanner.nextLine();
	
	System.out.print("Qual a sua idade? ");
	int idade = scanner.nextInt();
	scanner.nextLine();
	
	System.out.print("Qual sua altura? ");
	double altura = scanner.nextDouble();
	scanner.nextLine();
	
	Pessoas pessoas = new Pessoas(nome, email, idade, altura);
	
	list.add(pessoas);
	
	System.out.printf("Usuario %s cadastrado com sucesso\n.", nome);
	
	break;
	
case 2 :
	if (list.isEmpty()) {
		System.out.println("Não ha usuario cadastrado no banco de dados.\n");
		break;
	}
	
	for (Pessoas i : list) {
		System.out.println(i);
	}
	break;
	
case 3 :
	
	if (list.isEmpty()) {
		System.out.println("Não ha usuarios para excluir.\n");
		break;
	}
	
	System.out.print("Digite o nome do usuario que deseja deletar:\n ");
	String nomeExcluir = scanner.nextLine();
	
	boolean testar = false;
	
	for ( int i = 0; i < list.size(); i++) {
		if (list.get(i).getNome().equalsIgnoreCase(nomeExcluir)) {
			list.remove(i);
			System.out.printf("Usuario %s removido com sucesso.\n", nomeExcluir);
			testar = true;
					break;
		}
	}
	 if (!testar) {
		 System.out.println("Nome não encontrado no banco de dados.\n");
		
	}
	 break;
	 
case 4 : 
	
if (list.isEmpty()) {
	System.out.println("Não ha usuarios no banco de dados\n.");
	break;
}


System.out.println("Digite o nome que deseja  editar:");
String nomeEditar =  scanner.nextLine();

for ( int i = 0 ; i < list.size(); i++) {
	if (list.get(i).getNome().equalsIgnoreCase(nomeEditar)) {
		
		System.out.println("Digite o novo nome: ");
		String novoNome = scanner.nextLine();
		
		list.get(i).setNome(novoNome);
		System.out.println("Usuario alterado");
	}
}
	break;
	

	 
case 0 :
	System.out.println("Saindo do sistema, Ate mais!\n");
	
break;

default:
	System.out.println("Numero invalido");
}
  
    		
    		
    		
    		
    		
		} while (opcao !=0);




scanner.close();
    
    
       
    }
}
    
    