import java.sql.SQLOutput;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Conta Corrente";
        double saldo = 1599.99;
        int opçao = 0;

        System.out.println("******************");
        System.out.println("\nNome do Cliente:  " + nome);
        System.out.println("Tipó conta: " + tipoConta);
        System.out.println("Saldo atual:  " + saldo);
        System.out.println("\n****************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                """;
        Scanner leitura = new Scanner(System.in);

        while (opçao !=4)  {
            System.out.println(menu);
            opçao = leitura.nextInt();

            if (opçao == 1) {
                System.out.println("o saldo atualizado é  " + saldo);
            } else if (opçao == 2) {
                System.out.println("Qual o valor que deseja transferir");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência");
                } else {
                    saldo = saldo - valor;
                    System.out.println("Novo saldo" + saldo);

                }
            } else if (opçao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo" + saldo);
            } else if (opçao !=4) {
                System.out.println("Opção inválida");
            }
        }
    }
}
