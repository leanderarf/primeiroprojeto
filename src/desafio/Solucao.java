package desafio;

import java.util.Scanner;

public class Solucao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;
        String menu = """
                ** Digite sua opção
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair""";

        System.out.println("******************************************" +
                "\n\nNome do cliente: " + nome +
                "\nTipo Conta: " + tipoConta +
                "\nSaldo atual: " + saldo +
                "\n\n******************************************");

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();

                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar transferência");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();

                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4){
                System.out.println("Opção inválida");
            }
        }
    }
}
