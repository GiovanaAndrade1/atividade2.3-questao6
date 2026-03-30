/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade2.questao6;
import ControleEstoque.Controle;
import ControleEstoque.Produto;
import java.util.Scanner;
/**
 *
 * @author Giovana
 */
public class Atividade23Questao6 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        Controle controle = new Controle();
        int opcao;

        do {
            System.out.println("\n===== CONTROLE DE ESTOQUE =====");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Atualizar Quantidade");
            System.out.println("4. Listar Produtos");
            System.out.println("5. Buscar Produto");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o codigo do produto: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a quantidade em estoque: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();
                    Produto novoProduto = new Produto(codigo, nome, quantidade);
                    controle.adicionarProduto(novoProduto);
                    break;

                case 2:
                    System.out.print("Digite o codigo do produto a ser removido: ");
                    String codigoRemover = scanner.nextLine();
                    controle.removerProduto(codigoRemover);
                    break;

                case 3:
                    System.out.print("Digite o codigo do produto: ");
                    String codigoAtualizar = scanner.nextLine();
                    System.out.print("Digite a nova quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    scanner.nextLine();
                    controle.atualizarQuantidade(codigoAtualizar, novaQuantidade);
                    break;

                case 4:
                    System.out.println("\n--- Produtos em Estoque ---");
                    controle.listarProdutos();
                    break;

                case 5:
                    System.out.print("Digite o codigo do produto: ");
                    String codigoBuscar = scanner.nextLine();
                    Produto encontrado = controle.buscarProduto(codigoBuscar);
                    if (encontrado != null) {
                        System.out.println("Produto encontrado: " + encontrado);
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
