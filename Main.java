package com.mycompany.main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
  
        Carro Veiculo = new Carro();
        Scanner scanner = new Scanner(System.in);
        Veiculo.Acelerar(70);
        Veiculo.Freiar(20);
        Veiculo.Ano = 2005;
        Veiculo.Modelo = "Gol";
        Veiculo.Marca = "Volkswagen";
        
        int option;
        do {
            System.out.println("Olá, o que você deseja descobrir sobre o Carro?");
            System.out.println("Digite os números: 1-MODELO, 2-MARCA, 3-ANO");
            System.out.println("Digite 0 para sair");
        
            while (!scanner.hasNextInt()) {
                System.out.println("Digite um número inteiro:");
                scanner.next();
            }
        
            option = scanner.nextInt();
            System.out.println("Você digitou: " + option);
        
            switch(option) {
                case 1:
                    System.out.println("Modelo: " + Veiculo.Modelo);
                    break;
                case 2:
                    System.out.println("Marca: " + Veiculo.Marca);
                    break;
                case 3:
                    System.out.println("Ano: " + Veiculo.Ano);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        
        } while (option != 0);
        
        scanner.close();
    }
}
