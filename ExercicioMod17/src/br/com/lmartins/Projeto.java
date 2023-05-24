package br.com.lmartins;

import java.util.List;
import java.util.Scanner;

public class Projeto {

    public static void main(String[] args) {
        CarroLista<Carro> lista = new CarroLista<>();
        try (Scanner scanner = new Scanner(System.in)) {
			boolean adicionar = true;
				
				System.out.println("Criar lista de carros.");
				
			while (adicionar) {
			    System.out.println("\nCarro Esportivo(digite 1) ou carro SUV(digite 2).\nPara parar digite 3:");
			    int escolher = scanner.nextInt();
			    scanner.nextLine(); // Limpar linha

			    switch (escolher) {
			        case 1:
			            System.out.println("\nDigite a marca/modelo do carro esportivo:\n");
			            String Espt = scanner.nextLine();
			            CarroEspt carroEspt = new CarroEspt(Espt);
			            lista.adicionarCarro(carroEspt);
			            break;
			        case 2:
			            System.out.println("\nDigite a marca/modelo do carro SUV:\n");
			            String SUV = scanner.nextLine();
			            CarroSUV carroSUV = new CarroSUV(SUV);
			            lista.adicionarCarro(carroSUV);
			            break;
			        case 3:
			            adicionar = false;
			            break;
			        default:
			            System.out.println("Escolha inválida.");
			            break;
			    }
			    
			}
		}

        List<Carro> carros = lista.obterCarros();

        System.out.println("\nCarros Esportivos:");
        int contaEspt = 1;
        for (Carro carro : carros) {
            if (carro.getClass().equals(CarroEspt.class)) {
            	System.out.println(contaEspt + ": " + carro.getMarca());
                contaEspt++;
            }
        }



        System.out.println("\nCarros SUV:");
        int contaSUV = 1;
        for (Carro carro : carros) {
            if (carro.getClass().equals(CarroSUV.class)) {
                System.out.println(contaSUV + ": " + carro.getMarca());
                contaSUV++;
            }
        }   
    }
}
















//import java.util.List;
//import java.util.Scanner;
//
//public class Projeto {
//
//	public static void main(String[] args) {
//    	CarroLista<Carro> lista = new CarroLista<>();
//    	
//    	Scanner scanner = new Scanner(System.in);
//        
//    	System.out.println("Carro Esportivo(digite 1) ou SUV(digite 2):");
//        String Marca = scanner.nextLine();
//        
//    
//        CarroEspt SPT = new CarroEspt("Mustang");
//        
//        
//        CarroSUV SUV = new CarroSUV("Cayenne");
//        
//        lista.adicionarCarro(SPT);
//        lista.adicionarCarro(SUV);
//        
//        List<Carro> carros = lista.obterCarros();
//        for (Carro carro : carros) {
//            System.out.println(carro.getMarca());
//        }
//    }
//}