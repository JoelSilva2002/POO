package encomendas;

import java.util.List;
import java.util.Scanner;

public class SistemaPorteiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Porteiro porteiro = new Porteiro();

        while (true) {
            System.out.println("\nSistema do Porteiro:");
            System.out.println("1. Consultar encomendas");
            System.out.println("2. Retirar encomendas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            if (opcao == 1) {
                System.out.print("Número do apartamento: ");
                int numeroApto = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha
                List<Encomenda> encomendas = porteiro.consultarEncomendas(numeroApto);
                if (encomendas.isEmpty()) {
                    System.out.println("Nenhuma encomenda encontrada para o apartamento " + numeroApto);
                } else {
                    System.out.println("Encomendas do apartamento " + numeroApto + ":");
                    for (Encomenda e : encomendas) {
                        System.out.println("- " + e.getDescricao());
                    }
                }
            } else if (opcao == 2) {
                System.out.print("Número do apartamento: ");
                int numeroApto = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha
                porteiro.entregarEncomendas(numeroApto);
            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
