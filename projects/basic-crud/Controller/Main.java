package Controller;

import Service.ProdutoService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProdutoService produtoService = new ProdutoService();

        boolean running = true;
        while (running) {
            System.out.println("------------------------");
            System.out.println("CRUD BÁSICO");
            System.out.println("1 - Criar produto");
            System.out.println("2 - Listar");
            System.out.println("3 - Atualizar produto");
            System.out.println("4 - Deletar produto");
            System.out.println("5 - Exit");
            System.out.println("------------------------");
            try {
                int option = Integer.parseInt(scanner.nextLine());

                switch (option) {

                    case 1 -> {
                        System.out.println("Nome do produto: ");
                        produtoService.create(scanner.nextLine());
                        System.out.println("Produto criado.");

                    }

                    case 2 -> {
                        var lista = produtoService.read();
                        if (lista.isEmpty()) {
                            System.out.println("Nenhum produto na lista.");
                        } else {
                            int i = 1;
                            for (var produto : lista) {
                                System.out.println(i++ + " - " + produto.getName());
                            }
                        }
                    }

                    case 3 -> {
                        System.out.println("Índice: ");

                        int index = Integer.parseInt(scanner.nextLine()) - 1;

                        System.out.println("Nome do produto: ");
                        String name = scanner.nextLine();

                        produtoService.update(index, name);
                        System.out.println("produto atualizado.");

                    }

                    case 4 -> {
                        System.out.println("Índice para deletar: ");
                        int index = Integer.parseInt(scanner.nextLine()) - 1;
                        produtoService.delete(index);
                    }

                    case 5 -> running = false;

                    default -> {
                        System.out.println("Invalid option");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite apenas números!");
            }
        }
    }
}