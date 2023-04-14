package trabalho2;

import trabalho2.entity.Produto;
import trabalho2.service.Cliente.CrudClientePF;
import trabalho2.service.Cliente.CrudClientePJ;
import trabalho2.service.Item.CrudItem;
import trabalho2.service.Produto.CrudProduto;
import trabalho2.service.venda.CrudVenda;

public class PrincipalSimples {

    public static void main(String[] args) {
        CrudClientePF crudClientePF = new CrudClientePF();
        crudClientePF.popularClientePF();

        CrudClientePJ crudClientePJ = new CrudClientePJ();
        crudClientePJ.popularClientePJ();

        CrudProduto crudProduto = new CrudProduto();
        crudProduto.popularLista();

        System.out.println("#########################################################################################################");
        System.out.println("TESTE DE - Nao permitir cadastrar um produto sem nome e preço unitario de venda ");
        System.out.println("TESTE DE - sem nome e sem preço");
        Produto produto1 = new Produto();
        produto1.setId(333);
        crudProduto.adicionar(produto1);
        System.out.println("TESTE DE - sem preço");
        produto1.setNome("Paçoquinha");
        crudProduto.adicionar(produto1);
        System.out.println("TESTE DE - sem nome");
        produto1.setNome("");
        produto1.setPreco(99.99);
        System.out.println("#########################################################################################################");


        crudClientePF.listarTodos();
        crudClientePJ.listarTodos();
        crudProduto.listarTodos();

        CrudItem crudItem = new CrudItem();
        crudItem.popularLista(crudProduto);
        crudItem.listarTodos();

        CrudVenda crudVenda = new CrudVenda();
        crudVenda.popularLista(crudClientePJ,crudProduto,crudItem);
        crudVenda.listarTodos();

        crudVenda.calcularTotal(1);
        crudVenda.listarTodos();

        crudVenda.recibo(1);
    }
}
