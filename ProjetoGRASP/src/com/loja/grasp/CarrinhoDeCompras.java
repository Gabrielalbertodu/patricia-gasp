package com.loja.grasp;

import java.util.ArrayList;
import java.util.List;

/*
 * PADRAO GRASP APLICADO: Creator
 * Qual padrao foi utilizado?
 * Creator
 * Em qual classe/metodo foi aplicado?
 * Classe CarrinhoDeCompras
 * Metodo adicionarItem()
 * Por que essa escolha atende ao principio GRASP?
 * A classe CarrinhoDeCompras contem e agrega objetos da classe Item.
 * Ela possui os dados necessarios (produto e quantidade) para criar um Item.
 * Segundo o principio Creator, a classe que contem ou agrega objetos deve
 * ser responsavel por cria-los, mantendo alta coesao e baixo acoplamento.
 */
public class CarrinhoDeCompras {
    private List<Item> itens = new ArrayList<>();

    public void adicionarItem(Produto produto, int quantidade) {
        Item novoItem = new Item(produto, quantidade);
        this.itens.add(novoItem);
        System.out.println("Produto adicionado ao carrinho.");
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Item item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public List<Item> getItens() {
        return itens;
    }
}
