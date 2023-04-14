package trabalho2.service.Cliente;

import trabalho2.entity.Cliente;

import java.util.ArrayList;

public interface CrudCliente {
    public void adicionar(Cliente cliente);
    public void ler(int id);
    public void atualizar(Cliente cliente);
    public void deletar(int id);
}
