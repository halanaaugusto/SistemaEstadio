package br.senai.sp.estadio;

import java.util.Scanner;

public class Estadio {
    public static void main(String[] args) {
        /** Declarar as Variáveis */
        String nome;
        int idade, corCamisa;

        /** Instancia Scanner */
        Scanner teclado = new Scanner(System.in);

        /** Coletar dados */
        System.out.println("---------------------------------");
        System.out.print("Qual é o seu nome: ");
        nome = teclado.next();
        System.out.print("Qual é a sua idade: ");
        idade = teclado.nextInt();
        System.out.print("Qual a cor da sua camisa: [1- Azul, 2- Branca, 3- Vermelha, 4- Preta, 5- Amarela, 6- Verde]: ");
        corCamisa = teclado.nextInt();

        switch (corCamisa){
            case 1:
                System.out.println("Arquibancada A");
            break;
            case 2:
                System.out.println("Arquibancada B");
                break;
            case 3:
                System.out.println("Arquibancada C");
                break;
            case 4:
                System.out.println("Arquibancada D");
                break;
            case 5:
                System.out.println("Arquibancada E");
                break;
            case 6:
                System.out.println("Arquibancada F");
                break;
            default:
                System.out.println("Cor de camisa inválida. Entrada não permitida!");
        }

    }
}
