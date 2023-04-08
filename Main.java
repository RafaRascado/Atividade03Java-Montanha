// Faça um Programa que peça dois números e imprima a soma.

import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    
    System.out.println("Informe o primeiro número: ");
    Scanner teclado = new Scanner(System.in);
    double primeiroNumero = teclado.nextDouble();

    System.out.println("Informe o primeiro número: ");
    Scanner segundoTeclado = new Scanner(System.in);
    double segundoNumero = segundoTeclado.nextDouble();

    double soma = primeiroNumero + segundoNumero; 

    System.out.println("O resultado da soma dos dois número é: " + soma);
  }
}