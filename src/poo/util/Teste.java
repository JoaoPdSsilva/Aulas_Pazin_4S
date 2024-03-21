
package poo.util;

import poo.modelo.loja.Cliente;
import poo.modelo.loja.Produto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Teste {

    public static void main(String args[]){
        //var cliente = new Cliente();
        //cliente.setDataNascimento("28/06/2004");
        //System.out.println(cliente.calcularIdade());

        var prod1 = new Produto();
        prod1.setEstoqueMinimo(10);
        prod1.setQtdeEstoque(50);
        prod1.setNome("Produto 1");

        var prod2 = new Produto();
        prod2.setEstoqueMinimo(3);
        prod2.setQtdeEstoque(2);
        prod2.setNome("Produto 2");

        var prod3 = new Produto();
        prod3.setEstoqueMinimo(10);
        prod3.setQtdeEstoque(8);
        prod3.setNome("Produto 3");

        List<Produto> listaEstoque = new ArrayList<>();
        listaEstoque.add(prod1);
        listaEstoque.add(prod2);
        listaEstoque.add(prod3);

        List<Produto> criticos = prod1.pesquisarProdutosBaixoEstoque(listaEstoque);
        for (Produto p: criticos) {
            System.out.println(p.getNome());
        }

    }
}
