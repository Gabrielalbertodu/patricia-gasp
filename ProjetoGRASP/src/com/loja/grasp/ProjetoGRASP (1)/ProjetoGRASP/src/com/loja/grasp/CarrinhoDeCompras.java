package com.loja.grasp;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens = new ArrayList<>();
    public void adicionarItem(Produto produto, int quantidade) {
        Item novoItem = new Item(produto, quantidade);
        this.itens.add(novoItem);
        System.out.println("'" + produto.getNome() + "' adicionado ao carrinho.");
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
