package desafio;

import java.util.Scanner;

public class Desafio {

    static Scanner leitor = new Scanner(System.in);

    public static void menu(double saldo){
        int opcao = 0;

        do {

            System.out.println("""
                    \nOperações 
                                    
                    1 - Consultar saldo
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                                    
                    Digite a opção desejada: 
                    """);
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    consultarSaldo(saldo);
                    break;
                case 2:
                    depositarValor(saldo);
                    break;
                case 3:
                    transferirValor(saldo);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente");
                    break;
            }
        }while(opcao != 0);
    }

    public static void consultarSaldo(double saldo) {
        System.out.printf("O saldo atual é de: %.2f\n", saldo);
        menu(saldo);
    }

    public static void depositarValor(double saldo) {
        double deposito = 0;

        System.out.println("Digite o valor a ser depositado: ");
        deposito = leitor.nextDouble();

        saldo += deposito;
        System.out.printf("Saldo atualizado: %.2f", saldo);

        menu(saldo);
    }

    public static void transferirValor(double saldo) {
        double transferencia = 0;

        System.out.println("Digite o valor a ser transferido: ");
        transferencia = leitor.nextDouble();

        saldo -= transferencia;
        System.out.printf("Saldo atualizado: %.2f", saldo);

        menu(saldo);
    }

    public static void main(String[] args) {
        double saldo = 1000;

        System.out.printf("""
                **************************************************************
                Dados iniciais do cliente:
                
                Nome: Leander Arf
                Tipo conta: Corrente
                Saldo inicial: R$ %.2f
                **************************************************************
                """, saldo);
        menu(saldo);
    }
}
